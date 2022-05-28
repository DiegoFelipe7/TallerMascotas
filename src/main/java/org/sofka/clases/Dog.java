package org.sofka.clases;
/**
 * This is the class cat that contains its attributes and an abstract method inherited from the class animal.
 * @author: Diego Felipe Munoz
 * @version: 1.0.0
 */
public class Dog extends Animals implements org.sofka.interfaz.Animals {
    private String breed;

    public Dog(String name, int age, String color , String breed) {
        super(name, age, color);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * return sound pets
     * @return  sound pets
     */
    @Override
    public String animalSound() {
        return "Gua Gua...";
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
        return "Dog wagging its tail";
    }

}
