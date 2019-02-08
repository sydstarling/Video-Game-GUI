import java.awt.*;

public class Exit extends StaticEntity {
    public Exit(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT * 2);
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.Exit, (int)(x), (int) (y), 40, 40, null);
    }
    public void die(){
    }

}
