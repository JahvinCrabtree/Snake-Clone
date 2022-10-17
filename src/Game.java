import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Game implements KeyListener{

    private Snake player;
    private Food food;
    private Graphics graphics;

    private JFrame window;

    /* Setting the dimensions for the game frame */
    
    public static final int width = 30;
    public static final int height = 30;
    public static final int dimension = 20;

    public Game() {
        player = new Snake();
        food = new Food(player);
        graphics = new Graphics(this);

        window = new JFrame();

        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* Checks to see if the Snakes head hits a wall. */

    public boolean checkWallCollision() {
        if(player.getX() < 0 || player.getX() >= width * dimension || player.getY() < 0 || player.getY() >= height * dimension){
            return true;
        } 
        return false;
    }
    
    /* Checks to see if the snake touches a piece of food. */

    public boolean checkFoodCollision() {
        if(player.getX() == food.getX() * dimension && player.getY() == food.getY() * dimension){
            return true;
        }
        return false;
    }

    /* Checks to see if the snake touches itself.  */

    public boolean checkSelfCollision() {
        for (int i = 1; i < player.getBody().size(); i++) {
            if(player.getX() == player.getBody().get(i).x && player.getY() == player.getBody().get(i).y);{
            return true;
        }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        /* Key events that listen for the presses
         * on A W S and D, this is used for the movement 
         * of the snake. */

        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) {
            player.up();
        }
        else if (keyCode == KeyEvent.VK_S) {
            player.down();
        }
        else if(keyCode == KeyEvent.VK_A) {
            player.left();
        }
        else {
            player.right();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {        
    }

    public Snake getPlayer() {
        return player;
    }
    public void setPlayer(Snake player) {
        this.player = player;
    }
    public Food getFood() {
        return food;
    }
    public void setFood(Food food) {
        this.food = food;
    }
    public JFrame getWindow() {
        return window;
    }
    public void setWindow(JFrame window) {
        this.window = window;
    } 

}
  