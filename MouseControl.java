import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseControl implements MouseListener, MouseMotionListener {
    private boolean leftPressed, rightPressed, clicked;
    private int mouseX, mouseY;
    private Manager uiManager;

    //default constructor
    public MouseControl(){

    }

    // Implemented methods

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.META_DOWN_MASK)
            clicked = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            leftPressed = false;
        else if(e.getButton() == MouseEvent.BUTTON3)
            rightPressed = false;
        if(uiManager != null)
            uiManager.onMouseRelease(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        if(uiManager != null)
            uiManager.onMouseMove(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            clicked = true;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    public void setManager(Manager uiManager){
        this.uiManager = uiManager;
    }

}
