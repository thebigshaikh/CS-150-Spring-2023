import java.util.Scanner;
//import java.util.
class Dog {
    // Attributes
    String name;
    String breed;
    String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Methods/behaviours
    public void run(){
        System.out.println(" Hey hoooman, I am running! ");
    }

    public void bark(){
        System.out.println(" Hey hooma, woooof wooof");
    }

    public void speak(){
        String name = null;
        System.out.println("Hey Hooman! My name is "+this.name);
    }
}

