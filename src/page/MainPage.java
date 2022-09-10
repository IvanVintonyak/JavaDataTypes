package page;

public class MainPage extends Page {
    private static final String MAIN_PAGE_PATH = "main";

    @Override
    void open() {
        super.open();
        SeleniumFramework.navigateTo(MAIN_PAGE_PATH);
    }
    void open(User user){
        user.openMainPage();
    }
}
