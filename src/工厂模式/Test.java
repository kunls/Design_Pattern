package 工厂模式;

public class Test {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("Circle");
        Shape square = factory.createShape("Square");
        circle.draw();
        square.draw();
    }
}
