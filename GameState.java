import java.awt.Graphics;

public class GameState extends State {
    private Player player,player1, player2;
    private World world,world1;
    public Player[] players;
    private Manager uiManager;

    public GameState(Handler handler){
        super(handler);
        //load in first world
        world = new World(handler, "src/World");
        //handler object set world equal to new world
        handler.setWorld(world);
    }

    @Override
    public void tick() {
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);

    }

    public Player getPlayer1(){
        return  player1;
    }
    public Player getPlayer2(){
        return player2;
    }



}
