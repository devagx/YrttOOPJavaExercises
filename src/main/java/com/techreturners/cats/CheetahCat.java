package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    public CheetahCat() {
        super();
        this.setSetting("wild");
        this.setAverageHeight(999);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
