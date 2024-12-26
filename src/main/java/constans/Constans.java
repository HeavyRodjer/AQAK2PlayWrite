package constans;

/**
 * ОПИС КОНСТАНТ З ОЧІКУВАНИМ ЧАСОМ
 */
public class Constans {
    public static class TimeoutVeribles {
        /**
         * Час очікування для явних очікувань
         */
        public static final int EXPLICT_WAIT = 10000; // у мілісекундах (Playwright працює з мілісекундами)
    }

    /**
     * ОПИС КОНСТАНТ З URL СИЛКАМИ НА ПОТРІБНУ ДЛЯ ТЕСТУ СТОРІНКУ
     */
    public static class Urls {
        public static final String MHP_PAGE = "https://k2-app.srv.mhp.com.ua/Workspace/#?linkID=90eb2f45-102c-497c-abeb-6f63744535d2&workspaceID=5c24f20f-4dc5-45a2-a6fb-70e29ecf7021";
        public static final String MHP_PAGE1 = "https://k2-app.srv.mhp.com.ua/Runtime/Runtime/Form/MHP__BusinessTrip__Landing__Form/";
        public static final String INFOBOX_PAGE = "https://dev.selfservice.bpm.mhp.ua/login";
    }

    /**
     * СЮДИ МОЖНА ПЕРЕДАВАТИ ВСЕ, ЩО БУДЕ СТОСУВАТИ СТАНДАРТНИХ ЗНАЧЕНЬ, ЯКІ ЧАСТО ВИКОРИСТОВУЮТЬСЯ
     */
}
