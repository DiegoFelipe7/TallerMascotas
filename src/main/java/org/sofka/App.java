package org.sofka;

import org.sofka.clases.Cat;
import org.sofka.clases.Dog;
import org.sofka.utils.Messague;
import org.sofka.utils.MyScanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static  Messague messague =  Messague.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    public static void main( String[] args )
    {
        dog();
        cat();
    }
    public static void dog(){
        messague.showGetName();
        String name=scanner.getString();
        messague.showGetAge();
        int age = scanner.getInteger();
        messague.showGetColor();
        String color = scanner.getString();
        messague.showGetBreed();
        String breed = scanner.getString();
        Dog dogs = new Dog(name,age,color,breed);
        String sound=dogs.animalSound();
        messague.showSound(sound);
        int ageReal=dogs.realAge(age);
        messague.showAge(ageReal);
        String action = dogs.actionPets();
        messague.showAction(action);
    }

    public static void cat(){
        messague.showGetName();
        String name= scanner.getString();
        messague.showGetAge();
        int age = scanner.getInteger();
        messague.showGetColor();
        String color = scanner.getString();
        messague.showGetNumberOfClaws();
        int number = scanner.getInteger();
        Cat cat = new Cat(name,age,color,number);
        String sound = cat.animalSound();
        messague.showSound(sound);
        int ageReal=cat.realAge(age);
        messague.showAge(ageReal);
        String action=cat.actionPets();
        messague.showAction(action);
    }

}
