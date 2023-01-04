package State1;

public class StopState implements State {

   public void doAction(ContextState1 context) {
      System.out.println("Player is in stop state");
      context.setState(this);	
   }

   public String toString(){
      return "Stop State";
   }
}