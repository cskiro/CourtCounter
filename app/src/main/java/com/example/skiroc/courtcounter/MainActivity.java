package com.example.skiroc.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int THREE_POINTER = 3;
    private static final int TWO_POINTER = 2;
    private static final int FREE_THROW =1;
    private int pointsScored = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.team_score);
        quantityTextView.setText("" + number);
    }

    public void addThreePoints(View view) {
        pointsScored += THREE_POINTER;
        display(pointsScored);
    }

    public void addTwoPoints(View view) {
        pointsScored += TWO_POINTER;
        display(pointsScored);
    }

    public void addFreeThrow(View view) {
        pointsScored += FREE_THROW;
        display(pointsScored);
    }

    public void clearScore(View view) {
        display(0);
    }

}
