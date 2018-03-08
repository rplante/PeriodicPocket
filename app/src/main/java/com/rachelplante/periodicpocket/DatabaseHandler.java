package com.rachelplante.periodicpocket;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Rachel on 3/7/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ElementInfo";
    //Elements Table
    private static final String TABLE_ELEMENTS = "Elements";
    //Elements Columns
    private static final String PK_NAME = "eName";
    private static final String SYMBOL = "eSymbol";
    private static final String ATNUM = "eAtNum";
    private static final String ATWEIGHT = "eAtWeight";
    private static final String PERIOD = "ePeriod";
    private static final String GROUP = "eGroup";
    private static final String FAMILY = "eFamily";
    private static final String STATE = "eState";
    private static final String RADIOACTIVITY = "eRadioactivity";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String REMOVE_OLD_TABLE = "DROP TABLE IF EXISTS " + TABLE_ELEMENTS;
        String CREATE_ELEMENTS_TABLE = "CREATE TABLE " + TABLE_ELEMENTS + "(" +
                                        PK_NAME + " TEXT PRIMARY KEY, " +
                                        SYMBOL + " TEXT, " +
                                        ATNUM + " INTEGER, " +
                                        ATWEIGHT + " REAL, " +
                                        PERIOD + " TEXT, " +
                                        GROUP + " NUMBER, " +
                                        FAMILY + " NUMBER, " +
                                        STATE + " TEXT, " +
                                        RADIOACTIVITY + " TEXT" + ")";
        db.execSQL(REMOVE_OLD_TABLE);
        db.execSQL(CREATE_ELEMENTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ELEMENTS);
        onCreate(db);
    }

    //Add new element
    public void addElement(Element element) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(PK_NAME, element.getName());
        values.put(SYMBOL, element.getSymbol());
        values.put(ATNUM, element.getAtNum());
        values.put(ATWEIGHT, element.getAtWeight());
        values.put(PERIOD, element.getPeriod());
        values.put(GROUP, element.getGroup());
        values.put(FAMILY, element.getFamily().toString());
        values.put(STATE, element.getState().toString());
        values.put(RADIOACTIVITY, element.getRadioactivity());

        db.insert(TABLE_ELEMENTS, null, values);
        db.close();
    }
    //Get element
    public Element getElement(String eName) {
        SQLiteDatabase db = this.getReadableDatabase();
        Element element;

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_ELEMENTS + " WHERE " + PK_NAME + " = \"" + eName + "\"", null);
        if(cursor != null && cursor.moveToFirst()) {
            element = new Element(cursor.getString(0),
                    cursor.getString(1),
                    cursor.getInt(2),
                    cursor.getFloat(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    Family.values()[cursor.getInt(6)],
                    State.values()[cursor.getInt(7)],
                    Boolean.parseBoolean(cursor.getString(8)));

            cursor.close();
        }
        else {
            //this means our db never had the inserts performed on it...
            Log.d("DBHandler.getElement : ", "DB values never inserted into DB");
            element = new Element("nullElement", "nullElement", 0, 0.0f, "nullElement", "nullElement", Family.UNKNOWN, State.UNKNOWN, false);
        }
        return element;
    }
    //Get count of elements
    public int getElementsCount() {
        String countQuery = "SELECT * FROM " + TABLE_ELEMENTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        return cursor.getCount();
    }
    //Update single element
    public int updateElement(Element element) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(PK_NAME, element.getName());
        values.put(SYMBOL, element.getSymbol());
        values.put(ATNUM, element.getAtNum());
        values.put(ATWEIGHT, element.getAtWeight());
        values.put(PERIOD, element.getPeriod());
        values.put(GROUP, element.getGroup());
        values.put(FAMILY, element.getFamily().toString());
        values.put(STATE, element.getState().toString());
        values.put(RADIOACTIVITY, element.getRadioactivity());

        return db.update(TABLE_ELEMENTS, values, PK_NAME + " = ?",
                new String[] { String.valueOf(element.getName())});
    }
    //Delete an element
    public void deleteElement(Element element) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_ELEMENTS, PK_NAME + " = ?",
                new String[] { String.valueOf(element.getName())});
        db.close();
    }
}
