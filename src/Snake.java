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

    public void move() {
        if (move != "NOTHING"); {

            /* getting the location of the first element of the snake 
               FIRST is the HEAD of the snake. */

            Rectangle first = body.get(0);
            Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
            
            /* Uses the first element of the snake as a point of reference 
               then the addsa an element above it using first.y - Game.dimension
               we repeat this process for all the movement directions. */

            if(move == "UP") {
                temp.setLocation(first.x, first.y - Game.dimension);
            }
            else if(move == "DOWN") {
                temp.setLocation(first.x, first.y + Game.dimension);
            }
            else if(move == "LEFT") {
                temp.setLocation(first.x - Game.dimension, first.y);
            }
            else{
                temp.setLocation(first.x + Game.dimension, first.y);
            }

            body.add(0, temp);
            body.remove(body.size()-1);
        }
    }

    public void grow() {

        /* Grow function works the same as the move function
           with the exception of removing the initial statement 
           because in order to grow we're going to be moving, and 
           then removing final statement so the element doesn't remove the body.size. */

            Rectangle first = body.get(0);
            Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
            
            if(move == "UP") {
                temp.setLocation(first.x, first.y - Game.dimension);
            }
            else if(move == "DOWN") {
                temp.setLocation(first.x, first.y + Game.dimension);
            }
            else if(move == "LEFT") {
                temp.setLocation(first.x - Game.dimension, first.y);
            }
            else{
                temp.setLocation(first.x + Game.dimension, first.y);
            }

            body.add(0, temp);
        }

    public ArrayList<Rectangle> getBody() {
        return body;
    }
    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }

    public int getX() {
        return body.get(0).x;
    }
    public int getY() {
        return body.get(0).y;
    }

    /* Creating methods that are used to make 
       the snake change direction. */

    public void up() {
        if(move!="DOWN") {
        move = "UP";
    }
    }

    public void down() {
        if(move!="UP") {
        move = "DOWN";
    }
    }
    public void left() {
        if(move!="RIGHT") {
        move = "LEFT";
    }
    }

    public void right() {
        if(move!="LEFT") {
        move = "RIGHT";
    }
    }

}
