package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {

    private BigDecimal price;

    public Pig() {
        super("Pig", "cink!");
        price = new BigDecimal("300.00");
    }


    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
