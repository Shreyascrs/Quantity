package com.thoughtworks.com;

import com.thoughtworks.com.units.length.Feet;
import com.thoughtworks.com.units.length.Inch;
import com.thoughtworks.com.units.length.Yard;
import com.thoughtworks.com.units.temperature.Celcius;
import com.thoughtworks.com.units.temperature.Farenheit;
import com.thoughtworks.com.units.volume.Gallon;
import com.thoughtworks.com.units.volume.Liter;
import com.thoughtworks.com.units.weight.Gram;
import com.thoughtworks.com.units.weight.Kg;

public class QuantityFactory {

    public static Quantity createFeet(double value) {
        return new Quantity(value, new Feet());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    public static Quantity createKg(double value) {
        return new Quantity(value, new Kg());
    }

    public static Quantity createGram(double value) {
        return new Quantity(value, new Gram());
    }

    public static NonAddableQuantity createCelcius(double value) {
        return new NonAddableQuantity(value, new Celcius());
    }

    public static NonAddableQuantity createFarenheit(double value) {
        return new NonAddableQuantity(value, new Farenheit());
    }
}
