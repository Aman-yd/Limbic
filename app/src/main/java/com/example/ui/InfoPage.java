package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class InfoPage extends AppCompatActivity {

    private ViewPager pager;
    private int[] layout = {R.layout.first_slide, R.layout.second_slide, R.layout.third_slide};
    private MpagerAdapter mpagerAdapter;
    private TextView[] dots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
        pager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdapter = new MpagerAdapter(layout, this);
        pager.setAdapter(mpagerAdapter);


        dotIndicator();
    }

    public void dotIndicator() {
        dots = new TextView[3];
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.transparentBlack));
        }
    }

    public void finis_slide_show(View view) {
        Intent intent = new Intent(InfoPage.this, DashBoard.class);
        startActivity(intent);
        finish();
    }

}