import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Manager {
    private Handler handler;
    private ArrayList<MenuObject> objects;

    public Manager(Handler handler){
        this.handler = handler;
        objects = new ArrayList<MenuObject>();
    }

    public void tick(){
        for(MenuObject o : objects)
            o.tick();
    }

    public void render(Graphics g){
      g.drawImage(Assets.Title,0,0,800,800,null);

        for(MenuObject o : objects)
            o.render(g);
    }

    public void onMouseMove(MouseEvent e){
        for(MenuObject o : objects)
            o.onMouseMove(e);
    }

    public void onMouseRelease(MouseEvent e){
        for(MenuObject o : objects)
            o.onMouseRelease(e);
    }



    //getters and setters
    public void addObject(MenuObject o){
        objects.add(o);
    }
    public void removeObject(MenuObject o){
        objects.remove(o);
    }
    public Handler getHandler() {
        return handler;
    }
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public ArrayList<MenuObject> getObjects() {
        return objects;
    }
    public void setObjects(ArrayList<MenuObject> objects) {
        this.objects = objects;
    }
}
