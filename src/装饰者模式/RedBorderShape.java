package 装饰者模式;

import javax.swing.*;

public class RedBorderShape extends DecoratedShape{
    Shape shape;
    public RedBorderShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Red Border Color");
    }
}
