package com.inqoo.controltower;

import java.util.Set;

import static com.inqoo.controltower.MessageLevel.*;

public class Main {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower("Alpha");

        tower.addReceiver(new PlaneJacek());
        tower.addReceiver(new PlaneLukasz());
        tower.addReceiver(new PlaneAnia());
        tower.addReceiver(new PlanePrzemek());

        tower.sendMessageToAll(Message.WEATHER.send("Jest cieplo"), INFO);
        tower.sendMessageToAll(Message.TECHNICAL.send("Pas trzeci w remoncie"), WARNING);

        Set<MessageReceiver> planes = tower.getReceivers();
        for (MessageReceiver plane : planes) {
            System.out.println(plane.getName() + ":");
            System.out.println(plane.getMessages());
        }

    }
}
