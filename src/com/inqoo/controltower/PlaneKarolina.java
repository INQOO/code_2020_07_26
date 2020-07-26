package com.inqoo.controltower;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static com.inqoo.controltower.MessageLevel.FATAL;

public class PlaneKarolina implements MessageReceiver {

    List <String> messages = new ArrayList<>();

    @Override
    public String getName() {
        return "Karolina";
    }
    @Override
    public void saveMessage(String message, MessageLevel level) {
        messages.add(message);
        if(FATAL.equals(level)){
            System.out.println(message);
    }}
    @Override
    public List<String> getMessages() {
        return messages;
    }
}

