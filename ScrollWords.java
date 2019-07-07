import objectdraw.*;
import java.awt.*;

//A program display words that means Hello in some languages.
//When a number of letters is over fourty, a string slip to left.
public class ScrollWords extends WindowController {
  private String contents;
  //is the group of words.
  private Text text;
  //text that display the words.
 
  //Displayed words are selected at random.
  private GreetGenerator gGen;
  //New string when the numbers of letters are over fouty.
  private String contentsB;
  
  //When program begin, set up the condition of the string.
  @Override public void begin() {
    contents = "";
    text = new Text(contents, 20, 50, canvas);
    text.setFontSize(20);
    gGen = new GreetGenerator();
  }

  //When mouse is clicked,words are displayed.
  //If numbers of letters in the string are over fourty,
  //display the new string.
  @Override public void onMouseClick( Location point ) {
    contents = contents + " " + gGen.greet();
    text.setText(contents);
    
    if(contents.length()>40){
    contentsB=contents.substring(contents.length()-40);
    text.setText(contentsB);
    }
    
  }
}
