package com.kefet.controller;

public interface UserService {
	
	public abstract User signup(SignupForm signupForm);

	public abstract User findOne(long userId);

	public abstract void update(long userId, UserEditForm userEditForm);

}
