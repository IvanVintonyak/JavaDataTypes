package WhileLoop;

public class SSquare {
    public static void main(String[] args) {
         /*
    print to console a square 10*10 with 'S'
    using loop while
     */
        int a = 1;
        int b = 1;
        while (b <= 10) {
            while (a <= 10) {
                System.out.print("S"); a++;
            }
            System.out.println("S"); b++; a=1;
        }

        }
    }
