package com.hacktiv8.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int angka=0;
    TextView angkakounter;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);

        angkakounter=findViewById(R.id.textKounter);
    }

    public void countClick(View view) {
        angka=angka+1;
        angkakounter.setText(Integer.toString(angka));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        final EditText editText = (EditText) findViewById(R.id.edittext);
        CharSequence text = editText.getText();
        outState.putCharSequence("savedText", text);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        final  EditText editText = (EditText) findViewById(R.id.edittext);
        CharSequence savedText = savedInstanceState.getCharSequence("savedText");
        editText.setText(savedText);
    }
}