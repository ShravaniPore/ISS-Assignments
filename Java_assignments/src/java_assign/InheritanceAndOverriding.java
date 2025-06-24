package java_assign;

import java.time.LocalTime;

public class InheritanceAndOverriding {
    public static void main(String[] args) {
        System.out.println("This is the superclass.");
        Clock clock=new Clock();
        clock.showTime();

        System.out.println("\n\nThis is subclass AlarmClock inherited from Clock.");
        AlarmClock alarmClock=new AlarmClock();
        alarmClock.showTime();
        alarmClock.setAlarm();

        System.out.println("\n\nThis is subclass smartWatch inherited from AlarmClock.");
        SmartWatch smartWatch=new SmartWatch();
        smartWatch.setAlarm();
        smartWatch.showTime();
        smartWatch.recordHeartBeat();

        System.out.println("\n\nThis is subclass RingWatch also inherited from Clock.");
        RingWatch ringWatch=new RingWatch();
        ringWatch.showTime();
        ringWatch.turnTrackerOn();

    }
}
class Clock{
    public void showTime(){
        LocalTime time= LocalTime.now();
        System.out.println("\nThis is originally clock class method.");
        System.out.println(time);

    }
}
//single inheritance
class AlarmClock extends Clock{
    public void setAlarm(){
        System.out.println("This is originally an AlarmClock class method.");
        System.out.println("You can now set the alarm.");
    }
}

//Multilevel inheritance
class SmartWatch extends AlarmClock{
    public void recordHeartBeat(){
        System.out.println("\nThis is originally a SmartWatch class method.");
        System.out.println("Heartbeat is being recorded.");
    }
    @Override
    public void setAlarm(){
//        Runtime polymorphism
        System.out.println("This is overridden method.");
        System.out.println("You can now set the alarm and change the alarm ringtone.");
    }

}

//Hierarchical inheritance
class RingWatch extends Clock{
    public void turnTrackerOn(){
        System.out.println("\n This is originally a RingWatch class method.");
        System.out.println("GPS tracker is now on.");
    }


}
