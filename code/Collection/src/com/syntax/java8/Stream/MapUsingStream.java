package com.syntax.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapUsingStream {

	public static void main(String[] args) {
		
		List<User> list = getUsers();
		
		List<UserDto> DtoList  = new ArrayList<UserDto>();
		
		for(User u : list) {
			DtoList.add(new UserDto(u.getId(), u.getUsername(), u.getEmail()));
		}
		
		DtoList.forEach(System.out::println);
		
		System.out.println();
		
//		List<UserDto> list2 = list.stream().map(new Function<User, UserDto>() {
//
//			@Override
//			public UserDto apply(User u) {
//				return new UserDto(u.getId(), u.getUsername(), u.getEmail());
//			}
//			
//		}).collect(Collectors.toList());
		
		
		List<UserDto> list2 = list.stream().map((User u)-> {
			return new UserDto(u.getId(), u.getUsername(), u.getEmail());
		}).collect(Collectors.toList());
		
        list2.forEach(System.out::println);
        
        Optional<UserDto> p = list.stream().map((User u)-> {
			return new UserDto(u.getId(), u.getUsername(), u.getEmail());
		}).findFirst();
        
        System.out.println(p.get());
        
	}
	
	private static List<User> getUsers(){
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User(1, "yarra", "TEja@2020", "yraviteja@gmail.com"));
		users.add(new User(2, "ravi", "ravi@2020", "ravi@gmail.com"));
		users.add(new User(3, "teja", "jagu@2020", "jagu@gmail.com"));
		users.add(new User(4, "ragnar", "ragnar@2020", "ragnar@gmail.com"));
		
		return users;
	}

}


class User{
	
	private int id;
	private String username;
	private String password;
	private String email;
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
}


class UserDto{
	
	private int id;
	private String username;
	private String email;
	
	public UserDto(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
	
}