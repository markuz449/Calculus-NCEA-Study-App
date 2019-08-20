package com.ncea.calculusnceaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class QuestionPage extends AppCompatActivity {
    int points = 0;
    int questionNumber = 1;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        value = intent.getStringExtra("id");
        if (value.equals("Begin")) {
            Random r = new Random();
            int i1 = (r.nextInt(20) + 1);
            String findQuestion = ("diff_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";

            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }

            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("diff_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("diff_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("diff_q" + i1 + "_" + list.remove(index));

            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else
                imgbutton1.setTag("false");
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else
                imgbutton2.setTag("false");
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                imgbutton3.setTag("correct");
                System.out.println(answer3);
            } else
                imgbutton3.setTag("false");
        }

        else if(value.equals("BeginComplex")){
            TextView questionTextEdit = (TextView) findViewById(R.id.textView4);
            questionTextEdit.setText("Solve the following equations");

            Random r = new Random();
            int i1 = (r.nextInt(20) + 1);
            String findQuestion = ("complex_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";

            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }
            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("complex_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("complex_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("complex_q" + i1 + "_" + list.remove(index));

            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else
                imgbutton1.setTag("false");
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else
                imgbutton2.setTag("false");
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                imgbutton3.setTag("correct");
                System.out.println(answer3);
            } else
                imgbutton3.setTag("false");
        }

        else if(value.equals("Begin160")){
            TextView questionTextEdit = (TextView) findViewById(R.id.textView4);
            questionTextEdit.setText("Solve the following equations");

            Random r = new Random();
            int i1 = (r.nextInt(23) + 1);
            String findQuestion = ("math160_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";

            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }
            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("math160_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("math160_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("math160_q" + i1 + "_" + list.remove(index));

            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else
                imgbutton1.setTag("false");
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else
                imgbutton2.setTag("false");
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                imgbutton3.setTag("correct");
                System.out.println(answer3);
            } else
                imgbutton3.setTag("false");
        }
    }

    public void NewQuestion(View view) {
        if (value.equals("Begin")) {
            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);

            TextView gainedPoints = (TextView) findViewById(R.id.textView9);
            if (view.getId() == R.id.imageButton) {
                if (imgbutton1.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton2) {
                if (imgbutton2.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton3) {
                if (imgbutton3.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            questionNumber = questionNumber + 1;

            if (questionNumber == 11) {
                Intent resultIntent = new Intent(QuestionPage.this, Results.class);
                resultIntent.putExtra("Results", "id");
                resultIntent.putExtra("TotalPoints", points);
                QuestionPage.this.startActivity(resultIntent);
            }

            TextView questionString = (TextView) findViewById(R.id.textView3);
            if (questionNumber <= 10) {
                questionString.setText("Question " + questionNumber);
            }

            // Switch between Question Images
            Random r = new Random();
            int i1 = (r.nextInt(20) + 1);
            String findQuestion = ("diff_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";


            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }

            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("diff_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("diff_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("diff_q" + i1 + "_" + list.remove(index));

            System.out.println(answer1);
            System.out.println(answer2);
            System.out.println(answer3);

            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else {
                imgbutton1.setTag("false");
            }
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else {
                imgbutton2.setTag("false");
            }
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                System.out.println(answer3);
                imgbutton3.setTag("correct");
            } else {
                System.out.println(answer3);
                imgbutton3.setTag("false");
            }
        }

        else if (value.equals("BeginComplex")){
            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);

            TextView gainedPoints = (TextView) findViewById(R.id.textView9);
            if (view.getId() == R.id.imageButton) {
                if (imgbutton1.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton2) {
                if (imgbutton2.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton3) {
                if (imgbutton3.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            questionNumber = questionNumber + 1;

            if (questionNumber == 11) {
                Intent resultIntent = new Intent(QuestionPage.this, Results.class);
                resultIntent.putExtra("Results", "id");
                resultIntent.putExtra("TotalPoints", points);
                QuestionPage.this.startActivity(resultIntent);
            }

            TextView questionString = (TextView) findViewById(R.id.textView3);
            if (questionNumber <= 10) {
                questionString.setText("Question " + questionNumber);
            }

            // Switch between Question Images
            Random r = new Random();
            int i1 = (r.nextInt(20) + 1);
            String findQuestion = ("complex_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";


            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }

            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("complex_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("complex_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("complex_q" + i1 + "_" + list.remove(index));

            System.out.println(answer1);
            System.out.println(answer2);
            System.out.println(answer3);

            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else {
                imgbutton1.setTag("false");
            }
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else {
                imgbutton2.setTag("false");
            }
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                System.out.println(answer3);
                imgbutton3.setTag("correct");
            } else {
                System.out.println(answer3);
                imgbutton3.setTag("false");
            }
        }

        else if (value.equals("Begin160")){
            ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imageButton);
            ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imageButton2);
            ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imageButton3);

            TextView gainedPoints = (TextView) findViewById(R.id.textView9);
            if (view.getId() == R.id.imageButton) {
                if (imgbutton1.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton2) {
                if (imgbutton2.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            if (view.getId() == R.id.imageButton3) {
                if (imgbutton3.getTag().equals("correct")) {
                    points = points + 1;
                    gainedPoints.setText("Points: " + points);
                }
            }
            questionNumber = questionNumber + 1;

            if (questionNumber == 11) {
                Intent resultIntent = new Intent(QuestionPage.this, Results.class);
                resultIntent.putExtra("Results", "id");
                resultIntent.putExtra("TotalPoints", points);
                QuestionPage.this.startActivity(resultIntent);
            }

            TextView questionString = (TextView) findViewById(R.id.textView3);
            if (questionNumber <= 10) {
                questionString.setText("Question " + questionNumber);
            }

            // Switch between Question Images
            Random r = new Random();
            int i1 = (r.nextInt(23) + 1);
            String findQuestion = ("math160_q" + i1);
            //System.out.println(findQuestion);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(getResources().getIdentifier(findQuestion, "drawable", getPackageName()));

            // Switch the buttons to correct answers for the question
            int size = 3;
            String answer1 = "";
            String answer2 = "";
            String answer3 = "";


            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
                list.add(i);
            }

            Random rand = new Random();
            int index = rand.nextInt(list.size());
            answer1 = ("math160_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer2 = ("math160_q" + i1 + "_" + list.remove(index));
            index = rand.nextInt(list.size());
            answer3 = ("math160_q" + i1 + "_" + list.remove(index));

            System.out.println(answer1);
            System.out.println(answer2);
            System.out.println(answer3);

            imgbutton1.setImageResource(getResources().getIdentifier(answer1, "drawable", getPackageName()));
            if (answer1.substring(answer1.length() - 1).equals("1")) {
                imgbutton1.setTag("correct");
            } else {
                imgbutton1.setTag("false");
            }
            imgbutton2.setImageResource(getResources().getIdentifier(answer2, "drawable", getPackageName()));
            if (answer2.substring(answer2.length() - 1).equals("1")) {
                imgbutton2.setTag("correct");
            } else {
                imgbutton2.setTag("false");
            }
            imgbutton3.setImageResource(getResources().getIdentifier(answer3, "drawable", getPackageName()));
            if (answer3.substring(answer3.length() - 1).equals("1")) {
                System.out.println(answer3);
                imgbutton3.setTag("correct");
            } else {
                System.out.println(answer3);
                imgbutton3.setTag("false");
            }
        }
    }
}






