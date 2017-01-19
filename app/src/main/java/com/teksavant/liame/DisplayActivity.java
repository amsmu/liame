package com.teksavant.liame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    private TextView mNameText;
    private TextView mEmailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        String email = intent.getStringExtra(getString(R.string.key_email));

        mNameText = (TextView) findViewById(R.id.NameText);
        mEmailText = (TextView) findViewById(R.id.EmailText);
        mNameText.setText(name);
        mEmailText.setText(email);
    }
}
