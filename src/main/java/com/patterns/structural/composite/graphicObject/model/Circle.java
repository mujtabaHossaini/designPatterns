package com.patterns.structural.composite.graphicObject.model;

import lombok.Data;

@Data
public class Circle extends GraphicObject{

    public Circle(String color) {
        name = "Circle";
        this.color = color;
    }

}
