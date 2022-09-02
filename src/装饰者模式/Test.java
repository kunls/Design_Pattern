package 装饰者模式;

public class Test {
    public static void main(String[] args) {
        DecoratedShape redCircle = new RedBorderShape(new Circle());
        DecoratedShape redRectangle = new RedBorderShape(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
