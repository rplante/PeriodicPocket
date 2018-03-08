package com.rachelplante.periodicpocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ElementActivity extends AppCompatActivity {

    protected DatabaseHandler db;

    private TextView tName;
    private TextView tSymbol;
    private TextView tNum;
    private TextView tWeight;
    private TextView tPeriod;
    private TextView tGroup;
    private TextView tFamily;
    private TextView tState;
    private TextView tRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);

        db = new DatabaseHandler(this);

        tName = findViewById(R.id.elementName);
        tSymbol = findViewById(R.id.elementSymbol);
        tNum = findViewById(R.id.elementNum);
        tWeight = findViewById(R.id.elementWeight);
        tPeriod = findViewById(R.id.elementPeriod);
        tGroup = findViewById(R.id.elementGroup);
        tFamily = findViewById(R.id.elementFamily);
        tState = findViewById(R.id.elementState);
        tRadio = findViewById(R.id.elementRadioactivity);

        PopulateDatabaseActivity.populateDatabase(db);
    }

    public void loadInfo(View view) {
        Element test = db.getElement("Hydrogen");

        String mName = test.getName();
        String mSymbol = test.getSymbol();
        int mNum = test.getAtNum();
        float mWeight = test.getAtWeight();
        String mPeriod = test.getPeriod();
        String mGroup = test.getGroup();
        Family mFamily = test.getFamily();
        State mState = test.getState();
        boolean mRadio;
        if (test.getRadioactivity()) mRadio = true;
        else mRadio = false;

        tName.setText("Name: " + mName);
        tSymbol.setText("Atomic Symbol: " + mSymbol);
        tNum.setText("Atomic Number: " + Integer.toString(mNum));
        tWeight.setText("Atomic Weight: " + Float.toString(mWeight));
        tPeriod.setText("Period: " + mPeriod);
        tGroup.setText("Group: " + mGroup);
        tFamily.setText("Family: " + mFamily.toString());
        tState.setText("State at 0*C: " + mState.toString());
        if (mRadio) tRadio.setText("Radioactive? Yes");
        else tRadio.setText("Radioactive? No");

    }
}
