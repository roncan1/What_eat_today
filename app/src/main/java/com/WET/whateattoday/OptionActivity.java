package com.WET.whateattoday;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OptionActivity extends AppCompatActivity {

    TextView tv_price, tv_spicy;
    SeekBar sb_price, sb_spicy;
    View btn_next;
    int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        init();
        getCate();
        setSb_price();
        setSb_spicy();
        next();
    }

    void getCate() {
        Intent intent = getIntent();
        category = intent.getIntExtra("category", 0);
    }

    void next() {
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("카테고리", String.valueOf(category));
                Log.d("가격", String.valueOf(sb_price.getProgress()));
                Log.d("맵기", String.valueOf(sb_spicy.getProgress()));
                Intent intent = new Intent(OptionActivity.this, ResultActivity.class);
                intent.putExtra("category", category);
                intent.putExtra("price", sb_price.getProgress());
                intent.putExtra("spicy", sb_spicy.getProgress()+1);
                startActivity(intent);
                finish();
            }
        });
    }

    void setSb_price() {
        sb_price.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int value, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                switch (sb_price.getProgress()) {
                    case 0:
                        tv_price.setText("가격대 : ~5000");
                        break;
                    case 1:
                        tv_price.setText("가격대 : ~10000");
                        break;
                    case 2:
                        tv_price.setText("가격대 : ~15000");
                        break;
                    case 3:
                        tv_price.setText("가격대 : ~20000");
                        break;
                    case 4:
                        tv_price.setText("가격대 : 20000+");
                        break;
                }
            }
        });
    }

    void setSb_spicy() {
        sb_spicy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                switch (sb_spicy.getProgress()) {
                    case 0:
                        tv_spicy.setText("맵기 : 안매운음식");
                        break;
                    case 1:
                        tv_spicy.setText("맵기 : 매워도 ok");
                        break;
                }
            }
        });
    }

    void init() {
        sb_price = (SeekBar) findViewById(R.id.sb_price);
        sb_spicy = (SeekBar) findViewById(R.id.sb_spicy);
        tv_price = (TextView) findViewById(R.id.tv_price);
        tv_spicy = (TextView) findViewById(R.id.tv_spicy);
        btn_next = (View) findViewById(R.id.btn_next);
    }
}