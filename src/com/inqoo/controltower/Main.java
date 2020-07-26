package com.inqoo.controltower;

import static com.inqoo.controltower.MessageLevel.FATAL;

public class Main {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower("Alpha");
        tower.sendMessageToAll(Message.WEATHER.send("Temperatura na minusie"), FATAL);
    }
}
