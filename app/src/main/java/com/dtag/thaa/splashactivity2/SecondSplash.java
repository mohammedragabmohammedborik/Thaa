package com.dtag.thaa.splashactivity2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.HomeAcitivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondSplash extends AppCompatActivity {

    @BindView(R.id.call_icon)
    ImageView callIcon;
    @BindView(R.id.text_call_us)
    TextView textCallUs;
    @BindView(R.id.email_us)
    ImageView emailUs;
    @BindView(R.id.text_email_us)
    TextView textEmailUs;
    @BindView(R.id.twitt_us)
    ImageView twittUs;
    @BindView(R.id.text_twitte_us)
    TextView textTwitteUs;
    @BindView(R.id.next)
    TextView next;
    @BindView(R.id.lin_next)
    LinearLayout linNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_splash);
        ButterKnife.bind(this);

        getWindow().setBackgroundDrawableResource(R.drawable.splach);


    }

    @OnClick({R.id.call_icon, R.id.text_call_us, R.id.email_us, R.id.text_email_us, R.id.twitt_us, R.id.text_twitte_us, R.id.lin_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.call_icon:
                break;
            case R.id.text_call_us:
                break;
            case R.id.email_us:
                email_us();

                break;
            case R.id.text_email_us:

                email_us();

                break;
            case R.id.twitt_us:
               twitt_us();
                break;
            case R.id.text_twitte_us:
                twitt_us();


                break;
            case R.id.lin_next:
                startActivity(new Intent(SecondSplash.this, HomeAcitivity.class));

                break;

        }
    }

    public void email_us(){
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        emailIntent.setType("vnd.android.cursor.item/email");
        // emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[] {"thaa.app1@gmail.com"});
        // emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "My Email Subject");
        // emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "My email content");
        startActivity(Intent.createChooser(emailIntent, "Send mail using..."));


    }

    public void twitt_us(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/thaa_app"));
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory(Intent.CATEGORY_HOME);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }
}
