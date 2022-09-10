package page;

public class SeleniumFramework {
public static final String BASE_URL = "https://myPage";



   public static void openPage(String path){
       System.out.println("Go to +" + BASE_URL + path);

    }

    public static void navigateTo(String path) {
        System.out.println("Navigate to the page " + path);
    }
}
