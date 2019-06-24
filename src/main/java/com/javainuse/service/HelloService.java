package com.javainuse.service;

import com.javainuse.model.Message;

public class HelloService {

  private static final HelloService INSTANCE = new HelloService();

  public static HelloService getInstance() {
    return INSTANCE;
  }

  public void sayHello(Message message) {
    System.out.println("Message " + message.getMessage());
    System.out.println("Status " + message.getStatus());
  }

}