package classesandobjects;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // classname objectname/reference = new clasname();

//        Rectangle rect = new Rectangle();




        Dog dog1 = new Dog();
        dog1.setName("Max");

        dog1.setBreed("German Shephards");

//        String name = dog1.sayName();
//        System.out.println("Hi! My name is "+name);
//
//        String breed = dog1.sayBreed("Lab");
//        System.out.println("My breed is "+breed);


        dog1.bark();
        dog1.eat();
        dog1.play();


//        Dog dog2 = new Dog("Bulldog");
//
//        dog2.name = "Stone";
//        dog2.color = "Black";
//
//        name = dog2.sayName();
//        System.out.println("Hi! My name is "+name);
//
//        breed = dog2.sayBreed("Dane");
//        System.out.println("My breed is "+breed);
//
//        dog2.play();
//        dog2.eat();
//        dog2.bark();
//
//        Scanner scan = new Scanner(System.in);
//        String username_name = scan.nextLine();
//
//        Random rand = new Random();




    }
}
