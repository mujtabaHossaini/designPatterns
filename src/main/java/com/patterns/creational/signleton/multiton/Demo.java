package com.patterns.creational.signleton.multiton;

import com.patterns.creational.signleton.multiton.enums.Subsystem;
import com.patterns.creational.signleton.multiton.model.Printer;

public class Demo {

    public static void main(String[] args) {


        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer aux2 = Printer.get(Subsystem.AUXILIARY);



    }


}
