package com.inqoo.controltower;

public enum Message {
    WEATHER {
        public String send(String message) {
            return "[WEATHER] " + message;
        }
    },
    TECHNICAL {
        public String send(String message) {
            return "[TECHNICAL] " + message;
        }
    };


    abstract public String send(String message);
}
