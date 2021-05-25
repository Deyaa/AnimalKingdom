import java.awt.*;

public class NinjaCat extends Critter {
    public boolean hasInfected;

    public NinjaCat() {
        hasInfected=false;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);
    }

    @Override
    public Color getColor() {
        if (hasInfected){
            return Color.MAGENTA;
        } else {
            return Color.orange;
        }
    }

    @Override
    public String toString() {
        if (hasInfected){
            return "Z";
        } else {
            return "z";
        }
    }
}
