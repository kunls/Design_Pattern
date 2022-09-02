package 策略模式;

public class Test {
    public static void main(String[] args) {
        Person xiaoming = new Person(new Bicycle());
        Person xiaohong = new Person(new Car());
        Person xiaolan = new Person(new Shop());
        xiaoming.goOutByWhat();
        xiaohong.goOutByWhat();
        xiaolan.goOutByWhat();
    }
}
