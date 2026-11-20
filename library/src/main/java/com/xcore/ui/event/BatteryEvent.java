package com.xcore.ui.event;

/**
 * 电池报警
 */
public class BatteryEvent {

    private int type; //0是正常，1是低电量
    private float battery;
    private float temp;
    private int cpu;

    public BatteryEvent(int type, float battery,float temp,int cpu) {
        this.type = type;
        this.battery = battery;
        this.temp = temp;
        this.cpu = cpu;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
}
