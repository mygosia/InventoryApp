package com.example.android.inventoryapp.Data;

import android.provider.BaseColumns;

public class BookContract {

    private BookContract() {}

    public static final class BookEntry implements BaseColumns {

        // Name of database table
        public final static String TABLE_NAME = "books";

        // Unique ID number
        public final static String _ID = BaseColumns._ID;

        //Product name; data type TEXT
        public final static String COLUMN_PRODUCT_NAME ="name";

        //Product price; data type INTEGER
        public final static String COLUMN_PRICE = "price";

        //Product quantity; data type INTEGER
        public final static String COLUMN_QUANTITY = "quantity";

        //Product supplier name; data type TEXT
        public final static String COLUMN_SUPPLIER_NAME = "supplier";

        //Product supplier phone; data type INTEGER
        public final static String COLUMN_SUPPLIER_PHONE = "phone";
    }
}
