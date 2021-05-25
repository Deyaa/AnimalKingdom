import java.awt.*;

public class Giant extends Critter {
    private int moves;

    public Giant() {
        moves=1;
        getColor();
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            countMoves();
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY){
            countMoves();
            return Action.HOP;
        } else {
            countMoves();
            return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        if (moves<=6){
            return "fee";
        } else if (moves<=12){
            return "fie";
        } else if (moves<=18){
            return "foe";
        } else {
            return "fum";
        }
    }

    public void countMoves(){
        if (moves==24){
            moves=1;
        } else {
            moves++;
        }
    }
}
