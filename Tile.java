import java.awt.image.BufferedImage;
import java.awt.Graphics;
public class Tile {

    //storing tile in array of tiles with given ID fot accessing specific tiles
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);


    public static final int TILEWIDTH = 40, TILEHEIGHT = 40;

    protected BufferedImage texture;
    protected final int id;
    //constrcutor setting tile to given ID for acessing on map

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick(){

    }
    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }
    public boolean isSolid(){
        return false;
    }
    public int getId(){
        return id;
    }
}
