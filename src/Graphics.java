

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics2D;


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
    }

    /* This action gets called every 100ms which calls
       the paintComponent above to draw the background. */

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }
    
}
