import java.util.ArrayList;
import java.awt.Rectangle;

public class Snake {

    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;

    private String move; 

    public Snake() {
        
        /* Creating the snakes body using Rectangles */

        body = new ArrayList<>();

        /* The initial head of the snake. */

        Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
        temp.setLocation(Game.width / 2 * Game.dimension, Game.height / 2 * Game.dimension);
        body.add(temp);

        /* 2 more rectangles to thje left of the head toa ct as the body */

        temp = new Rectangle(d,d);
        temp.setLocation((w / 2 - 1) * d, (h / 2 - 1) * d);
        body.add(temp);

        temp = new Rectangle(d,d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d);
        body.add(temp);
        
        /* This "NOTHING" prevents the snake from moving
        at the start until a key is pressed for a direction. */
        

        move = "NOTHING";
    }

    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }

    public void up() {
        move = "UP";
    }

    public void down() {
        move = "DOWN";
    }

    public void left() {
        move = "LEFT";
    }

    public void right() {
        move = "RIGHT";
    }

}
