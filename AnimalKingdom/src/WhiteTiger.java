import java.awt.*;

public class WhiteTiger extends Critter {
    boolean hasInfected;

    public WhiteTiger() {
        hasInfected=false;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        if (hasInfected){
            return super.toString();
        } else {
            return "tgr";
        }
    }
}
