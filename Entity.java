
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Entity {
    protected Handler handler;
    public static final int DEFAULT_HEALTH = 10;
    protected int health;
    protected boolean active = true;
    protected float x, y;
    protected int width, height;

    protected Rectangle bounds;

    public Entity(Handler handler, float x, float y, int width, int height) {
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        health = DEFAULT_HEALTH;
        //Bounds for collison on any entity
        bounds = new Rectangle(0, 0, width, height);
    }

    //ABSTRACT METHODS to be overridden
    public abstract void tick();
    public abstract void render(Graphics g);


    //getters and setters
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public abstract void die();

    public boolean checkEntityCollisions(float xOffset, float yOffset) {
        //checks for entity vs. entity collisions
        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
           if (e.equals(this))
                continue;
            if (e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
                return true;
            //explosion();
        }
        return false;
    }

    public Rectangle getCollisionBounds(float xOffset, float yOffset) {
        return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }



}