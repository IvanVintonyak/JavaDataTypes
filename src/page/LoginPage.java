package page;

public class LoginPage extends Page {
    @Override
    void open() {
       SeleniumFramework.navigateTo(SeleniumFramework.BASE_URL + "/login_page");
    }
}
