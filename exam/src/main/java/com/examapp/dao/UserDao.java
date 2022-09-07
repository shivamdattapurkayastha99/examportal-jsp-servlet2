package com.examapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.examapp.entities.Users;

public class UserDao {
	
	Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}
	public boolean saveUser(Users user) {
		boolean flag=false;
		try {
			String query="insert into users(userName,userEmail,password) values(?,?,?)";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getPassword());
			psmt.executeUpdate();
			flag=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public Users getUserByEmailPass(String email,String password) {
		Users user=null;
		try {
			String query="select * from users where userEmail=? and password=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, email);
			psmt.setString(2, password);
			ResultSet rs=psmt.executeQuery();
			if(rs.next()) {
				user=new Users();
				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("userName"));
				user.setEmail(rs.getString("userEmail"));
				user.setPassword(rs.getString("password"));
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
