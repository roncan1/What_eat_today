package com.WET.whateattoday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btn_choice;
    ImageButton btn_rice, btn_noodle, btn_cook, btn_bread, btn_fbf, btn_snack, btn_coffee, btn_anything, btn_ko, btn_ja, btn_ch, btn_we;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        selectCategory();
        selectAnything();
    }

    void selectAnything() {
        btn_anything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity2.class);
                startActivity(intent);
            }
        });
    }

    void selectCategory() {
        btn_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 0);
                startActivity(intent);
            }
        });
        btn_noodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 1);
                startActivity(intent);
            }
        });
        btn_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 2);
                startActivity(intent);
            }
        });
        btn_cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 3);
                startActivity(intent);
            }
        });
        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 4);
                startActivity(intent);
            }
        });
        btn_ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 5);
                startActivity(intent);
            }
        });
        btn_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 6);
                startActivity(intent);
            }
        });
        btn_we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 7);
                startActivity(intent);
            }
        });
        btn_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 8);
                startActivity(intent);
            }
        });
        btn_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 9);
                startActivity(intent);
            }
        });
        btn_fbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OptionActivity.class);
                intent.putExtra("category", 10);
                startActivity(intent);
            }
        });
    }

    void init() {
        btn_anything = (ImageButton) findViewById(R.id.btn_anything);
        btn_bread = (ImageButton) findViewById(R.id.btn_bread);
        btn_coffee = (ImageButton) findViewById(R.id.btn_coffee);
        btn_cook = (ImageButton) findViewById(R.id.btn_cook);
        btn_fbf = (ImageButton) findViewById(R.id.btn_fastfood);
        btn_noodle = (ImageButton) findViewById(R.id.btn_noodle);
        btn_rice = (ImageButton) findViewById(R.id.btn_rice);
        btn_snack = (ImageButton) findViewById(R.id.btn_snack);
        btn_ko = (ImageButton) findViewById(R.id.btn_ko);
        btn_ja = (ImageButton) findViewById(R.id.btn_ja);
        btn_ch = (ImageButton) findViewById(R.id.btn_ch);
        btn_we = (ImageButton) findViewById(R.id.btn_we);
    }
}