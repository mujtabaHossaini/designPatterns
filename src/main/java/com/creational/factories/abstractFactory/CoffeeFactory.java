package com.creational.factories.abstractFactory;

import com.creational.factories.abstractFactory.contract.HotDrink;
import com.creational.factories.abstractFactory.contract.HotDrinkFactory;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {

        System.out.println(
                "Grind some beans, boil water, pour "
                        + amount + " ml, add cream and sugar, enjoy!"
        );

        return new Coffee();
    }
}
