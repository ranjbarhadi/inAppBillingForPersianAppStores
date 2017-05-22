package net.ranjbar.persianappstoreutils;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by hadi on 22/05/2017.
 */

public class persianStore {
    public static final String PACKAGE_CAFE_BAZAAR = "com.farsitel.bazaar";
    public static final String PACKAGE_MYKET = "ir.mservices.market";


    public static final String INTENT_CAFE_BAZAAR = "ir.cafebazaar.pardakht.InAppBillingService.BIND";
    public static final String INTENT_MYKET = "ir.mservices.market.InAppBillingService.BIND";


    @Retention(SOURCE)
    @StringDef({PACKAGE_CAFE_BAZAAR, PACKAGE_MYKET})
    public @interface StorePackageName {
    }


    @Retention(SOURCE)
    @StringDef({INTENT_CAFE_BAZAAR, INTENT_MYKET})
    public @interface StoreIntent {
    }
}
