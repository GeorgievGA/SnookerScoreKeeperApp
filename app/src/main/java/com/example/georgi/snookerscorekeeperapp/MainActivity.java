package com.example.georgi.snookerscorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.georgi.snookerscorekeeperapp.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds the given points for each ball to scorePlayer1 and displays the new score for Player 1
     */

    public void redA(View view){
        scorePlayer1 += 1;
        displayForPlayer1(scorePlayer1);
    }

    public void yellowA(View view){
        scorePlayer1 += 2;
        displayForPlayer1(scorePlayer1);
    }

    public void greenA(View view){
        scorePlayer1 += 3;
        displayForPlayer1(scorePlayer1);
    }

    public void brownA(View view){
        scorePlayer1 += 4;
        displayForPlayer1(scorePlayer1);
    }

    public void blueA(View view){
        scorePlayer1 += 5;
        displayForPlayer1(scorePlayer1);
    }

    public void pinkA(View view){
        scorePlayer1 += 6;
        displayForPlayer1(scorePlayer1);
    }

    public void blackA(View view){
        scorePlayer1 += 7;
        displayForPlayer1(scorePlayer1);
    }


    /**
     * If a foul is committed the points are added to the opponent (Player 2)
     */

    public void foulFourA (View view){
        scorePlayer2 += 4;
        displayForPlayer2(scorePlayer2);
    }

    public void foulFiveA (View view){
        scorePlayer2 += 5;
        displayForPlayer2(scorePlayer2);
    }

    public void foulSixA (View view){
        scorePlayer2 += 6;
        displayForPlayer2(scorePlayer2);
    }

    public void foulSevenA (View view){
        scorePlayer2 += 7;
        displayForPlayer2(scorePlayer2);
    }


    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds the given points for each ball to scorePlayer2 and displays the new score for Player 2
     */

    public void redB(View view){
        scorePlayer2 += 1;
        displayForPlayer2(scorePlayer2);
    }

    public void yellowB(View view){
        scorePlayer2 += 2;
        displayForPlayer2(scorePlayer2);
    }

    public void greenB(View view){
        scorePlayer2 += 3;
        displayForPlayer2(scorePlayer2);
    }

    public void brownB(View view){
        scorePlayer2 += 4;
        displayForPlayer2(scorePlayer2);
    }

    public void blueB(View view){
        scorePlayer2 += 5;
        displayForPlayer2(scorePlayer2);
    }

    public void pinkB(View view){
        scorePlayer2 += 6;
        displayForPlayer2(scorePlayer2);
    }

    public void blackB(View view){
        scorePlayer2 += 7;
        displayForPlayer2(scorePlayer2);
    }


    /**
     * If a foul is committed the points are added to the opponent (Player 1)
     */

    public void foulFourB (View view){
        scorePlayer1 += 4;
        displayForPlayer1(scorePlayer1);
    }

    public void foulFiveB (View view){
        scorePlayer1 += 5;
        displayForPlayer1(scorePlayer1);
    }

    public void foulSixB (View view){
        scorePlayer1 += 6;
        displayForPlayer1(scorePlayer1);
    }


    public void foulSevenB (View view){
        scorePlayer1 += 7;
        displayForPlayer1(scorePlayer1);
    }


    /**
     * Resets all scores to 0 in order to start a new game
     */

    public void Reset (View view){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

}
