package com.inqoo.controltower;

import java.util.List;

interface MessageReceiver {
    void saveMessage(String message, MessageLevel level);

    List<String> getMessages();

}
