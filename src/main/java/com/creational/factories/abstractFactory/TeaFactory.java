package com.creational.factories.abstractFactory;

import com.creational.factories.abstractFactory.contract.HotDrink;
import com.creational.factories.abstractFactory.contract.HotDrinkFactory;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}