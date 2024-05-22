package com.ejemplos.websocket.dto;

public class HelloMessageDTO {

	  private String name;

	  public HelloMessageDTO() {
	  }

	  public HelloMessageDTO(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
}