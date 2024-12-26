package pages.K2;

import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import pages.base.AbstractPage;


public class K2TakeTask extends AbstractPage {
    public K2TakeTask(Page page) {
        super(page);
    }

    public final String theButtonToTheMainPage = "//span[text() = 'Головна']";
    public final String iframeToTheMainPage = "//iframe[@class='content-control-iframe' and @src='/Workspace/Form/MHP__Menu__FORM']";
    public final String clickButtonOpenTask = "(//td[@class='WorklistTableSelectGridArrow' and @title='Open action menu'])[1]";
    public final String clickButtonOpen = "//span[text() = 'Відкрити']";
    public final String buttonNoDebts = "//a[text() = 'Заборгованості немає']";
    public final String buttonOk = "//a[text() = 'OK']";
    public final String buttonApprove = "//a[text() = 'Погодити']";
    public final String buttonSigned = "//a[text() = 'Підписано']";
    public final String buttonReceived = "//a[text() = 'Отримано']";
    public final String taskCompleted = "//a[text() = 'Задачу виконано']";
    public final String buttonPrepared = "//a[text() = 'Підготовлено']";
    public final String buttonResresh = "//input[@id = '00000000-0000-0000-0000-000000000000_d1c56800-d9fa-bc6e-2072-f674a8b6bc17_refreshInput']";

    public K2TakeTask waitTime(){
        page.waitForTimeout(1500);
        return null;
    }

    public K2TakeTask сlickTheButtonToTheMainPage(){
        page.locator(theButtonToTheMainPage).click();
        page.waitForTimeout(1000);
        return null;
    }

    public boolean getButtonOpenTaskVisible() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(clickButtonOpenTask).waitFor();
        return iframe.locator(clickButtonOpenTask).isVisible();
    }

    public K2TakeTask clickButtonOpenTask(){
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(clickButtonOpenTask).click();
// Вихід з iframe не потрібен, Playwright автоматично працює з контекстом iframe.
        return this;
    }
    public K2TakeTask clickButtonOpen(){
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(clickButtonOpen).click();
        page.waitForTimeout(2000);
// Вихід з iframe не потрібен, Playwright автоматично працює з контекстом iframe.
        return this;
    }

    public K2TakeTask clickButtonNoDebts() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonNoDebts).click();
        return null;
    }

    public K2TakeTask clickButtonOk() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonOk).click();
        return null;
    }

    public K2TakeTask clickButtonApprove() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonApprove).click();
        return null;
    }

    public K2TakeTask clickTaskCompleted() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(taskCompleted).click();
        return null;
    }

    public K2TakeTask clickButtonPrepared() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonPrepared).click();
        return null;
    }

    public K2TakeTask clickButtonSigned() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonSigned).click();
        return null;
    }

    public K2TakeTask clickButtonReceived() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonReceived).click();
        return null;
    }

    public K2TakeTask clickButtonRefresh() {
        FrameLocator iframe = page.frameLocator(iframeToTheMainPage);
        iframe.locator(buttonResresh).waitFor();
        iframe.locator(buttonResresh).click();
        return null;
    }


}
