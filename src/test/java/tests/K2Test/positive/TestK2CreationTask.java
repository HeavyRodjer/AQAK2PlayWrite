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
7. Натиснути "Створити":
   - Використати метод clickButtonCreate() для створення запиту.
8. Перевірити успішність створення запиту:
   - Використати метод getCreationCompleted() для перевірки наявності колонки "Дата створення", яка підтверджує успішність створення.
*/

public class TestK2CreationTask extends BaseTest {
    static  String  chekUeserName = "Ініціатор:";
    static  String  chekTypeOfBusinessTrip = "Внутрішнє";
    static  String  chekCitySending = "Ужгород";
    static  String  chekCityDestination = "Київ";
    static  String  chekProjectCompletion = "Завершення проекту";

    @Test
    public void checkCreationTask()  {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        page.navigate(MHP_PAGE1);
        k2CreationBusinessTrips.clickButtonCreation();
        String actualUeserName = k2CreationBusinessTrips.getUeserName();
        Assertions.assertEquals(chekUeserName, actualUeserName, "Не знайдено поля з Юзером! ");
        k2CreationBusinessTrips.clickUserEditButton();
        k2CreationBusinessTrips.sendTextInFieldUserName("Желобков");
        k2CreationBusinessTrips.pressEnter();
        k2CreationBusinessTrips.sendTextInFieldUserName1();
        k2CreationBusinessTrips.clickButtonRegion();
        k2CreationBusinessTrips.clickRegion();
        k2CreationBusinessTrips.clickDropDownList();
        String actualTypeOfBusinessTri = k2CreationBusinessTrips.getTypeOfBusinessTrip();
        Assertions.assertEquals(chekTypeOfBusinessTrip, actualTypeOfBusinessTri, "Не знайдено тип відрядження! ");
        k2CreationBusinessTrips.selectTheTypeOfBusinessTrip();
        k2CreationBusinessTrips.clickDropDownList();
        k2CreationBusinessTrips.clickChangeButtonCitySending();
        k2CreationBusinessTrips.enterCitySending("Ужгород");
        k2CreationBusinessTrips.pressEnter();
        String actualCitySending = k2CreationBusinessTrips.getCitySending();
        Assertions.assertEquals(chekCitySending, actualCitySending, "Не знайдено потрібне місто! ");
        k2CreationBusinessTrips.clickCitySending();
        k2CreationBusinessTrips.clickChangeButtonCityDestination();
        k2CreationBusinessTrips.enterCityDestination("Київ");
        String actualCityDestination = k2CreationBusinessTrips.getCityDestination();
        Assertions.assertEquals(chekCityDestination, actualCityDestination, "Не знайдено потрібне місто! ");
        k2CreationBusinessTrips.pressEnter();
        k2CreationBusinessTrips.clickCityDestination();
        k2CreationBusinessTrips.clickButtonOk();
        k2CreationBusinessTrips.clickButtonEnterprise();
        k2CreationBusinessTrips.enterEnterprise("МХП Пра");
        k2CreationBusinessTrips.pressEnter();
        k2CreationBusinessTrips.clickCityEnterprise();
        k2CreationBusinessTrips.clickButtonOk();
        k2CreationBusinessTrips.clickPurposeOfTheTrip();
        String actualProjectCompletion = k2CreationBusinessTrips.getProjectCompletion();
        Assertions.assertEquals(chekProjectCompletion, actualProjectCompletion, "Не знайдено потрібне підприємство! ");
        k2CreationBusinessTrips.clickProjectCompletion();
        k2CreationBusinessTrips.clickButtonDateStart();
        k2CreationBusinessTrips.clickStartDate();
        k2CreationBusinessTrips.clickButtonDateEnd();
        k2CreationBusinessTrips.clickEndDate();
        k2CreationBusinessTrips.clickButtonCreate();
        k2CreationBusinessTrips.clickButtonOk();
//        page.waitForTimeout(40000);
        boolean actualSavingCompleted = k2CreationBusinessTrips.getCreationCompleted();
        Assertions.assertTrue(actualSavingCompleted, "Відрядження не було cтворено! ");


    }

}