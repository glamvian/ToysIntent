package com.example.glamvian.toysintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mTextView = (TextView)findViewById(R.id.tv_display);
        //menangkap intent yang di kirim
        Intent intentThatStartedThisActivity = getIntent();
        //memeriksa apakah intent berisi Extras
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            //mengestrak extras
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            //menampilkan text ke layar
            mTextView.setText(textEntered);
        }
    }
}
