package page;

public class UnknownUser implements User{
    @Override
    public void openMainPage() {
        System.out.println("Navigate to login page");
        System.out.println("Login");
        System.out.println("Open Main page");
    }
}
