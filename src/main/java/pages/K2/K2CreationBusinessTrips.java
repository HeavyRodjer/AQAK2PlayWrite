package pages.K2;

import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import pages.base.AbstractPage;

public class K2CreationBusinessTrips extends AbstractPage {
    public K2CreationBusinessTrips(Page page) {
        super(page);
    }
    public final String buttonCreation = "//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_a5612171-918f-36d2-e216-d6a03b2bc1a9_ToolbarButton']";
    public final String business_trip_task = "//span[text() = 'Ініціатор:']";
    public final String userEditButton = "//a[@id='10b134b0-3157-4107-3dbe-677c00919df0_94891af2-0cd8-d743-4ab5-3944788d568c_ToolbarButton']";
    public final String iframeChangeUser = "//iframe[contains(@class, 'runtime-popup')]";
    public final String buttonChangeUser = "//input[contains(@data-options, 'Оберіть користувача')]";
    public final String fieldChangeUser = "//a[@id= '00000000-0000-0000-0000-000000000000_1e906923-37b8-3344-7ef5-295f89c09b2b']";
    public final String dropDownList = "(//div[contains(@class, 'input-control-body') and contains(@style, 'right: 25px;')])[1]";
    public final String purposeOfTheTrip = "(//a[@class='input-control  styling-font'])[5]";
    public final String theTypeOfBusinessTrip = "//span[text()='Внутрішнє']";
    public final String selectProjectCompletion = "//span[text()='Завершення проекту']";
    public final String fieldCitySending = "//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_0947a15e-4be4-b0dc-6743-dc3904cbc464']";
    public final String fieldCityDestination = "//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_93ee0007-20bc-b18e-9889-2a248a619bef']";
    public final String fieldEnterprise = "//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_0c7115ce-5b13-4065-dcd5-e4fa8ca344a0']";
    public final String changeButtonCityDestination = "(//a[@class='picker-search border-left-only' and @title='Search'])[2]";
    public final String buttonEnterprise = "(//a[@class='picker-search border-left-only' and @title='Search'])[4]";
    public final String changeButtonCitySending = "(//a[@class='picker-search border-left-only' and @title='Search'])[1]";
    public final String chooseACitySending = "//span[text()= 'Ужгород']";
    public final String chooseACityDestination = "(//span[text()= 'Київ'])[3]";
    public final String chooseAEnterprise = "(//span[text()= 'МХП ПрА'])[2]";
    public final String buttonOk = "//a[text() = 'OK']";
    public final String buttonDateStart = "//a[@id = '10b134b0-3157-4107-3dbe-677c00919df0_b09ea425-ab59-ea44-f226-18ccc5c8d2e1_Image']";
    public final String buttonEndStart = "//a[@id = '10b134b0-3157-4107-3dbe-677c00919df0_5c90f05c-8859-1839-0b42-4c5984cecc73_Image']";
    public final String changeStartDate = "//a[text() = '17']";
    public final String changeEndDate = "//a[text() = '17']";
    public final String buttonCreate = "//a[@id = '41ad9118-966e-847d-5c5a-bd524fbeef74_6ec82276-6456-132d-198a-5397cc61fbd3']";
    public final String buttonRegion = "(//span[text()='Оберіть значення'])[1]";
    public final String region = "//span[text()='ЦО']";
    public final String creationDateColumn = "//div[@title = 'Дата створення']";

    public K2CreationBusinessTrips clickButtonCreation(){
        page.locator(buttonCreation).click();
        return this;
    }

    public String getUeserName() {

        return page.locator(business_trip_task).textContent();
    }

    public K2CreationBusinessTrips clickButtonRegion(){
        page.locator(buttonRegion).click();
        return null;
    }

    public K2CreationBusinessTrips clickRegion(){
        page.locator(region).waitFor();
        page.locator(region).click();
        return null;
    }

