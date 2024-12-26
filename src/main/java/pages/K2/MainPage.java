package pages.K2;

import com.microsoft.playwright.Page;
import pages.base.AbstractPage;

public class MainPage extends AbstractPage {
    public MainPage(Page page) {
        super(page);
    }
    public final String searchField = "//input[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchTxt']";
    public final String searchButton = "//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchBtn']";
    public final String finishedTask = "(//span[text() = 'Завершено'])[1]";

    public MainPage enterValueInTheField( String Text){
        page.locator(searchField).fill(Text);
        return this;
    }

    public String getSearchFieldValue() {

        return page.locator(searchField).inputValue();
    }

    public MainPage clickSearchButton(){
        page.locator(searchButton).click();
        return null;
    }

    public boolean getFinishedTaskValue() {
        page.locator(finishedTask).waitFor();
        return page.locator(finishedTask).isVisible();
    }

}
