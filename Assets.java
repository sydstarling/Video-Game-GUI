import com.sun.deploy.panel.SpecialTableRenderer;

import java.awt.image.BufferedImage;

public class Assets {
    private static final int width = 20, height = 20;

    public static BufferedImage player, ground, Brick, stone, tree, TNT,Exit,saw,Title;
    public static BufferedImage[] start,level;
    public static BufferedImage[] title;
    public static BufferedImage[] explosion;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("finalSprties.png"));
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("ground.jpg"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("koala.png"));
        SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("start1button.png"));
        SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage("button.png"));
        SpriteSheet sheet6 = new SpriteSheet(ImageLoader.loadImage("MENU.png"));
        SpriteSheet sheet7 = new SpriteSheet(ImageLoader.loadImage("spritesheet7.png"));
        SpriteSheet sheet8 = new SpriteSheet(ImageLoader.loadImage("nextLevelButton.jpg"));


        start = new BufferedImage[2];
       title = new BufferedImage[1];
       explosion =new BufferedImage[8];
        level = new BufferedImage[2];
        start[0] = sheet4.crop(85,90,290,92);
        start[1]= sheet5.crop(45,50,320,120);
        player = sheet3.crop(0, 0, 598, 402);
        TNT = sheet.crop(0, 130, 252, 170);
        Exit = sheet.crop(0 , 320, 115, 88);
        saw = sheet.crop(10,425,130,100);
        ground = sheet1.crop(0, 0, 102, 50);
        Brick = sheet.crop(154, 425, 98, 50);
        Title = sheet6.crop(0,0,782,484);
       explosion[0] = sheet7.crop(0,0,130,130);
       explosion[1] = sheet7.crop(0,130,130,130);
       explosion[2] = sheet7.crop(0,261,130,130);
        explosion[3] = sheet7.crop(0,392,130,130);
        explosion[4] = sheet7.crop(0,523,130,130);
       explosion[5] = sheet7.crop(0,654,130,130);
        explosion[6] = sheet7.crop(0,780,130,130);
        level[0] = sheet8.crop(0,0,256,123);
        level[1] = sheet8.crop(0,0,256,123);






    }
}
