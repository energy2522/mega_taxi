package com.mega.taxi.constants;

public enum OrderStatus {
    WAIT("wait"), PROCESS("process"), DONE("done");

    private String value;

    OrderStatus(String str) {
        value = str;
    }

    @Override
    public String toString() {
        return value;
    }
}
