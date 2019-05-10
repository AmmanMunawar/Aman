package com.ebricks.shape.model;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class),
        @JsonSubTypes.Type(value = Rectangle.class, name = "Rectangle")

})

public class Shape{

    public void draw(){
        System.out.println("Shape draw function");
    }

}