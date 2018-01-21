package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int griffindorHouse = 0;
    int slytherinHouse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Add one Quaffle for team Griffindor House
     */
    public void addOneQuaffleForGriffindors(View v) {
        griffindorHouse = griffindorHouse + 1;
        displayForGriffindors(griffindorHouse);
    }

    /**
     * Add one Quaffle for team Slytherin House
     */

    public void addOneQuaffleForSlytherins(View v) {
        slytherinHouse = slytherinHouse + 1;
        displayForSlytherins(slytherinHouse);
    }

    /**
     * Add one hunderd points for Griffindor House
     */
    public void addOneHundredPointsGriffindors(View v) {
        griffindorHouse = griffindorHouse + 100;
        displayForGriffindors(griffindorHouse);
    }

    /**
     * Add one hundred points to Slytherin House
     */

    public void addOneHundredPointsToSlyttherins(View v) {
        slytherinHouse = slytherinHouse + 100;
        displayForSlytherins(slytherinHouse);
    }


    /**
     * Reset
     */

    public void reset(View v) {
        griffindorHouse = 0;
        slytherinHouse = 0;
        displayForGriffindors(griffindorHouse);
        displayForSlytherins(slytherinHouse);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForGriffindors(int score) {
        TextView scoreView = (TextView) findViewById(R.id.griffindorhouse);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForSlytherins(int score) {
        TextView scoreView = (TextView) findViewById(R.id.slytherinhouse);
        scoreView.setText(String.valueOf(score));
    }
}