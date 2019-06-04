package com.company;

import java.util.Calendar;
import java.util.Locale;

public class InterLocale {

   public void makeLocale(){
       Calendar cal = Calendar.getInstance();
       System.out.printf(Locale.FRANCE, "%1$tB %1$tA%n", cal);
       System.out.printf(Locale.getDefault(), "%1$tB %1$tA%n", cal);
       Locale defaultLocale = Locale.getDefault();
       Locale rusLocale = new Locale("ru","RU");
       Locale usLocale = new Locale("en", "US");
       Locale frLocale = new Locale("fr", "FR");
       System.out.println(defaultLocale.getDisplayCountry());
       System.out.println(defaultLocale.getDisplayCountry(Locale.FRENCH));
       System.out.println(frLocale.getDisplayCountry(defaultLocale));
       System.out.println(usLocale.getDisplayName());
       System.out.println(usLocale.getDisplayName(frLocale));
       System.out.println(rusLocale.getDisplayName(frLocale));
       System.out.println(defaultLocale.getCountry());
       System.out.println(defaultLocale.getLanguage());
       System.out.println(defaultLocale.getVariant());

   }

}
