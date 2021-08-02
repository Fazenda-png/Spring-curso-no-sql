package com.example.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.repository.PostRepository;
import com.example.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Optional<Post> findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Object not found");
		}
		return obj;
	}

}
