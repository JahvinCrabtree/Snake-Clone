public class SuperFood extends Food {

    private int speedX;
    private int speedY;
    private int extraScore = 5; // for example

    public SuperFood(Snake player) {
        super(player);
        
        // Assigning random initial speed
        this.speedX = (Math.random() > 0.5) ? 1 : -1; 
        this.speedY = (Math.random() > 0.5) ? 1 : -1; 
    }

    public void move() {
        this.setX(this.getX() + speedX);
        this.setY(this.getY() + speedY);
        
        // If SuperFood hits a boundary, reverse its speed
        if (this.getX() <= 0 || this.getX() >= Game.width - 1) {
            speedX = -speedX;
        }
        
        if (this.getY() <= 0 || this.getY() >= Game.height - 1) {
            speedY = -speedY;
        }
    }

    public int getExtraScore() {
        return extraScore;
    }
    
}