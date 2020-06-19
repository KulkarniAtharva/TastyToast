package com.example.tastytoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TastyToast extends AppCompatActivity
{
    static View toastLayout;
    static int duration;
    static Toast toast;
    static POSITION object = new POSITION();
    public static int LENGTH_LONG = 1, LENGTH_SHORT = 0;
    public static int SHAPE_RECTANGLE = 1, SHAPE_ROUND = 0;
    public static boolean ANDROID_TRUE = true, ANDROID_FALSE = false;

    public static POSITION simple(Context context, String message, int dur, int shape, boolean value)
    {
        if(dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);

        linearLayout.setBackgroundResource(R.drawable.toast_bg);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        if (shape == 1)   // rectangle
        {
            GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();
            gd.setCornerRadius(22);
        }

        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION info(Context context, String message, int dur, int shape, boolean value)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);


        linearLayout.setBackgroundResource(R.drawable.toast_bg);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.info, 0, 0, 0);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();

        gd.setColor(Color.parseColor("#3253B1"));

        if (shape == 1)   // rectangle
            gd.setCornerRadius(22);


        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION success(Context context, String message, int dur, int shape, boolean value)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);


        linearLayout.setBackgroundResource(R.drawable.toast_bg);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tick, 0, 0, 0);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();
        gd.setColor(Color.parseColor("#23B058"));

        if (shape == 1)   // rectangle
            gd.setCornerRadius(22);

        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION warning(Context context, String message, int dur, int shape, boolean value)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);


        linearLayout.setBackgroundResource(R.drawable.toast_bg);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.warning, 0, 0, 0);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();
        gd.setColor(Color.parseColor("#FF9529"));

        if (shape == 1)   // rectangle
            gd.setCornerRadius(22);

        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION error(Context context, String message, int dur, int shape, boolean value)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);

        linearLayout.setBackgroundResource(R.drawable.toast_bg);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.close, 0, 0, 0);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();
        gd.setColor(Color.parseColor("#FF383B"));

        if (shape == 1)   // rectangle
            gd.setCornerRadius(22);

        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION confusing(Context context, String message, int dur, int shape, boolean value)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        toastLayout = inflater.inflate(R.layout.tasty_toast, null);


        LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        // View view = inflater.inflate(R.layout.fancy_toast,linearLayout,false);

        TextView textView = toastLayout.findViewById(R.id.textview);
        textView.setCompoundDrawablePadding(26);

        linearLayout.setBackgroundResource(R.drawable.toast_bg);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.refresh, 0, 0, 0);

        if (value)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.GONE);

        GradientDrawable gd = (GradientDrawable) linearLayout.getBackground();
        gd.setColor(Color.parseColor("#597E8A"));

        if (shape == 1)   // rectangle
            gd.setCornerRadius(22);

        textView = toastLayout.findViewById(R.id.textview);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

    public static POSITION normal(Context context, String message, int dur)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, message, duration).show();

        return object;
    }

    public static POSITION normal(Context context, String message, int drawable, int dur)
    {
        if (dur == 1)
            duration = Toast.LENGTH_LONG;
        else
            duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, message, duration);

        // Getting view of a layout file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        View toastLayout = inflater.inflate(R.layout.normal_withicon, null);


        // LinearLayout linearLayout = toastLayout.findViewById(R.id.simple_toast);
        //linearLayout.setBackgroundResource(R.color.lightblue1);

        TextView textView = toastLayout.findViewById(R.id.textview);
        ImageView imageView = toastLayout.findViewById(R.id.imageview);

        imageView.setImageResource(drawable);
        textView.setText(message);

        toast.setView(toastLayout);
        toast.show();

        return object;
    }

   /* public View getinflate()
    {
        View view = getLayoutInflater().inflate(R.layout.fancy_toast,(ViewGroup)findViewById(R.id.simple_toast));

        return view;
    }*/
}