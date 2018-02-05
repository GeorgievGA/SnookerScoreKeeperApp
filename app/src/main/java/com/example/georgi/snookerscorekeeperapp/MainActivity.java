package com.example.georgi.snookerscorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.georgi.snookerscorekeeperapp.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int redPottedA = 0;
    int yellowPottedA = 0;
    int greenPottedA = 0;
    int brownPottedA = 0;
    int bluePottedA = 0;
    int pinkPottedA = 0;
    int blackPottedA = 0;
    int redPottedB = 0;
    int yellowPottedB = 0;
    int greenPottedB = 0;
    int brownPottedB = 0;
    int bluePottedB = 0;
    int pinkPottedB = 0;
    int blackPottedB = 0;


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
     * It also updates how many balls from each color are potted
     */

    public void redA(View view){
        scorePlayer1 += 1;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_redA);
        redPottedA += 1;
        scoreView.setText(String.valueOf(redPottedA));
    }

    public void yellowA(View view){
        scorePlayer1 += 2;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_yellowA);
        yellowPottedA += 1;
        scoreView.setText(String.valueOf(yellowPottedA));
    }

    public void greenA(View view){
        scorePlayer1 += 3;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_greenA);
        greenPottedA += 1;
        scoreView.setText(String.valueOf(greenPottedA));
    }

    public void brownA(View view){
        scorePlayer1 += 4;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_brownA);
        brownPottedA += 1;
        scoreView.setText(String.valueOf(brownPottedA));
    }

    public void blueA(View view){
        scorePlayer1 += 5;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_blueA);
        bluePottedA += 1;
        scoreView.setText(String.valueOf(bluePottedA));
    }

    public void pinkA(View view){
        scorePlayer1 += 6;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_pinkA);
        pinkPottedA += 1;
        scoreView.setText(String.valueOf(pinkPottedA));
    }

    public void blackA(View view){
        scorePlayer1 += 7;
        displayForPlayer1(scorePlayer1);
        TextView scoreView = (TextView) findViewById(R.id.score_blackA);
        blackPottedA += 1;
        scoreView.setText(String.valueOf(blackPottedA));
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
     * It also updates how many balls from each color are potted
     */

    public void redB(View view){
        scorePlayer2 += 1;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_redB);
        redPottedB += 1;
        scoreView.setText(String.valueOf(redPottedB));
    }

    public void yellowB(View view){
        scorePlayer2 += 2;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_yellowB);
        yellowPottedB += 1;
        scoreView.setText(String.valueOf(yellowPottedB));
    }

    public void greenB(View view){
        scorePlayer2 += 3;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_greenB);
        greenPottedB += 1;
        scoreView.setText(String.valueOf(greenPottedB));
    }

    public void brownB(View view){
        scorePlayer2 += 4;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_brownB);
        brownPottedB += 1;
        scoreView.setText(String.valueOf(brownPottedB));
    }

    public void blueB(View view){
        scorePlayer2 += 5;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_blueB);
        bluePottedB += 1;
        scoreView.setText(String.valueOf(bluePottedB));
    }

    public void pinkB(View view){
        scorePlayer2 += 6;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_pinkB);
        pinkPottedB += 1;
        scoreView.setText(String.valueOf(pinkPottedB));
    }

    public void blackB(View view){
        scorePlayer2 += 7;
        displayForPlayer2(scorePlayer2);
        TextView scoreView = (TextView) findViewById(R.id.score_blackB);
        blackPottedB += 1;
        scoreView.setText(String.valueOf(blackPottedB));
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
