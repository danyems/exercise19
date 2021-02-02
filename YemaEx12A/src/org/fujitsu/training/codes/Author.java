package org.fujitsu.training.codes;

import org.fujitsu.training.codes.exceptions.AuthorException;

public class Author {
	
	private String name;
	private String email;
	private Character gender;
	private static int counter;
	
	private Author() {
		// TODO Auto-generated constructor stub
	}
	
	public static Author getInstance() throws AuthorException, Exception{
		if (counter < 5) {
			counter++;
			return new Author();
		} else {
			throw new AuthorException();
		}	
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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String info = new String(name + ", " + email + ", " + gender);
		return info;
	}

}
