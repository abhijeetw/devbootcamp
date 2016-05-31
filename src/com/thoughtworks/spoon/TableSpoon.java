package com.thoughtworks.spoon;

public class TableSpoon extends Spoon{
    public TableSpoon()
    {
        QUANTITY = 3;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }


}
