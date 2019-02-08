import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class World {
    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    private EntityManager entityManager;



    public World(Handler handler, String path){
        ///passing new player object to entity manager and game objects to entity list
        this.handler = handler;
        entityManager = new EntityManager(handler, new Player(handler, 100, 100));
        loadWorld(path);
        entityManager.addEntity(new TNT(handler,100,700));
        entityManager.addEntity(new TNT(handler,700,700));
        entityManager.addEntity(new Exit(handler,500,500));

    }

    public void tick(){
        entityManager.tick();

    }

    public void render(Graphics g){
        for(int y = 0;y < height;y++){
            for(int x = 0;x < width;x++){
                getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH),
                        (int) (y * Tile.TILEHEIGHT));
            }
        }
        entityManager.render(g);

    }

    //get tile method

    public Tile getTile(int x, int y){
        if(x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.grassTile;
        }
        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null) {
            return Tile.dirtTile;
        }else {
            return t;
        }
    }

    //loading world and storing first 4 elements as height,width, and player x and y starting point

    private void loadWorld(String path){
        String file = loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = parseInt(tokens[0]);
        height = parseInt(tokens[1]);
        spawnX = parseInt(tokens[2]);
        spawnY = parseInt(tokens[3]);

        tiles = new int[width][height];
        for(int y = 0;y < height;y++){
            for(int x = 0;x < width;x++){
                tiles[x][y] = parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }

    //loading files in using buffered reader
    public static String loadFileAsString(String path){
        StringBuilder builder = new StringBuilder();

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null)
                builder.append(line + "\n");

            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return builder.toString();
    }

    //parsing from string to int

    public static int parseInt(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
//getters and setters
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
