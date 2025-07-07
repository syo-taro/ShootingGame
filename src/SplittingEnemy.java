
public class SplittingEnemy extends Enemy {
    private boolean hasSplit = false; 

    public SplittingEnemy(double x, double y, double vx, double vy) {
        super(x, y, 0, 1); 
        this.life = 3;
    }


    public void move() {
        super.move();

   
        if (life <= 0 && !hasSplit) {
            hasSplit = true;

     
            GameWorld.enemies.add(new MiniEnemy(x - 10, y, -1.5, 1.5));
            GameWorld.enemies.add(new MiniEnemy(x + 10, y, 1.5, 1.5));
        }
    }

    public void draw(MyFrame f) {
   
        f.setColor(0, 200, 255);
        f.fillOval(x, y, 40, 30);

 
        f.setColor(255, 255, 255);
        f.fillOval(x + 10, y + 8, 8, 8);

        f.setColor(0, 0, 0);
        f.fillOval(x + 13, y + 11, 3, 3);
    }
}

