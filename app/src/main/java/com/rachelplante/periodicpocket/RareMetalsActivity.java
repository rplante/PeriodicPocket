package com.rachelplante.periodicpocket;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RareMetalsActivity extends AppCompatActivity {
    private ImageButton mLanthanum;
    private ImageButton mCerium;
    private ImageButton mPraseodymium;
    private ImageButton mNeodymium;
    private ImageButton mPromethium;
    private ImageButton mSamarium;
    private ImageButton mEuropium;
    private ImageButton mGadolinium;
    private ImageButton mTerbium;
    private ImageButton mDysprosium;
    private ImageButton mHolmium;
    private ImageButton mErbium;
    private ImageButton mThulium;
    private ImageButton mYtterbium;
    private ImageButton mLutetium;

    private ImageButton mActinium;
    private ImageButton mThorium;
    private ImageButton mProtactinium;
    private ImageButton mUranium;
    private ImageButton mNeptunium;
    private ImageButton mPlutonium;
    private ImageButton mAmericium;
    private ImageButton mCurium;
    private ImageButton mBerkelium;
    private ImageButton mCalifornium;
    private ImageButton mEinsteinium;
    private ImageButton mFermium;
    private ImageButton mMendelevium;
    private ImageButton mNobelium;
    private ImageButton mLawrencium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rare_metals);

        mLanthanum = findViewById(R.id.bLanthanum);
        mCerium = findViewById(R.id.bCerium);
        mPraseodymium = findViewById(R.id.bPraseodymium);
        mNeodymium = findViewById(R.id.bNeodymium);
        mPromethium = findViewById(R.id.bPromethium);
        mSamarium = findViewById(R.id.bSamarium);
        mEuropium = findViewById(R.id.bEuropium);
        mGadolinium = findViewById(R.id.bGadolinium);
        mTerbium = findViewById(R.id.bTerbium);
        mDysprosium = findViewById(R.id.bDysprosium);
        mHolmium = findViewById(R.id.bHolmium);
        mErbium = findViewById(R.id.bErbium);
        mThulium = findViewById(R.id.bThulium);
        mYtterbium = findViewById(R.id.bYtterbium);
        mLutetium = findViewById(R.id.bLutetium);

        mActinium = findViewById(R.id.bActinium);
        mThorium = findViewById(R.id.bThorium);
        mProtactinium = findViewById(R.id.bProtactinium);
        mUranium = findViewById(R.id.bUranium);
        mNeptunium = findViewById(R.id.bNeptunium);
        mPlutonium = findViewById(R.id.bPlutonium);
        mAmericium = findViewById(R.id.bAmericium);
        mCurium = findViewById(R.id.bCurium);
        mBerkelium = findViewById(R.id.bBerkelium);
        mCalifornium = findViewById(R.id.bCalifornium);
        mEinsteinium = findViewById(R.id.bEinsteinium);
        mFermium = findViewById(R.id.bFermium);
        mMendelevium = findViewById(R.id.bMendelevium);
        mNobelium = findViewById(R.id.bNobelium);
        mLawrencium = findViewById(R.id.bLawrencium);
    }

    public void loadElement(View view) {
        String element = (String) view.getContentDescription();
        Intent intent = new Intent(this, ElementActivity.class);
        intent.putExtra("elementName", element);
        startActivity(intent);
    }
}
