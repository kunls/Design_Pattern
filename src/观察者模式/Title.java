package 观察者模式;

import java.util.Observable;

public class Title extends Observable {
    private int dataA=1;
    private int dataB=2;
    private int dataC=3;

    public void change() {
        setChanged();
        notifyObservers();
    }

    public void dataChange(int a,int b,int c) {
        dataA=a;
        dataB=b;
        dataC=c;
        change();
    }

    public int getDataA() {
        return dataA;
    }

    public void setDataA(int dataA) {
        this.dataA = dataA;
    }

    public int getDataB() {
        return dataB;
    }

    public void setDataB(int dataB) {
        this.dataB = dataB;
    }

    public int getDataC() {
        return dataC;
    }

    public void setDataC(int dataC) {
        this.dataC = dataC;
    }
}
