package com.dsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsm.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}