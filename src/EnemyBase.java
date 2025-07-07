
public class EnemyBase extends Enemy {
    public EnemyBase(double x, double y, double vx, double vy) {
        super(x, y, vx, vy);
        life=20;
        score=10; // 追加
    }
    public void move() {
        super.move();
        if (x>300)
            vx=-GameWorld.stage; // 変更
        if (x<100)
            vx=GameWorld.stage; // 変更
        if (Math.random()<0.05) {
            GameWorld.enemies
                    .add(new StraightEnemy(x, y, 0, 1+GameWorld.stage));// 変更
        }
        if (Math.random()<0.05) {
            GameWorld.enemies.add(new RandomEnemy(x, y, 0, GameWorld.stage));// 変更
        }
        if (Math.random()<0.05) {
            GameWorld.enemies.add(new DropEnemy(x, y, 0, GameWorld.stage));// 変更
        }
        if (Math.random()<0.05) {
            GameWorld.enemies.add(new CurveEnemy(x, y, 0, GameWorld.stage));// 変更
        }
        if (Math.random()<0.05) {
            GameWorld.enemies.add(new SplittingEnemy(x, y, 0, GameWorld.stage));// 変更
        }
    }
    public void draw(MyFrame f) { // 追加
        f.setColor(0, 128, 0);
        f.fillOval(x, y, 32, 32);
        f.setColor(200, 200, 200);
        f.fillOval(x-16, y+8, 64, 16);
    } // 追加ここまで
}
