package MediatorEx1;

public class ApnaChatExample {
    public static void main(String[] args) {

        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setname("Nurcan Alkis");
        u1.sendMsg("Hi Nurcan! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Fatih Bayhan");
        u2.sendMsg("I am Fine ! You tell?");

    }
}
