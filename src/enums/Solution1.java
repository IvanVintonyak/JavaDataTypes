package enums;

public class Solution1 {
    /*
    Implement method getLetterPosition
    It should return position of the letter
    Example: A - 1, B - 2
     */
    public static void main(String[] args) {
        System.out.print(Alphabet.B.name() + " - " + Alphabet.B.getLetterPosition());

    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        int getLetterPosition() {
            return ordinal() + 1;
        }
    }
}
