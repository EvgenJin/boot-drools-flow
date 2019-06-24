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

  public void action1(Message message) {
    System.out.println("Action 1 Status " + message.getStatus());
  }

  public void action2(Message message) {
    System.out.println("Action 2 Status " + message.getStatus());
  }

  public void action3(Message message) {
    System.out.println("Action 3 Status " + message.getStatus());
  }

}