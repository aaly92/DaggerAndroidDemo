package com.example.aaly.daggerandroiddemo.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.aaly.daggerandroiddemo.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
     TextView text;

    @Inject
    String apple;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.main_text);
        text.setText(apple);

        super.onCreate(savedInstanceState);
    }
}
