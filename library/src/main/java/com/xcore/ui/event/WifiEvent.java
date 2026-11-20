package com.xcore.ui.event;

public class WifiEvent {

    private int state;

    public WifiEvent(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
