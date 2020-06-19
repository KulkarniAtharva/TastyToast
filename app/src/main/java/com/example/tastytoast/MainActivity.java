package com.example.tastytoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TastyToast.info(this,"This is a Normal Toast w/o icon",TastyToast.LENGTH_SHORT,TastyToast.SHAPE_RECTANGLE,TastyToast.ANDROID_FALSE).setPosition(POSITION.TOP_LEFT);
    }
}