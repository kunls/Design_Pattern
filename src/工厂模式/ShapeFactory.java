package 工厂模式;

public class ShapeFactory{

    public Shape createShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
