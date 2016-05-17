package com.travel.controller;

import java.util.List;

import com.travel.model.*;
import com.travel.dao.*;

public class UserController {
	public List<User> viewUser() {
		return new UserDao().GetAllUser();
	}
}