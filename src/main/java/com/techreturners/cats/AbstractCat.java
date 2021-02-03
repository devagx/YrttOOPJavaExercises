package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    private boolean isAsleep;

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
