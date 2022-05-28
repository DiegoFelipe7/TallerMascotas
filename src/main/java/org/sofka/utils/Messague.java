package org.sofka.utils;
import org.jboss.logging.Logger;

public class Messague {
    private static final Logger logger = Logger.getLogger(Messague.class);

    public static Messague getInstance() {
        return new Messague();
    }
    public void showGetName() {
        logger.info("enter your pet's name");
    }
    public void showGetAge() {
        logger.info("Enter your pet's age");
    }
    public void showGetColor() {
        logger.info("Enter your pet's color");
    }
    public void showGetBreed(){logger.info("enter your pet's breed ");}
    public void showGetNumberOfClaws() {
        logger.info("enter your cat's number of claws");
    }

    public void showSound(String sound){logger.info(("the sound of pets is "+sound));}
    public void showAction(String action){logger.info(("the sound of your pet is "+action));}
    public void showAge(int age){logger.info(("the age of the pets is"+age));}

}

