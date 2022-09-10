package Chess_Inheritance;

public abstract class ChessItem implements Drawable, Element {
    int x;
    int y;
    private int value;
    private int worth;
    public int getValue(){
        return value;
    }

    public abstract void move();

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
