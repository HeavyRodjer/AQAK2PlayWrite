package tests.K2Test.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;


import static constans.Constans.Urls.MHP_PAGE1;

/*
Кроки:
1. Натиснути кнопку "Створення"
   Використовувати метод clickButtonCreation().
2. Редагувати інформацію про ініціатора:
   - Натиснути кнопку редагування користувача (clickUserEditButton()).
   - У відображеному iframe знайти поле для введення користувача (sendTextInFieldUserName(String UserName)) і ввести ім'я, наприклад, UserName.
   - Натиснути Enter для підтвердження вибору користувача (pressEnter()).
3. Вибрати тип відрядження:
   - Натиснути на випадаючий список (clickDropDownList()).
   - Вибрати значення "Внутрішнє" (selectTheTypeOfBusinessTrip()).
4. Заповнити інформацію про міста та підприємство:
   - Вибрати місто відправлення:
     - Натиснути кнопку вибору міста (clickChangeButtonCitySending()).
     - Ввести назву міста (наприклад, "Ужгород") у відповідне поле (enterCitySending(String CitySending)).
     - Двічі натиснути на вибраний пункт ("Ужгород") (clickCitySending()).
   - Повторити аналогічні дії для міста прибуття (наприклад, "Київ") за допомогою методів
     clickChangeButtonCityDestination() → enterCityDestination(String CityDestination) → clickCityDestination().
   - Вибрати підприємство:
     - Натиснути кнопку вибору підприємства (clickButtonEnterprise()).
     - Ввести назву підприємства (наприклад, "МХП") (enterEnterprise(String Enterprise)).
     - Двічі натиснути на вибраний пункт підприємства (clickCityEnterprise()).
5. Вибрати причину відрядження:
   - Натиснути на поле "Мета відрядження" (clickPurposeOfTheTrip()).
   - Вибрати причину "Завершення проекту" (clickProjectCompletion()).
6. Вибрати дати відрядження:
   - Натиснути кнопку вибору дати початку (clickButtonDateStart()) і вибрати потрібну дату (clickStartDate()).
   - Аналогічно вибрати дату закінчення відрядження (clickButtonDateEnd() → clickEndDate()).
7. Натиснути "Зберегти":
   - Використати метод clickButtonSaving() для збереження запиту.
8. Перевірити успішність збереження запиту:
   - Використати метод getSavingCompleted() для перевірки наявності колонки "Дата збереження", яка підтверджує успішність збереження.
*/


public class TestSavingBusinessTrips extends BaseTest {
    static  String  chekUeserName = "Ініціатор:";
    static  String  chekTypeOfBusinessTrip = "Внутрішнє";
    static  String  chekCitySending = "Ужгород";
    static  String  chekCityDestination = "Київ";
    static  String  chekProjectCompletion = "Завершення проекту";
    static  String  chekSavingCompleted = "Відрядження було збережено.";

    @Test
    public void checkSavingTask()  {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        page.navigate(MHP_PAGE1);
        k2SavingBusinessTrips.clickButtonCreation();
        String actualUeserName = k2SavingBusinessTrips.getUeserName();
        Assertions.assertEquals(chekUeserName, actualUeserName, "Не знайдено поля з Юзером! ");
        k2SavingBusinessTrips.clickUserEditButton();
        k2SavingBusinessTrips.sendTextInFieldUserName("Желобков");
        k2SavingBusinessTrips.pressEnter();
        k2SavingBusinessTrips.sendTextInFieldUserName1();
        k2SavingBusinessTrips.clickButtonRegion();
        k2SavingBusinessTrips.clickRegion();
        k2SavingBusinessTrips.clickDropDownList();
        String actualTypeOfBusinessTri = k2SavingBusinessTrips.getTypeOfBusinessTrip();
        Assertions.assertEquals(chekTypeOfBusinessTrip, actualTypeOfBusinessTri, "Не знайдено тип відрядження! ");
        k2SavingBusinessTrips.selectTheTypeOfBusinessTrip();
        k2SavingBusinessTrips.clickDropDownList();
        k2SavingBusinessTrips.clickChangeButtonCitySending();
        k2SavingBusinessTrips.enterCitySending("Ужгород");
        k2SavingBusinessTrips.pressEnter();
        String actualCitySending = k2SavingBusinessTrips.getCitySending();
        Assertions.assertEquals(chekCitySending, actualCitySending, "Не знайдено потрібне місто! ");
        k2SavingBusinessTrips.clickCitySending();
        k2SavingBusinessTrips.clickChangeButtonCityDestination();
        k2SavingBusinessTrips.enterCityDestination("Київ");
        String actualCityDestination = k2SavingBusinessTrips.getCityDestination();
        Assertions.assertEquals(chekCityDestination, actualCityDestination, "Не знайдено потрібне місто! ");
        k2SavingBusinessTrips.pressEnter();
        k2SavingBusinessTrips.clickCityDestination();
        k2SavingBusinessTrips.clickButtonOk();
        k2SavingBusinessTrips.clickButtonEnterprise();
        k2SavingBusinessTrips.enterEnterprise("МХП Пра");
        k2SavingBusinessTrips.pressEnter();
        k2SavingBusinessTrips.clickCityEnterprise();
        k2SavingBusinessTrips.clickButtonOk();
        k2SavingBusinessTrips.clickPurposeOfTheTrip();
        String actualProjectCompletion = k2SavingBusinessTrips.getProjectCompletion();
        Assertions.assertEquals(chekProjectCompletion, actualProjectCompletion, "Не знайдено потрібне підприємство! ");
        k2SavingBusinessTrips.clickProjectCompletion();
        k2SavingBusinessTrips.clickButtonDateStart();
        k2SavingBusinessTrips.clickStartDate();
        k2SavingBusinessTrips.clickButtonDateEnd();
        k2SavingBusinessTrips.clickEndDate();
        k2SavingBusinessTrips.clickButtonSave();
        k2SavingBusinessTrips.clickButtonOk();
//        page.waitForTimeout(60000);
        boolean actualSavingCompleted = k2SavingBusinessTrips.getSavingCompleted();
        Assertions.assertTrue(actualSavingCompleted, "Відрядження не було p,tht;tyj! ");


    }

}