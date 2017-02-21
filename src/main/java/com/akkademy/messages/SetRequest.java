package com.akkademy.messages;

public class SetRequest {
    private final String key;
    private final Object val;

    public SetRequest(String key, Object val) {
        this.key = key;
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public Object getVal() {
        return val;
    }
}
