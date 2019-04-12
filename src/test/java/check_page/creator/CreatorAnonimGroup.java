package check_page.creator;

import check_page.page.AnonimPage;
import check_page.page.PageGroup;

public class CreatorAnonimGroup extends FactoryClass {

    PageGroup factoryMethod() {
        return new AnonimPage();
    }
}
