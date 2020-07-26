package com.inqoo.controltower;

public enum Message {
    WEATHER {
        public String send(String message) {
            return "[POGODA] ";
        }
    };

    abstract public String send(String message);
}
