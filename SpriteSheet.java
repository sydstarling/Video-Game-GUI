import java.awt.image.BufferedImage;

public class SpriteSheet {

    //Store sheet as buffered image
    private BufferedImage sheet;


    public SpriteSheet(BufferedImage sheet){
        this.sheet = sheet;
    }

    //crop method to access crop ny buffered image
    public BufferedImage crop(int x, int y, int width, int height){
        return sheet.getSubimage(x, y, width, height);
    }
}
