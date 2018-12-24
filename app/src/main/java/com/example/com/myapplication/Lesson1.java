package com.example.com.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson1 extends AppCompatActivity {
 private int Count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Lesson1 );
        final ImageView imageView = (ImageView) findViewById(R.id.image);

        imageView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                    Count++;
                    if(Count % 2 != 0){
                        imageView.setImageResource(R.drawable.second);
                    }else{
                        imageView.setImageResource(R.drawable.first);
                    }

            }
        });

    }
}
