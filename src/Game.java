import javax.swing.JFrame;

public class Game {

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
}
  