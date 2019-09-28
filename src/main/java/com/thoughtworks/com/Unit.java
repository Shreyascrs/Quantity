package com.thoughtworks.com;

public enum Unit {
    Feet {
        @Override
        double convertToBase(int value) {
            return value * 12;
        }
    },

    Inch {
        @Override
        double convertToBase(int value) {
            return value * 1;
        }
    };

    abstract double convertToBase(int value);
}
