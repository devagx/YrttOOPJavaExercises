package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public DomesticCat() {
        super("domestic",23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    //Polymorphism overriding the usual eat function
    public String eat(String randomComment) {
        return this.eat() + " " + randomComment;
    }
}
