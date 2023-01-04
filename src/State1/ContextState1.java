package State1;

public class ContextState1 {
   private State state;

   public ContextState1(){
      state = null;
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}