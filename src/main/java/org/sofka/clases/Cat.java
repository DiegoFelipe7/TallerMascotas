package org.sofka.clases;
/**
 * This is the class cat that contains its attributes and an abstract method inherited from the class animal.
 * @author: Diego Felipe Munoz
 * @version: 1.0.0
 */
public class Cat extends Animals implements org.sofka.interfaz.Animals {
    private int numberOfClaws;
    public Cat(String name, int age, String color , int numberOfClaws) {
        super(name, age, color);
    }

    public int getNumberOfClaws() {
        return numberOfClaws;
    }

    public void setNumberOfClaws(int numberOfClaws) {
        this.numberOfClaws = numberOfClaws;
    }
    /**
     * return sound pets
     * @return  sound pets
     */
    @Override
    public String animalSound() {
        return "Miau Miau";
    }
    /**
     * the sound of an animal returns
     * @param age receives the age of the pet
     */
    @Override
    public int realAge(int age) {
        return age*7;
    }
    /**
     * return action pets
     * @return  action pets
     */
    @Override
    public String actionPets() {
        return "cat hunting mice";
    }

}
