package org.sofka.clases;
/**
 * This is the animal class that contains its attributes and an abstract method
 * @author: Diego Felipe Munoz
 * @version: 1.0.0
 */
public abstract class Animals {
    private String name;
    private int age;
    private String color;
    /**
     * Constructor with the attributes of the animal class
     * @param (name , age ,color)
     */
    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * the sound of an animal returns
     * @return string.
     */
    public abstract String animalSound();
}
