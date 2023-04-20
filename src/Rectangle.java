public class Rectangle {

    private int length;
    private int breadth;

    int getLength(){
        return this.length;
    }
    int getBreadth(){
        return this.breadth;
    }

    void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    void setBreadth(int breadth){
        this.breadth = breadth;
    }


    double getArea(){
        return this.length * this.breadth;
    }

    int getPerimeter(){
        return 2*length + 2*breadth;
    }

}
