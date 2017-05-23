package com.example.glamvian.toysintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.ed_tx);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //data yang akan dikirim ke childactivity
                String dataEditText = editText.getText().toString();
                Context context = MainActivity.this;
                Class destinationClass = ChildActivity.class;
                Intent intent = new Intent(context,destinationClass);
                //method putextra yang memuat data yang akan dikirim ke chilactivity
                intent.putExtra(Intent.EXTRA_TEXT,dataEditText);
                //String message = "auooo";
                //Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}
