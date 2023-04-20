public class Humans {
    String Name;
    int height;
    int weight;
    int age;
    String gender;
    Dog d;

    public Dog getD() {
        return d;
    }

    public void setDog(Dog d) {
        this.d = d;
    }

    Humans(String name, int h, int w){
        this.Name = name;
        this.height = h;
        this.weight = w;
        gender = "Not Given";
    }

    public Humans() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDogInformation(){
        System.out.println(this.Name + " has a Dog with name and breed as ");
        System.out.println(this.d.name);
        System.out.println(this.d.breed);
    }





    public void sayName(){
//        String Name;
        System.out.println("My name is "+this.Name);
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void sayHeight(){
        System.out.println("My height is "+this.height);
    }

    public static void main(String[] args) {
        // ClassName objectreference = new Classname();




        Dog dg = new Dog();
        dg.setName("Bobby");
        dg.setBreed("Lab");

        Humans human1 = new Humans("Bruno", 6, 20);

        human1.sayName();
        human1.sayHeight();
        human1.setDog(dg);


//        System.out.println("Gender is " + human1.getGender());
        human1.printDogInformation();


        Dog d2 = new Dog();
        d2.setName("Tina");
        d2.setBreed("Golden Retriever");

        Humans human2 = new Humans();
        human2.setDog(d2);

        human2.setName("Tom");
        human2.setAge(22);
        human2.setHeight(6);

        human2.sayName();
        human2.sayHeight();

        human2.printDogInformation();



    }
}
