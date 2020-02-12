package com.dsm.service;

import java.util.List;

import com.dsm.dto.PostDTO;

public interface PostService {
	
    public void createOrUpdatePost(PostDTO postDTO);
    
    public List<PostDTO> getAllPost();

    public void deletePost(Long id);

    public PostDTO editPost(Long id);
}
