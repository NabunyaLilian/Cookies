package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        ImageView cookiePhoto = findViewById(R.id.image_cookie);
        TextView message = findViewById(R.id.text_message);
        cookiePhoto.setImageResource(R.drawable.after_cookie);
        message.setText(R.string.msg_im_so_full);
    }
}
