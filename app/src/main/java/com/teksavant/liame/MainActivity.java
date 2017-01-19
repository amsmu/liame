package com.teksavant.liame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mDoneButton;
    private EditText mNameEditText;
    private EditText mEmailEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDoneButton = (Button) findViewById(R.id.DoneButton);
        mNameEditText = (EditText) findViewById(R.id.NameEditText);
        mEmailEditText = (EditText) findViewById(R.id.EmailEditText);

        mDoneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = mNameEditText.getText().toString();
                String email = mEmailEditText.getText().toString();
                startDisplay(name, email);
            }
        });
    }


    private void startDisplay(String name, String email){
        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        intent.putExtra(getString(R.string.key_email), email);
        startActivity(intent);
    }



}
