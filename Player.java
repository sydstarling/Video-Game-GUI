import java.awt.*;

public class Player extends  Creature {
    private Animation anim;
    Graphics g;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
       /* bounds.x = 22;
        bounds.y = 44;
        bounds.width = 19;
        bounds.height = 19;*/
    }

    @Override
    public void tick() {
        getInput();
        move();
    }

    private void getInput(){
        //move int
        xMove = 0;
        yMove = 0;

        if(handler.getKeyManager().up) {
            yMove = -speed;
        }
        if(handler.getKeyManager().down) {
            yMove = speed;
        }
        if(handler.getKeyManager().left) {
            xMove = -speed;
        }
        if(handler.getKeyManager().right){
            xMove = speed;}
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) (x), (int) (y), width, height, null);
        g.drawRect((int)x,(int)y,width,height);
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
    }
    public void die(){
        System.out.print("You lose!");
        //State.setState(handler.getGame().menuState);

    }

    public void checkTNT(){
        Rectangle cb = getCollisionBounds(0,0);

        Rectangle ar = new Rectangle();
        int arSize = 1;

    }
    public void explosion(Graphics g, int x, int y){
        int timePerFrame = 10;
        final int WIDTH = 120;
        final int HEIGHT =  128;
        timePerFrame +=30;
        for(int i =0; i<11;i++){
            g.drawImage(Assets.explosion[i],x,y,null);

        }
    }

}
