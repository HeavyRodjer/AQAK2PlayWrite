package tests.K2Test.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constans.Urls.MHP_PAGE;

/*
Кроки:
1. Перейти на сторінку МХП:
   - Використати метод page.navigate(MHP_PAGE).
2. Перейти на головну сторінку:
   - Використати метод k2TakeTask.сlickTheButtonToTheMainPage().
3. Перевірити наявність задачі на перевірку заборгованості:
   - Використати метод getButtonOpenTaskVisible().
   - Виконати перевірку Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на перевірку заборгованості в головному меню!").
4. Відкрити задачу на перевірку заборгованості:
   - Використати методи: clickButtonOpenTask(), clickButtonOpen(), clickButtonNoDebts(), clickButtonOk().
   - Додати паузу для оновлення сторінки page.waitForTimeout(1500).
   - Оновити список задач методом clickButtonRefresh().
5. Виконати погодження керівника:
   - Повторити перевірку та відкрити задачу на погодження керівника за допомогою методів: clickButtonOpenTask(), clickButtonOpen(), clickButtonApprove(), clickButtonOk().
   - Оновити список задач методом clickButtonRefresh().
6. Виконати погодження наказу:
   - Повторити перевірку та дії: clickButtonOpenTask(), clickButtonOpen(), clickTaskCompleted(), clickButtonOk().
   - Оновити список задач методом clickButtonRefresh().
7. Підтвердити дані по відрядженню:
   - Повторити перевірку та дії: clickButtonOpenTask(), clickButtonOpen(), clickButtonApprove(), clickButtonOk().
   - Оновити список задач методом clickButtonRefresh().
8. Підготувати дані:
   - Повторити перевірку та дії: clickButtonOpenTask(), clickButtonOpen(), clickButtonPrepared(), clickButtonOk().
   - Оновити список задач методом clickButtonRefresh().
9. Підписати авансовий звіт:
   - Повторити перевірку та дії: clickButtonOpenTask(), clickButtonOpen(), clickButtonSigned(), clickButtonOk().
   - Оновити список задач методом clickButtonRefresh().
10. Підтвердити отримання звіту:
    - Повторити перевірку та дії: clickButtonOpenTask(), clickButtonOpen(), clickButtonReceived(), clickButtonOk().
    - Оновити список задач методом clickButtonRefresh().
*/


public class TestK2TakeTask extends BaseTest {

    @Test
    public void checkTakeTask() {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        page.navigate(MHP_PAGE);
        k2TakeTask.сlickTheButtonToTheMainPage();
        Boolean actualButtonOpenTaskVisible = k2TakeTask.getButtonOpenTaskVisible();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на перевірку заборгованості в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonNoDebts();
        k2TakeTask.clickButtonOk();
        k2TakeTask.waitTime();
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на погодження керівника в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonApprove();
        k2TakeTask.clickButtonOk();
        page.waitForTimeout(120000);
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на погодження накажу в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickTaskCompleted();
        k2TakeTask.clickButtonOk();
        k2TakeTask.waitTime();
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на підтвердити дані по відрядженню в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonApprove();
        k2TakeTask.clickButtonOk();
        k2TakeTask.waitTime();
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на підтвердити дані по відрядженню в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonPrepared();
        k2TakeTask.clickButtonOk();
        k2TakeTask.waitTime();
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на підписання авансового звіту в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonSigned();
        k2TakeTask.clickButtonOk();
        k2TakeTask.waitTime();
        k2TakeTask.clickButtonRefresh();
        k2TakeTask.waitTime();
        Assertions.assertTrue(actualButtonOpenTaskVisible, "Відсутня таска на підтвердження отримання звіту в головному меню! ");
        k2TakeTask.clickButtonOpenTask();
        k2TakeTask.clickButtonOpen();
        k2TakeTask.clickButtonReceived();
        k2TakeTask.clickButtonOk();
    }

}