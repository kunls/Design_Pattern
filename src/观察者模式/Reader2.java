package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Reader2 implements Observer {
    Observable observable;
    private int dataA;
    private int dataC;

    public Reader2(Observable ob){
        observable=ob;
        ob.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Title) {
            Title title = (Title) o;
            dataA=title.getDataA();
            dataC=title.getDataC();
            System.out.println("My data are changed!");
            System.out.println(dataA+"   "+dataC);
        }
    }
}
