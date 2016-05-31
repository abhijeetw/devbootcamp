package com.thoughtworks.spoon;

public class TeaSpoon extends Spoon{

    public TeaSpoon()
    {
        QUANTITY = 1;
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

