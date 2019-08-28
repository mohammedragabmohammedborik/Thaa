package com.dtag.thaa;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.snackbar.Snackbar;

public class UtilityHeleper {


    public  static void showDialog_confirmation(Context activity, String dialgText, String secondary ) {
        final Dialog dialog = new Dialog(activity);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_confirmation);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        TextView main_text , secondary_text;
        ImageView close_image;



        main_text=(TextView) dialog.findViewById(R.id.maindialog_text);


        secondary_text=(TextView)dialog.findViewById(R.id.dialog_text_value);

        main_text.setText(dialgText);
        secondary_text.setText(secondary);

        close_image=(ImageView) dialog.findViewById(R.id.close_i);


        close_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });

        dialog.show();

    }

    public  static  void showSnackBar(View view, String secifyText1, Context context){

        Snackbar snackbar = Snackbar
                .make(view, secifyText1, Snackbar.LENGTH_LONG)
                .setAction("اخفاء", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                });
        View view1 = snackbar.getView();
        FrameLayout.LayoutParams languageContainerLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view1.getLayoutParams();
        view1.setBackgroundColor(Color.RED);
        params.gravity = Gravity.TOP;


        TypedValue tv = new TypedValue();
        int actionBarHeight=0;
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, tv, true))
        {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,context.getResources().getDisplayMetrics());
        }
        params.setMargins(0, actionBarHeight+40, 0, 0);

        view1.setLayoutParams(params);


        snackbar.setActionTextColor(context.getResources() .getColor(R.color.white_color));


        TextView mainTextView = (TextView) (view1).findViewById(R.id.snackbar_text);
        mainTextView.setTextColor(context.getResources() .getColor(R.color.white_color));

        snackbar.show();

    }
    public  static  void showSnackBar2(View view, String secifyText1, Context context){

        Snackbar snackbar = Snackbar
                .make(view, secifyText1, Snackbar.LENGTH_LONG);
//                .setAction("اخفاء", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                    }
//                });
        View view1 = snackbar.getView();

        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view1.getLayoutParams();
        view1.setBackgroundColor(context.getResources().getColor(R.color.snackbar));
        params.gravity = Gravity.BOTTOM;


        TypedValue tv = new TypedValue();
        int actionBarHeight=0;
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, tv, true))
        {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,context.getResources().getDisplayMetrics());
        }
        params.setMargins(0, actionBarHeight+40, 0, 0);

        view1.setLayoutParams(params);


        snackbar.setActionTextColor(context.getResources() .getColor(R.color.white_color));


        TextView mainTextView = (TextView) (view1).findViewById(R.id.snackbar_text);
        mainTextView.setTextSize(18);
        mainTextView.setTextColor(context.getResources() .getColor(R.color.white_color));


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            mainTextView.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        } else {
            mainTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        }



        snackbar.show();

    }



    public  static  void showsnackbartop(View view, String secifyText1, Context context){

        Snackbar snackbar = Snackbar
                .make(view, secifyText1, Snackbar.LENGTH_LONG);
//                .setAction("اخفاء", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                    }
//                });
        View view1 = snackbar.getView();

        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view1.getLayoutParams();
        view1.setBackgroundColor(context.getResources().getColor(R.color.snackbar));
        params.gravity = Gravity.TOP;


        TypedValue tv = new TypedValue();
        int actionBarHeight=0;
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, tv, true))
        {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,context.getResources().getDisplayMetrics());
        }
        params.setMargins(0, 74, 0, 0);

        view1.setLayoutParams(params);


        snackbar.setActionTextColor(context.getResources() .getColor(R.color.white_color));


        TextView mainTextView = (TextView) (view1).findViewById(R.id.snackbar_text);
        mainTextView.setTextSize(18);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.cairobold);
        mainTextView.setTypeface(typeface);
        mainTextView.setTextColor(context.getResources() .getColor(R.color.white_color));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            mainTextView.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        } else {
            mainTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        }


        snackbar.show();

    }

    public  static  boolean  checkConnection(Context context){
        ConnectivityManager connMgr = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;

        }
        return  false;
        }



}
