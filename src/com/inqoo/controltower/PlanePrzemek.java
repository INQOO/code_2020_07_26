package com.inqoo.controltower;

import java.util.ArrayList;
import java.util.List;

class PlanePrzemek implements MessageReceiver {



    List<String> messages = new ArrayList<>();

    @Override
    public String getName() {
        return "Samolot xD";
    }

    @Override
    public void saveMessage(String message, MessageLevel level) {
        messages.add(message);

        if (MessageLevel.FATAL.equals(level)){
            System.out.println(message);
        }

    }

    @Override
    public List<String> getMessages() {
        return messages;
    }

}


