package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int averageHeight;

    public int getAverageHeight(){
        return averageHeight;
    }

    public void setAverageHeight(int averageHeight) {
        this.averageHeight = averageHeight;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getSetting() {
        return this.setting;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public AbstractCat() {
        this.isAsleep = false;
    }

    public void goToSleep() {
        this.isAsleep = true;
    }

    public void wakeUp() {
        this.isAsleep = false;
    }

}
