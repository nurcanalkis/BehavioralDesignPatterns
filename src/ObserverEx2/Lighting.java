package ObserverEx2;
//observer
public class Lighting implements AlarmListener{

    @Override
    public void alarm() {
        System.out.println("lights up");
    }
}
