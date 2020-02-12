package com.dsm.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsm.dto.PostDTO;
import com.dsm.model.Post;
import com.dsm.repository.PostRepository;
import com.dsm.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
    private PostRepository postRepository;

    public void createOrUpdatePost(PostDTO postDto) {
    	Post post = convertDtoToModel(postDto);
        postRepository.save(post);
    }

    public List<PostDTO> getAllPost() {
          List<Post> list = postRepository.findAll();
          List<PostDTO> postList = list.stream()
              .map(PostDTO::new)
              .collect(Collectors.toCollection(ArrayList::new));
          return postList;
    }

    public void deletePost(Long id) {
          postRepository.deleteById(id);
    }

    public PostDTO editPost(Long id) {
    	Post post = postRepository.getOne(id);
          return convertModelToDTO(post);
    }

    private Post convertDtoToModel(PostDTO postDto) {
    	Post post = new Post();
          if (postDto.getId() != null) {
               post.setId(postDto.getId());
          }
          post.setTitle(postDto.getTitle());
          post.setShortDescription(postDto.getShortDescription());
          post.setDescription(postDto.getDescription());
          post.setMeta(postDto.getMeta());
          post.setUrlSlug(postDto.getUrlSlug());
          post.setPublished(postDto.getPublished());
          post.setPostedOn(postDto.getPostedOn());
          post.setModified(postDto.getModified());
          post.setCategory(postDto.getCategory());
          return post;
    }

    private PostDTO convertModelToDTO(Post post) {
    	PostDTO postDTO = new PostDTO();
          postDTO.setId(post.getId());
          postDTO.setTitle(post.getTitle());
          postDTO.setShortDescription(post.getShortDescription());
          postDTO.setDescription(post.getDescription());
          postDTO.setMeta(post.getMeta());
          postDTO.setUrlSlug(post.getUrlSlug());
          postDTO.setPublished(post.getPublished());
          postDTO.setPostedOn(post.getPostedOn());
          postDTO.setModified(post.getModified());
          postDTO.setCategory(post.getCategory());
          return postDTO;
    }
}