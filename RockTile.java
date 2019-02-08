public class RockTile extends Tile {

    public RockTile(int id) {
        super(Assets.Brick, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
