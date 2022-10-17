import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Graphics extends JPanel implements ActionListener{

    /* Timer is used to essentially update and draw
       the game background every 100ms. */
    
    private Timer t = new Timer (100, this);

    public String state;

    private Snake s;
    private Food f;
    private Game game; 

    public Graphics(Game g) {
        
        t.start();
        state = "START";

        game = g;
        s = g.getPlayer();
        f = g.getFood();

        this.addKeyListener(g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        /* This is essentially the game start screen
           freezes the sanke in position and prompts the user
           to push a key to start the game. */

        if(state == "START") {
            g2d.setColor(Color.white);
            g2d.drawString("Press Any Key", Game.width / 2 * Game.dimension - 40, Game.height / 2 * Game.dimension - 20 );
        }

        else if(state == "RUNNING"){

        /* This is the code that is executed after
        the player pushes a key and moves past the 
        start screen */ 
        
        /* drawing the background */

        g2d.setColor(Color.black);
        g2d.fillRect(0,0, Game.width * Game.dimension, Game.height * Game.dimension);

        /* drawing the food. */

        g2d.setColor(Color.red);
        g2d.fillRect(f.getX() * Game.dimension, f.getY() * Game.dimension, Game.dimension, Game.dimension);

        /* Drawing the snake. */

        g2d.setColor(Color.orange);
        for(Rectangle r : s.getBody()) {
            g2d.fill(r);
        }
        }
        
        /* This is the code used for tracking the score,
           the reason we -3 points away is because thats 
           the inital size of the snake and you dont get points
           for the spawn size of the snake. */
        
        else {
            g2d.setColor(Color.white);
            g2d.drawString("Your Score: " + (s.getBody().size() -3), Game.width / 2 * Game.dimension - 40, Game.height / 2 * Game.dimension - 20 );
        }
    }

    /* This action gets called every 100ms which calls
       the paintComponent above to draw the background. */

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        game.update();
    }
    
}
