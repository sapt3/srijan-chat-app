package com.hash.sapt3.srijanchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final TextView mUserTV = findViewById(R.id.usernameTextView);
        Button login = findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = mUserTV.getText().toString().trim();
                if (userName.length() > 0) {
                    Intent i = new Intent(SignUpActivity.this, ChatScreenActivity.class);
                    i.putExtra(Intent.EXTRA_TEXT, userName);
                    startActivity(i);
                }
                //COMPLETED: Enter intent code
            }
        });
    }
}

