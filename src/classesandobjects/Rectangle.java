package classesandobjects;

public class Rectangle {

    //Properties/fields

    private int length;
    private int width;

    //Constructor

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }

    //Methods/behaviors
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }
}

class MainRectangle
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 2);
        System.out.println(rect.getArea());
        rect.setWidth(200);
        System.out.println(rect.getArea());



        Rectangle rect1 = new Rectangle(5, 21);


    }

}
