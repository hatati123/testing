package com.adria.testchallenge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GrapheActivity extends AppCompatActivity  {



    String date;
    float rate;
    @BindView(R.id.linechart)
    LineChart lineChart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphe);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        date = intent.getStringExtra("date");
        rate = (float) intent.getDoubleExtra("rate", 0);





    }


}
