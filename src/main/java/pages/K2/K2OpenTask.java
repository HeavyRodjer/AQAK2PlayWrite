package pages.K2;

import com.microsoft.playwright.Page;
import pages.base.AbstractPage;

public class K2OpenTask extends AbstractPage {
    public K2OpenTask(Page page) {
        super(page);
    }
    public final String searchField = "//input[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchTxt']";
    public final String searchButton = "//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchBtn']";
    public final String businessTripTask = "//span[text()= '12320']";


    public K2OpenTask enterValueInTheField( String Text){
        page.locator(searchField).fill(Text);
        return this;
    }

    public String getSearchFieldValue() {

        return page.locator(searchField).inputValue();
    }

    public K2OpenTask clickSearchButton(){
        page.locator(searchButton).click();
        return null;
    }

    public boolean getBusinessTripTaskVisible() {
        page.locator(businessTripTask).waitFor();
        return page.locator(businessTripTask).isVisible();
    }

    public K2OpenTask clickBusinessTripTask(){
        page.locator(businessTripTask).dblclick();
        return this;
    }



}
