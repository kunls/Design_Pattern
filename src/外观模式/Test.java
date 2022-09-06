package 外观模式;

/**
 * 将复杂操作包装成一个对象,对调用者暴露一个操作接口,调用者只new一个对象即可通过调用方法实现相应功能
 * 从而实现了调用者与被调用者的解耦
 */
public class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
