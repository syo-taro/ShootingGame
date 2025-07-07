
public class MiniEnemy extends Enemy {
    public MiniEnemy(double x, double y, double vx, double vy) {
        super(x, y, vx, vy);
        this.life = 1;
        this.score = 2;
    }

    @Override
    public void draw(MyFrame f) {
        f.setColor(255, 128, 0); 
        f.fillRect(x, y, 20, 20); 
    }
}

