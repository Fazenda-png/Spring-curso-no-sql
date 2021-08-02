package com.example.workshopmongo.dto;

import java.io.Serializable;
import java.util.Optional;

import com.example.workshopmongo.domain.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Id;
	private String name;
	private String email;

	public UserDTO() {

	}

	public UserDTO(User obj) {
		Id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public UserDTO(Optional<User> obj) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
