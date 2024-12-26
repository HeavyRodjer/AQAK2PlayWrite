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
4. Перевірити, чи відображається завдання із номером "12320":
   - Використати метод getBusinessTripTaskVisible(), який перевіряє наявність елемента із номером "12320" на сторінці.
5. Відкрити завдання із номером "12320":
   - Використати метод clickBusinessTripTask(), який двічі клацає по елементу завдання для відкриття.
*/


public class TestK2OpenTask extends BaseTest {
    static String chekSearchValue = "12320";
    @Test

    public void checkOpenTask()  {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        page.navigate(MHP_PAGE1);
        k2OpenTask.enterValueInTheField("12320");
        String actualSearchValue = k2OpenTask.getSearchFieldValue();
        Assertions.assertEquals(chekSearchValue, actualSearchValue, "Невідповідність значення в полі пошуку! ");
        k2OpenTask.clickSearchButton();
        Boolean actualBusinessTripTaskVisible = k2OpenTask.getBusinessTripTaskVisible();
        Assertions.assertTrue(actualBusinessTripTaskVisible, "Відсутня таска із номером - 12320! ");
        k2OpenTask.clickBusinessTripTask();


    }

}
