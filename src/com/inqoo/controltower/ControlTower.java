package com.inqoo.controltower;

import java.util.HashSet;
import java.util.Set;

class ControlTower implements MessageSender {

    private String name;
    private Set<MessageReceiver> receivers = new HashSet<>();

    public ControlTower(String name) {
        this.name = name;
        System.out.println(name + " tower created.");
    }

    public void addReceiver(MessageReceiver receiver) {
        System.out.println("New receiver: " + receiver.getName());
        receivers.add(receiver);
    }

    @Override
    public void sendMessageToAll(String message, MessageLevel level) {
        for (MessageReceiver receiver : receivers) {
            receiver.saveMessage(message, level);
        }

    }

    public String getName() {
        return name;
    }
}