    public K2CreationBusinessTrips clickUserEditButton(){
        page.locator(userEditButton).click();
        page.waitForTimeout(1000);
        return null;
    }

    public K2CreationBusinessTrips sendTextInFieldUserName(String UserName){;
        FrameLocator iframe = page.frameLocator(iframeChangeUser);
        iframe.locator(buttonChangeUser).fill(UserName);
        page.waitForTimeout(1000);
        return this;
    }

    public K2CreationBusinessTrips pressEnter(){;
        // Натискання Enter після введення тексту
        page.keyboard().press("Enter");
        return this;
    }

    public K2CreationBusinessTrips sendTextInFieldUserName1(){;
        FrameLocator iframe = page.frameLocator(iframeChangeUser);
        iframe.locator(fieldChangeUser).click();
        return this;
    }

    public K2CreationBusinessTrips clickDropDownList(){
        page.waitForTimeout(2000);
        page.locator(dropDownList).click();
        return this;
    }

    public K2CreationBusinessTrips selectTheTypeOfBusinessTrip(){
        page.locator(theTypeOfBusinessTrip).click();
        return this;
    }
    public String getTypeOfBusinessTrip() {
        return page.locator(theTypeOfBusinessTrip).innerText();
    }

    public K2CreationBusinessTrips clickChangeButtonCitySending(){
        page.locator(changeButtonCitySending).click();
        return this;
    }

    public K2CreationBusinessTrips enterCitySending(String CitySending){
        page.locator(fieldCitySending).fill(CitySending);
        return this;
    }

    public String getCitySending() {
        return page.locator(fieldCitySending).inputValue();
    }

    public K2CreationBusinessTrips clickCitySending(){
        page.locator(chooseACitySending).dblclick();
        return this;
    }

    public K2CreationBusinessTrips clickChangeButtonCityDestination(){
        page.locator(changeButtonCityDestination).click();
        return this;
    }

    public K2CreationBusinessTrips enterCityDestination(String CityDestination){
        page.locator(fieldCityDestination).fill(CityDestination);
        return this;
    }

    public String getCityDestination() {
        return page.locator(fieldCityDestination).inputValue();
    }

    public K2CreationBusinessTrips clickCityDestination(){
        page.locator(chooseACityDestination).dblclick();
        return this;
    }

    public K2CreationBusinessTrips clickButtonOk(){
        page.locator(buttonOk).click();
        return this;
    }

    public K2CreationBusinessTrips clickButtonEnterprise(){
        page.locator(buttonEnterprise).click();
        return this;
    }

    public K2CreationBusinessTrips enterEnterprise(String Enterprise){
        page.locator(fieldEnterprise).fill(Enterprise);
        return this;
    }

    public K2CreationBusinessTrips clickCityEnterprise(){
        page.locator(chooseAEnterprise).dblclick();
        return this;
    }

    public K2CreationBusinessTrips clickPurposeOfTheTrip(){
        page.locator(purposeOfTheTrip).click();
        return this;
    }

    public K2CreationBusinessTrips clickProjectCompletion(){
        page.locator(selectProjectCompletion).click();
        return this;
    }

    public String getProjectCompletion() {
        return page.locator(selectProjectCompletion).textContent();
    }

    public K2CreationBusinessTrips clickButtonDateStart(){
        page.locator(buttonDateStart).click();
        return this;
    }

    public K2CreationBusinessTrips clickStartDate(){
        page.locator(changeStartDate).click();
        return this;
    }
    public K2CreationBusinessTrips clickButtonDateEnd(){
        page.locator(buttonEndStart).click();
        return this;
    }

    public K2CreationBusinessTrips clickEndDate(){
        page.locator(changeEndDate).click();
        return this;
    }

    public K2CreationBusinessTrips clickButtonCreate(){
        page.locator(buttonCreate).click();
        return this;
    }

    public boolean getCreationCompleted() {
        page.locator(creationDateColumn).waitFor();
        return page.locator(creationDateColumn).isVisible();
    }
}
