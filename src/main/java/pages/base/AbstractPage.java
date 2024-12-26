package pages.base;

import com.microsoft.playwright.Page;

public class AbstractPage {
    protected Page page;

    public AbstractPage(Page page) {
        this.page = page;
    }

}
