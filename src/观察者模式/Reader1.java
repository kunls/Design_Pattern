package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Reader1 implements Observer {
    Observable observable;
    private int dataA;
    private int dataB;

    public Reader1(Observable ob){
        observable=ob;
        ob.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Title) {
            Title title = (Title) o;
            dataA=title.getDataA();
            dataB=title.getDataB();
            System.out.println("My data are changed!");
            System.out.println(dataA+"   "+dataB);
        }
    }
}
