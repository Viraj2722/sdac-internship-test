package Interface;

interface Appliance {
	public static final int a=10;
    public abstract void turnOn();
    public abstract void turnOff();
}

class Fan implements Appliance {
    public void turnOn() {
        System.out.println("Fan is turning on.");
    }

    public void turnOff() {
        System.out.println("Fan is turning off.");
    }
}

public class Inf {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(Fan.a);
        fan.turnOn();
        fan.turnOff();
    }
}

