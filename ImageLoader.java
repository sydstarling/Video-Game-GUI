import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageLoader {

    public static BufferedImage loadImage(String path){
        try {
            //Load in image using get resource path
            return ImageIO.read(ImageLoader.class.getResource(path));




        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("exception!");
            System.exit(1);
        }
        return null;
    }

}
