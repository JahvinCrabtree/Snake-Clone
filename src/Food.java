
import java.awt.Rectangle;

public class Food {

    private int x;
    private int y;

    public Food(Snake player) {
        this.randomSpawn(player);
    }

    /* Using random to create X and Y spawn coordinates
       that allow for a food item to be placed anywhere
       on the screen other than ontop of the snake, if it
       happens to pick a location where the snake is it 
       will loop and choose another location until it 
       doesn't pick an area ontop of the snake. */

    public void randomSpawn(Snake player) {
        x = (int)(Math.random() * Game.width - 1);
        y = (int)(Math.random() * Game.height - 1);

        boolean onSnake = true;
        while(!onSnake) {
            onSnake = false;
            for (Rectangle r : player.getBody()){
                if (r.x ==x && r.y == y) {
                    onSnake = true;
                }
            }
        }
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
