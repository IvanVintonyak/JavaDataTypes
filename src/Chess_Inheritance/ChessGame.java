package Chess_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    public static void main(String[] args) {
        List<ChessItem> chessItems = new ArrayList<>();
        chessItems.add(new King());
        chessItems.add(new Quinn());

        for(ChessItem chessItem : chessItems) {
            chessItem.move();
        }

    }
}
