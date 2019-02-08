
import java.awt.Graphics;
import java.util.ArrayList;
public class EntityManager {
    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;
    private ArrayList<Player> players;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        players = new ArrayList<Player>();
        addEntity(player);
        addEntity(new Player(handler,300,300));
        addEntity(new Player(handler,400,400));
    }

    public void tick() {
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            e.tick();
            /*if(!e.isActive())
                entities.remove(e);
        }*/
        }
    }
    public void render(Graphics g) {
        for (Entity e : entities) {
            e.render(g);
        }
    }
   //getters and setters(below)

    public void addEntity(Entity e) {
        entities.add(e);
    }
    public void addPlayer(Player p){
        players.add(p);
    }
    public ArrayList<Player>getPlayers(){
        return players;
    }
    public Handler getHandler() {
        return handler;
    }
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public ArrayList<Entity> getEntities() {
        return entities;
    }
    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;

    }
}
