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
        window = new JFrame();

        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
  