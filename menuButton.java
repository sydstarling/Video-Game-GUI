import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class menuButton extends MenuObject {

    private BufferedImage[] images;
    private MenuInterface clicker;

    public menuButton(float x, float y, int width, int height, BufferedImage[] images, MenuInterface clicker) {
        super(x, y, width, height);
        this.images = images;
        this.clicker = clicker;
    }

    @Override
    public void tick() {}


      //Render button using first two elements of array
    @Override
    public void render(Graphics g) {
        if(hovering)
            g.drawImage(images[1], (int) x, (int) y, width, height, null);
        else
            g.drawImage(images[0], (int) x, (int) y, width, height, null);
    }

    @Override
    public void onClick() {
        clicker.onClick();
    }
}
