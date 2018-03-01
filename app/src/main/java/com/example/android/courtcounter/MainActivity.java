package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreview = (TextView)findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void increment3ForA(View view){
        scoreA = scoreA+3;
        displayForTeamA(scoreA);
    }
    public void increment2ForA(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void incrementForA(View view){
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void increment3ForB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void increment2ForB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void incrementForB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void scoreReset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
