package com.ncea.calculusnceaapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class StartScreenActivity extends AppCompatActivity {
String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Intent intent = getIntent();
        message = intent.getStringExtra("id");
        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setText(message + " Quiz");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_start_screen);
        layout.addView(textView);

    }

    public void begin(View view) {
        Intent beginIntent = new Intent(StartScreenActivity.this, QuestionPage.class);
        if (message.equals("Complex Numbers")) {
            beginIntent.putExtra("id", "BeginComplex");
        }
        else if (message.equals("Math 160")) {
            beginIntent.putExtra("id", "Begin160");
        }else {
        beginIntent.putExtra("id","Begin");}
        StartScreenActivity.this.startActivity(beginIntent);

    }
}
