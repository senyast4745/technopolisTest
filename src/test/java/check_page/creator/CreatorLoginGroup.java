package check_page.creator;

import check_page.page.LoginPage;
import check_page.page.PageGroup;

public class CreatorLoginGroup extends FactoryClass {
    PageGroup factoryMethod() {
        return new LoginPage();
    }
}
