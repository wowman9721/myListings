package com.company;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class AppResources extends ListResourceBundle {


        public Object[][] getContents() {
            return new Object[][] {
                    { "prop.key1", "value01" },
                    { "prop.key2", "value02" },
            };



        }


}




