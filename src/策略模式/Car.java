package 策略模式;

public class Car implements Transportation{
    @Override
    public void goOut() {
        System.out.println("I'm go out by car!");
    }
}
