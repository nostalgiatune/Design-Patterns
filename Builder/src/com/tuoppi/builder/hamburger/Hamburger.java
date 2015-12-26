package com.tuoppi.builder.hamburger;

public class Hamburger {
    
    private Bun bun;
    private Cheese cheese;
    private Beef beef;
    private Salad salad;

    public Bun getBun() {
        return bun;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Beef getBeef() {
        return beef;
    }

    public Salad getSalad() {
        return salad;
    }

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setBeef(Beef beef) {
        this.beef = beef;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return bun.getName() + ", " + beef.getName() + ", " + cheese.getName() +
                ", " + salad.getName();
    }
    
}