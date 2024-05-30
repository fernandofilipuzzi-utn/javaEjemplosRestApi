package com.ejemplos.restapiauthtokenjwt.dto;

public class LoginRequestDTO {
	
	private String username;
	private String userpassword;
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	
	public String getUserPassword()
	{
		return userpassword;
	}
	public void setUserPassword(String valor)
	{
		this.userpassword=valor;
	}
}
