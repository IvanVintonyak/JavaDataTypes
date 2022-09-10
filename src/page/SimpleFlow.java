package page;

public class SimpleFlow {

    public void navigate(Page page) {
        page.open();
        System.out.println(page.getClass().getSimpleName());
    }
}
