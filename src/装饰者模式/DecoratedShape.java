package 装饰者模式;

public abstract class DecoratedShape implements Shape{
    Shape shape;
    public DecoratedShape(Shape shape) {
        this.shape=shape;
    }

    public void draw() {
        shape.draw();
    }
}
