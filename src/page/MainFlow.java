package page;

import java.util.Arrays;

public class MainFlow {
    public static void main(String[] args) {
       MainPage page = new MainPage();
       page.open(new LoggedInUser());

      int  a=3 , b = 24;
      int res =(a << 3) + (b >> 3);

        System.out.println( res);
    }
}
