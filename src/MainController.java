import java.util.Scanner;

public class MainController {
   //The main Robot
   
   private RobotButton rbtButton;
 
   public MainController(){/*empty intentionally*/}
   
   public static void main(String[]args){
      MainController rbtctlr = new MainController();
      rbtctlr.init(true, 0, 0, 0);//Initializes without anything
      rbtctlr.Execute();
   }
   
   public void init(boolean on, int speed, int direction, int rotation){
      rbtButton = new RobotButton(on, speed, direction, rotation);
   }
   
   public void Execute(){
      rbtButton.Execute();
   }
   
}