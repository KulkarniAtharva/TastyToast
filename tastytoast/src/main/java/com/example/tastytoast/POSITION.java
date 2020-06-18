package com.example.tastytoast;

import android.view.Gravity;

public class POSITION
{
    static String TOP="top", BOTTOM="bottom", CENTER="center", LEFT="left", RIGHT="right", TOP_LEFT="topleft", TOP_RIGHT="topright", BOTTOM_LEFT="bottomleft", BOTTOM_RIGHT="bottomright";

    public void setPosition(String position)
    {
        if(position.equals(TOP))
            TastyToast.toast.setGravity(Gravity.TOP,0,0);
        else if(position.equals(BOTTOM))
            TastyToast.toast.setGravity(Gravity.BOTTOM,0,0);
        else if(position.equals(CENTER))
            TastyToast.toast.setGravity(Gravity.CENTER,0,0);
        else if(position.equals(LEFT))
            TastyToast.toast.setGravity(Gravity.START,0,0);
        else if(position.equals(RIGHT))
            TastyToast.toast.setGravity(Gravity.END,0,0);
        else if(position.equals(TOP_LEFT))
            TastyToast.toast.setGravity(Gravity.TOP|Gravity.START,0,0);
        else if(position.equals(TOP_RIGHT))
            TastyToast.toast.setGravity(Gravity.TOP|Gravity.END,0,0);
        else if(position.equals(BOTTOM_LEFT))
            TastyToast.toast.setGravity(Gravity.BOTTOM|Gravity.START,0,0);
        else
            TastyToast.toast.setGravity(Gravity.BOTTOM|Gravity.END,0,0);
    }
}