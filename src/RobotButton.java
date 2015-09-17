public class RobotButton {
   private Robot rbt;
   private boolean on;
   private int spd, dir, rot;
   public RobotButton(boolean state, int speed, int direction, int rotation){
      on = state;
      spd = speed;
      dir = direction;
      rot = rotation;
      rbt = new Robot();//only 1 option
   }
   
   public void setOn(boolean state){
      on = state;
   }
   public void setSpd(int speed){
     spd = speed;
   }
   public void setDir(int direction){
      dir = direction;
   }
   public void setRot(int rotation){
      rot = rotation;
   }
   public boolean getOn(){
      return on;
   }
   public int getSpd(){
      return spd;
   }
   public int getDir(){
      return dir;
   }
   public int getRot(){
      return rot;
   }
   public void Execute(){
      if(on)
         rbt.Set(Robot.on);
      else
         rbt.Set(0);
      if(spd == 0){
         rbt.Set(Robot.slow);
      }
      else
         rbt.Set(Robot.fast);
      if(dir == 0){
         rbt.Set(Robot.clockwise);
      }
      else
         rbt.Set(Robot.counter);
      switch(rot){
         case 0:
            rbt.Set(Robot.rotate90);
            break;
         case 1:
            rbt.Set(Robot.rotate180);
            break;
         case 2:
            rbt.Set(Robot.rotate270);
            break;
         case 3:
            rbt.Set(Robot.rotate360);
            break;
         default:
            System.out.print("invalid value");
            break;
      }
      rbt.Execute();
   }
   
}
