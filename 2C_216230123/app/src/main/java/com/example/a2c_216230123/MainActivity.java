package com.example.a2c_216230123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jji(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void jjeong(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void sett(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }


    public void hheart(View view) {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }
    public void gal(View view) {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
}
