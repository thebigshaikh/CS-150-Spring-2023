

public class main_class {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setBreadth(5);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
    }
}
