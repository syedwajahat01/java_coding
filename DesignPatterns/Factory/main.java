package DesignPatterns.Factory;

public class main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 =  sf.getShape("circle");
        s1.draw();

        Shape s2 = sf.getShape("square");
        s2.draw();

    }
}
