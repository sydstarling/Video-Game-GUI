import java.awt.*;

public class MenuState extends State {

    private Manager uiManager;

    public MenuState(Handler handler){
        super(handler);
        uiManager = new Manager(handler);
        handler.getMouseControl().setManager(uiManager);

        //add start button to menu state screen and set state to game state when pressed
        uiManager.addObject(new menuButton(320, 600, 100, 80, Assets.start, new MenuInterface() {
            @Override
            public void onClick() {
                State.setState(handler.getGame().gameState);
            }
        }));




    }

    @Override
    public void tick() {
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }

}


