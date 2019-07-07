import objectdraw.*;
import java.awt.*;
//In this program, player can join poidts that is where he/she clicks. 
public class ConnectPoints extends WindowController {
    private Location zeroPoint,firstClick,secondClick;
    //zeroPoint is the starting point, firstClick is the point clicked at first,
    //secondClick is the point clicked from second times. 
    private Line zeroLine;
    //coneected the starting point to secondClick.
    
    //Identify zeroPoint.
   @Override public void begin(){
      zeroPoint=new Location(0,0);
    }
   
    //When the mouse is clicked after that,
    //note its location and erase the line from the starting point to it.
   @Override public void onMousePress(Location point){
      secondClick=point;
      zeroLine=new Line (zeroPoint,secondClick,canvas);
      new Line(firstClick,secondClick,canvas); 
      zeroLine.removeFromCanvas();
    }   
    
    //When the mouse is clicked for the first time,
    //note its location.
   @Override public void onMouseRelease (Location point){
      firstClick=point;
    }
    }
    

