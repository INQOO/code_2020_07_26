package com.inqoo.controltower;

import java.util.ArrayList;
import java.util.List;

public class PlaneLukasz implements MessageReceiver {

    List<String> messages = new ArrayList<>();

    @Override
    public String getName() {
        return "Lukasz";
    }

    @Override
    public void saveMessage(String message, MessageLevel level) {
        if (MessageLevel.FATAL.equals(level)){
            System.out.println(message);
        }
            messages.add(message);

    }

    @Override
    public List<String> getMessages() {
        return messages;
    }
}
