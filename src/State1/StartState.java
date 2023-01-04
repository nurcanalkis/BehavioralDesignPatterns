package State1;

public class StartState implements State {

   public void doAction(ContextState1 context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   public String toString(){
      return "Start State";
   }
}