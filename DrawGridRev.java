import objectdraw.*;
import java.awt.*;
// A program that uses the translate method to draw a
// grid of thick black lines on the canvas
public class DrawGridRev extends WindowController {

    // The corners of the next two rectangles to draw
    private Location verticalCorner, horizontalCorner;

    // Set Locations to position first pair of lines at lower
    // right corner of the canvas
    @Override public void begin() {
        horizontalCorner = new Location( 0, 200 );
        verticalCorner = new Location( 200, 0 );
    }

    // Draw a pair of lines and move Locations so that
    // the next pair of lines will appear further up
    // and to the left
    @Override public void onMouseClick( Location point ) {
        new FilledRect( verticalCorner, 5, 210, canvas );
        new FilledRect( horizontalCorner, 210, 5, canvas );

        verticalCorner.translate( -10, 0 );
        horizontalCorner.translate( 0, -10 );
    }
}
