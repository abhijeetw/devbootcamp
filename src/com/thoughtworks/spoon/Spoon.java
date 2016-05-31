package com.thoughtworks.spoon;

/**
 * Created by abhijeetshelake on 5/31/16.
 */
public abstract class Spoon {

    public int QUANTITY = 1;

    public boolean is(int count, Spoon spoon){
        return this.QUANTITY == count * spoon.QUANTITY;
    }
}
