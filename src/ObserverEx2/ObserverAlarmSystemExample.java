package ObserverEx2;

public class ObserverAlarmSystemExample {
    public static void main(String[] args) {
        //Observer Ex2 Alarm System
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();

    }
}
