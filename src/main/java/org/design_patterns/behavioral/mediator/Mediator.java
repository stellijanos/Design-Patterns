package org.design_patterns.behavioral.mediator;

import java.util.ArrayList;

public class Mediator {
    ArrayList<ChatUser> users = new ArrayList<>();

    public Mediator addUser(ChatUser user) {
        users.add(user);
        return this;
    }
    public void sendMessage(String message, ChatUser source) {
        for(ChatUser u: users) {
            if (u != source) {
                u.receiveMessage(message);
            }
        }
    }

}
