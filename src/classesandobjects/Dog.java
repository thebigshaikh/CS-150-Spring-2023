package classesandobjects;

public class Dog {
    //Properties

    private String breed;
    private String color;
    private String sex;
    private int weight;
    private String name;


    //Setters and Getters

//
//    Dog(String dog_name, String breed, String sex, int weight, String color){
//        this.name = dog_name;
//        this.breed = breed;
//        this.sex = sex;
//        this.weight = weight;
//        this.color = color;
//
//        //German Shephard
//    }
//
//    Dog(String name){
//        this.name = name;
//    }
//
//    Dog(){
//
//    }


    //Behaviors

    void bark(){
        System.out.println("Woof woof");
    }

    void eat(){
        System.out.println(" burpppp");
    }

    void play(){
        System.out.println("I am playing");
    }

    String getName(){

        return this.name;
    }

    String getBreed(String brd){
        return this.breed;
    }

    String getColor(){
        return this.color;
    }

    String getSex(){
        return this.sex;
    }

    int getWeight(){
        return this.weight;
    }

    void setName(String name){
        this.name = name;
    }

    void setBreed(String breed){
        this.breed = breed;
    }

    void setColor(String color){
        this.color = color;
    }

}
