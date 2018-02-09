package com.hash.sapt3.srijanchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ChatScreenActivity extends AppCompatActivity {

    private static final String TAG = ChatScreenActivity.class.getSimpleName();
    private String userName;
    ImageView sendButton;
    ListView messagesList;
    EditText messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);

        Intent i = getIntent();
        userName = i.getStringExtra(Intent.EXTRA_TEXT);
        setTitle(userName);

        sendButton = findViewById(R.id.sendButton);
        messagesList = findViewById(R.id.messagesList);
        messageText = findViewById(R.id.messageEditText);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageText.getText().toString().trim();
                if (message.length() > 0) {
                    Log.d(TAG, userName + ":" + message);
                }
            }
        });

    }
}
