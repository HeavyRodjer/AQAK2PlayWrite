//package common;
//
//import com.microsoft.playwright.*;
//
//import java.nio.file.Paths;
//
//import static common.config.PLATFORM_AND_BROWSER;
//import static common.config.HEADLESS_MODE;
//
//public class CommonActions {
//
//    private static Playwright playwright;
//    private static Browser browser;
//    private static BrowserContext context;
//    private static Page page;
//
//    public static Browser createDriver() {
//        // Ініціалізація Playwright
//        playwright = Playwright.create();
//        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(HEADLESS_MODE);
//
//
//
//        // Вибір браузера
//        switch (PLATFORM_AND_BROWSER) {
//            case "Edge":
//                browser = playwright.chromium().launch(options.setChannel("msedge"));
//                break;
//            case "Chrome":
//                browser = playwright.chromium().launch(options.setChannel("chrome"));
//                break;
//            default:
//                throw new IllegalArgumentException("INCORRECT BROWSER NAME: " + PLATFORM_AND_BROWSER);
//        }
//        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
//                .setRecordVideoDir(Paths.get("videos/"))  // Директорія для відео
//                .setRecordVideoSize(1920, 1080);         // Розмір відео (не обов'язково)
//
//        // Створення BrowserContext з відеозаписом
//
//        // Створення контексту та сторінки
//        context = browser.newContext(contextOptions);
//        page = context.newPage();
//
//
//        return browser;
//    }
//
//    public static Page getPage() {
//        if (page == null) {
//            throw new IllegalStateException("Page has not been initialized. Call createDriver() first.");
//        }
//        return page;
//    }
//}
