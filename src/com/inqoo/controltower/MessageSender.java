package com.inqoo.controltower;

interface MessageSender {

    void addReceiver(MessageReceiver messageReceiver);
    void sendMessageToAll(String message, MessageLevel level);
}
