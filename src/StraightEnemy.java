
public class StraightEnemy extends Enemy {
    public StraightEnemy(double x, double y, double vx, double vy) {
        super(x, y, vx, vy);
        life=5+GameWorld.stage;// 変更：lifeの初期値を面数に応じて増やす
    }
    public void draw(MyFrame f) {
        f.setColor(0, 0, 0);
        f.fillRect(x+8, y, 14, 15);
        f.fillRect(x+10, y+15, 10, 15);
    }
}