import objectdraw.*;
import java.awt.*;
//This program is that player clicks circles
//and gets score.
public class InvisibleCircle extends WindowController {
//The three circles that player clicks. 
  FilledOval l, m, s;
//The color of circles
  InvisibleColor lc, mc, sc;
//Coordinate of circles determined at random.
  private RandomDoubleGenerator dieX,dieY; 
  private double roll1,roll2,roll3,roll4,roll5,roll6;
//note a number of times clicked  
  private int Click;
//locations of circles
  private Location lPoint,mPoint,sPoint;
//indicate which mouse clicks the location of circles or not
  private int lClick,mClick,sClick;
//define the numbers of score
  private int score=0;
  private int finalScore;
  
//When mouse enter in the window, 
//delete the date of previous games,
//set up the circles.
  @Override public void onMouseEnter(Location point) {
    canvas.clear();
    Click=0;
    dieX=new RandomDoubleGenerator(0,canvas.getWidth());
    dieY=new RandomDoubleGenerator(0,canvas.getHeight());
    roll1=dieX.nextValue();
    roll2=dieY.nextValue();
    roll3=dieX.nextValue();
    roll4=dieY.nextValue();
    roll5=dieX.nextValue();
    roll6=dieY.nextValue();
    l = new FilledOval(roll1,roll2, 80, 80, canvas);
    m = new FilledOval(roll3,roll4, 45, 45, canvas);
    s = new FilledOval(roll5,roll6, 30, 30, canvas);
    lc = new InvisibleColor(Color.BLUE);
    mc = new InvisibleColor(Color.GREEN);
    sc = new InvisibleColor(Color.RED);
    // 最初は見えない
    l.setColor(lc);
    m.setColor(mc);
    s.setColor(sc);
  }

//When the button of mouse is pressed,
//indication the circles,
//and note a number of clicked times and whether touched the circles or not. 
  @Override public void onMousePress( Location point ) {
    // 本来の色が見えるようになる
    l.setColor(lc.visible());
    m.setColor(mc.visible());
    s.setColor(sc.visible());
    Click=Click+1;
    if(l.contains(point)){
        lPoint=point;
        lClick=1;
    }
    if(m.contains(point)){
        mPoint=point;
        mClick=1;
    }
    if(s.contains(point)){
        sPoint=point;
        sClick=1;
    }
    }

//When mouse button is released, circles are invisible.
  @Override public void onMouseRelease( Location point ) {
    // 色が見えなくなる
    l.setColor(lc.invisible());
    m.setColor(mc.invisible());
    s.setColor(sc.invisible());
    }

//When mouse exit from the window, circles are visible,
//and indicate scores player gets.    
  @Override public void onMouseExit(Location point){
    l.setColor(lc.visible());
    m.setColor(mc.visible());
    s.setColor(sc.visible());
    if(lClick==1 && mClick==1 && sClick==1){
         new Text ("You hit the all circled.",100,90,canvas);
         finalScore=300-5*Click;
    }
    if(lClick==0 && mClick==1 && sClick==1){
         new Text("You hit both large and middle circles.",100,90,canvas);
         finalScore=200-5*Click;
    }
    if(lClick==1 && mClick==0 &&sClick==1){
         new Text("You hit both large and small circles.",100,90,canvas);
         finalScore=150-5*Click;
    }
    if(lClick==1 && mClick==1 && sClick==0){
         new Text("You hit both large and middle circles.",100,90,canvas);
         finalScore=120-5*Click;
    }
    if(lClick==0 && mClick==0 && sClick==1){
         new Text ("You hit a small circle.",100,90,canvas);
         finalScore=100-5*Click;
    }
    if(lClick==0 && mClick==1 &&sClick==0){
         new Text("You hit a middle circle.",100,90,canvas);
         finalScore=50-5*Click;
    }  
       if(lClick==1 && mClick==0 && sClick==0){
         new Text ("You hit the large circle.",100,90,canvas);
         finalScore=30-5*Click;
    }
    if(lClick==0 && mClick==0 && sClick==0){
         new Text ("You hit no circles.",100,90,canvas);
         finalScore=0-5*Click;
    }
        
    new Text("You score is: "+finalScore+" with "+Click+" times.",100,100,canvas);
    }
    }
