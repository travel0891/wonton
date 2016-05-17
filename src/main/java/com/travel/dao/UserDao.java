package com.travel.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.travel.model.*;

public class UserDao {
	public List<User> GetAllUser() {
		List<User> userList = new ArrayList<User>();

		User temp1 = new User();
		temp1.setIntId(1);
		temp1.setAccount("abc");
		temp1.setPassword("123");
		temp1.setCreateTime(new Date());
		userList.add(temp1);

		User temp2 = new User();
		temp2.setIntId(2);
		temp2.setAccount("def");
		temp2.setPassword("456");
		temp2.setCreateTime(new Date());
		userList.add(temp2);

		User temp3 = new User();
		temp3.setIntId(3);
		temp3.setAccount("ghj");
		temp3.setPassword("789");
		temp3.setCreateTime(new Date());
		userList.add(temp3);

		return userList;
	}
}
