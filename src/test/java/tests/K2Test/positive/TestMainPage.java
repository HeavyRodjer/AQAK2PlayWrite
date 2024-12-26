package tests.K2Test.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constans.Urls.MHP_PAGE1;

/*
Кроки:
1. Ввести значення у поле пошуку:
   - Використовувати метод enterValueInTheField(String Text), передавши потрібний текст для пошуку.
2. Перевірити значення у полі пошуку:
   - Використати метод getSearchFieldValue() для отримання введеного значення.
3. Натиснути кнопку пошуку:
   - Використовувати метод clickSearchButton().
4. Перевірити, чи є завдання із статусом "Завершено":
   - Використати метод getFinishedTaskValue(), який перевіряє наявність елемента зі статусом "Завершено" на сторінці.
*/


public class TestMainPage extends BaseTest {
    static String chekSearchValue = "Завершено";

    @Test
    public void checkStartMainPage()  {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        page.navigate(MHP_PAGE1);
        mainPage.enterValueInTheField("Завершено");
        String actualSearchValue = mainPage.getSearchFieldValue();
        Assertions.assertEquals(chekSearchValue, actualSearchValue, "Невідповідність значення в полі пошуку! ");
        mainPage.clickSearchButton();
        Boolean actualFinishedTaskValue = mainPage.getFinishedTaskValue();
        Assertions.assertTrue(actualFinishedTaskValue , "Відсутня таска із значення - Завершено! ");
    }

}