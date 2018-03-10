package com.rachelplante.periodicpocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MetalsActivity extends AppCompatActivity {
    private ImageButton mScandium;
    private ImageButton mTitanium;
    private ImageButton mVanadium;
    private ImageButton mChromium;
    private ImageButton mManganese;
    private ImageButton mIron;
    private ImageButton mCobalt;
    private ImageButton mNickel;
    private ImageButton mCopper;
    private ImageButton mZinc;
    private ImageButton mYttrium;
    private ImageButton mZirconium;
    private ImageButton mNiobium;
    private ImageButton mMolybdenum;
    private ImageButton mTechnetium;
    private ImageButton mRuthenium;
    private ImageButton mRhodium;
    private ImageButton mPalladium;
    private ImageButton mSilver;
    private ImageButton mCadmium;
    private ImageButton mHafnium;
    private ImageButton mTantalum;
    private ImageButton mTungsten;
    private ImageButton mRhenium;
    private ImageButton mOsmium;
    private ImageButton mIridium;
    private ImageButton mPlatinum;
    private ImageButton mGold;
    private ImageButton mMercury;
    private ImageButton mRutherfordium;
    private ImageButton mDubnium;
    private ImageButton mSeaborgium;
    private ImageButton mBohrium;
    private ImageButton mHassium;
    private ImageButton mMeitnerium;
    private ImageButton mDarmstadtium;
    private ImageButton mRoentgenium;
    private ImageButton mCopernicum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metals);

        mScandium = findViewById(R.id.bScandium);
        mTitanium = findViewById(R.id.bTitanium);
        mVanadium = findViewById(R.id.bVanadium);
        mChromium = findViewById(R.id.bChromium);
        mManganese = findViewById(R.id.bManganese);
        mIron = findViewById(R.id.bIron);
        mCobalt = findViewById(R.id.bCobalt);
        mNickel = findViewById(R.id.bNickel);
        mCopper = findViewById(R.id.bCopper);
        mZinc = findViewById(R.id.bZinc);
        mYttrium = findViewById(R.id.bYttrium);
        mZirconium = findViewById(R.id.bZirconium);
        mNiobium = findViewById(R.id.bNiobium);
        mMolybdenum = findViewById(R.id.bMolybdenum);
        mTechnetium = findViewById(R.id.bTechnetium);
        mRuthenium = findViewById(R.id.bRuthenium);
        mRhodium = findViewById(R.id.bRhodium);
        mPalladium = findViewById(R.id.bPalladium);
        mSilver = findViewById(R.id.bSilver);
        mCadmium = findViewById(R.id.bCadmium);
        mHafnium = findViewById(R.id.bHafnium);
        mTantalum = findViewById(R.id.bTantalum);
        mTungsten = findViewById(R.id.bTungsten);
        mRhenium = findViewById(R.id.bRhenium);
        mOsmium = findViewById(R.id.bOsmium);
        mIridium = findViewById(R.id.bIridium);
        mPlatinum = findViewById(R.id.bPlatinum);
        mGold = findViewById(R.id.bGold);
        mMercury = findViewById(R.id.bMercury);
        mRutherfordium = findViewById(R.id.bRutherfordium);
        mDubnium = findViewById(R.id.bDubnium);
        mSeaborgium = findViewById(R.id.bSeaborgium);
        mBohrium = findViewById(R.id.bBohrium);
        mHassium = findViewById(R.id.bHassium);
        mMeitnerium = findViewById(R.id.bMeitnerium);
        mDarmstadtium = findViewById(R.id.bDarmstadtium);
        mRoentgenium = findViewById(R.id.bRoentgenium);
        mCopernicum = findViewById(R.id.bCopernicium);
    }

    public void loadElement(View view) {
        String element = (String) view.getContentDescription();
        Intent intent = new Intent(this, ElementActivity.class);
        intent.putExtra("elementName", element);
        startActivity(intent);
    }
}
