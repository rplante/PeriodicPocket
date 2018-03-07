package com.rachelplante.periodicpocket;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rachel on 3/7/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ElementInfo";
    //Elements Table
    private static final String TABLE_ELEMENTS = "Elements";
    //Elements Columns
    private static final String PK_NAME = "name";
    private static final String SYMBOL = "symbol";
    private static final String ATNUM = "atNum";
    private static final String ATWEIGHT = "atWeight";
    private static final String PERIOD = "period";
    private static final String GROUP = "group";
    private static final String FAMILY = "family";
    private static final String STATE = "state";
    private static final String RADIOACTIVITY = "radioactivity";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ELEMENTS_TABLE = "CREATE TABLE " + TABLE_ELEMENTS + "(" +
                                        PK_NAME + " TEXT PRIMARY KEY," +
                                        SYMBOL + " TEXT," +
                                        ATNUM + " INTEGER," +
                                        ATWEIGHT + " REAL," +
                                        PERIOD + " TEXT," +
                                        GROUP + " TEXT," +
                                        FAMILY + " NUMBER," +
                                        STATE + " NUMBER," +
                                        RADIOACTIVITY + " TEXT" + ")";
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
    public Element getElement(String name) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_ELEMENTS, new String[] {PK_NAME, SYMBOL, ATNUM, ATWEIGHT,
                                                               PERIOD, GROUP, FAMILY, STATE,
                                                               RADIOACTIVITY}, PK_NAME + "=?",
                                                 new String[] {String.valueOf(name) }, null,null,null,null);
        if(cursor != null)
            cursor.moveToFirst();

        Element element = new Element(cursor.getString(0),
                                      cursor.getString(1),
                                      Integer.parseInt(cursor.getString(2)),
                                      Float.parseFloat(cursor.getString(3)),
                                      cursor.getString(4),
                                      cursor.getString(5),
                                      Family.values()[Integer.parseInt(cursor.getString(6))],
                                      State.values()[Integer.parseInt(cursor.getString(7))],
                                      Boolean.parseBoolean(cursor.getString(8)));

        cursor.close();
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
