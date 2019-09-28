package com.thoughtworks.com;

public class Feet    {

    private int value;

    public Feet(int value) {
        this.value = value;

    }

    @Override
    public boolean equals(Object object) {

        return this.getClass()==((Feet) object).getClass();
    }
}
