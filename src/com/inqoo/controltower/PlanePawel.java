package com.inqoo.controltower;

import java.util.ArrayList;
import java.util.List;

import static com.inqoo.controltower.MessageLevel.FATAL;

public class PlanePawel implements MessageReceiver {

    List<String> messages = new ArrayList<>();






    @Override
    public String getName() {
        return null;
    }

    @Override
    public void saveMessage(String message, MessageLevel level) {
        messages.add(message);
        if (level.equals(FATAL)){
            System.out.println(message);
        }



    }

    @Override
    public List<String> getMessages() {
        return messages;
    }
}
