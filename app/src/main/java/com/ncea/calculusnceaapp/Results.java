package com.ncea.calculusnceaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        String value = intent.getStringExtra("Results");
        int points = intent.getIntExtra("TotalPoints", 0);
        TextView resultEdit = (TextView) findViewById(R.id.textView8);
        resultEdit.setText("You scored " + points + " out of 10 in the Quiz");

        TextView message = (TextView) findViewById(R.id.textView7);
        if (points == 10) {
            message.setText("You Scored a perfect 10 out of 10, well done for doing so well. Fam would be proud");
        } else if (7 <= points && points < 10) {
            message.setText(points + " is a decent score however you can still do even better");
        } else if (4 <= points && points < 7) {
            message.setText(points + " is an average score but not good enough to pass the exams however you are close, keep going");
        } else if (1 <= points && points < 4) {
            message.setText("You got less than half, I know you can do better have another go please");
        } else if (points < 1) {
            message.setText("You scored 0, that is what Kyle scored on the practice exam, I am 100% sure you can do better");
        }
    }

    public void newQuiz(View view) {
        Intent nextQuiz = new Intent(Results.this, CalculusActivity.class);
        nextQuiz.putExtra("New Quiz", "id");
        Results.this.startActivity(nextQuiz);
    }

    public void endProgram(View view) {
        moveTaskToBack(true);
        Results.this.finish();
    }
}

