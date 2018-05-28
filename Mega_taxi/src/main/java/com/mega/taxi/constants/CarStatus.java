package com.mega.taxi.constants;

public enum CarStatus {
    ROAD("road"), WAIT("wait"), AWAY("away"), REPAIR("repair");

    private String value;

    CarStatus(String str){
        value = str;
    }

    @Override
    public String toString() {
        return value;
    }
}
