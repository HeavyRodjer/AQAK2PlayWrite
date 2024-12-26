package tests.base;

import com.microsoft.playwright.*;
//import common.CommonActions;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.K2.K2SavingBusinessTrips;
import pages.K2.MainPage;
import pages.K2.K2OpenTask;
import pages.K2.K2TakeTask;
import pages.K2.K2CreationBusinessTrips;
import pages.base.AbstractPage;


import java.io.File;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Objects;

import static common.config.*;

@Feature("Main Page")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;


    protected AbstractPage abstractPage;
    protected pages.K2.MainPage mainPage;
    protected pages.K2.K2OpenTask k2OpenTask;
    protected pages.K2.K2TakeTask k2TakeTask;
    protected K2SavingBusinessTrips k2SavingBusinessTrips;
    protected pages.K2.K2CreationBusinessTrips k2CreationBusinessTrips;

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @BeforeAll

    void setup() {
        playwright = Playwright.create();
        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(HEADLESS_MODE);

        // Вибір браузера
        switch (PLATFORM_AND_BROWSER) {
            case "Edge":
                browser = playwright.chromium().launch(options.setChannel("msedge"));
                break;
            case "Chrome":
                browser = playwright.chromium().launch(options.setChannel("chrome"));
                break;
            default:
                throw new IllegalArgumentException("INCORRECT BROWSER NAME: " + PLATFORM_AND_BROWSER);
        }

    }
    private void clearDirectory(String dirPath) {
        File directory = new File(dirPath);
        if (directory.isDirectory()) {
            for (File item : Objects.requireNonNull(directory.listFiles())) {
                item.delete();
            }
        }
    }

    @BeforeEach
    public void beforeTest() {
        String videoDir = "videos/";
        // Створення нового контексту з відео, що записується в нову директорію
        context = browser.newContext(new Browser.NewContextOptions()
                .setHttpCredentials(USERNAME, PASSWORD) // Логін і пароль
                .setRecordVideoDir(Paths.get(videoDir)) // Директорія для збереження відео
                .setRecordVideoSize(1280, 720)); // Розмір відео

        page = context.newPage();

        LOGGER.info("START TIME:" + LocalTime.now());
        // Ініціалізація всіх сторінок
        abstractPage = new AbstractPage(page);
        mainPage = new MainPage(page);
        k2OpenTask = new K2OpenTask(page);
        k2TakeTask = new K2TakeTask(page);
        k2CreationBusinessTrips = new K2CreationBusinessTrips(page);
        k2SavingBusinessTrips = new K2SavingBusinessTrips(page);

        // Очистка алюрів
        LOGGER.info("START CLEAR REPORTS dir: screenshots/reports/tests");
        clearDirectory("allure-results");
        if (CLEAR_REPORTS_DIR) {
            clearDirectory("screenshots/reports/tests");
        }
        if (CLEAR_REPORTS_VIDEO_DIR) {
            clearDirectory("videos/");
        }
    }

    @AfterEach

    void clearCookiesAndLocalStorage() {

        if (CLEAR_COOLIES) {
            context.clearCookies();
            page.evaluate("window.sessionStorage.clear()");
        }

    }

    @AfterAll
    void teardown() {
        System.out.println("HOLD_BROWSER_OPEN is: " + HOLD_BROWSER_OPEN);
        if (!HOLD_BROWSER_OPEN) {
            browser.close();
            playwright.close();
        } else {
            System.out.println("Playwright and browser remain open.");
        }
    }
//    @Attachment(value = "Screenshot", type = "image/png")
//    public byte[] takeScreenshot() {
//        return page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
//    }
//
//    // Метод для прикріплення відео до Allure
//    @Attachment(value = "Video", type = "video/webm")
//    public byte[] attachVideo(String videoPath) {
//        try {
//            return java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(videoPath));
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new byte[0];
//        }
//    }
}
