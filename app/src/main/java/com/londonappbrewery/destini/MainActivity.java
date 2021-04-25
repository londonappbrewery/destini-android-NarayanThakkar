package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbuttonTop;
    Button mbuttonButtom;
    TextView mQuestionView;
    int mcurrentIndx;
    QuestionBank[] questions = {new QuestionBank(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2,R.string.T3_Story,R.string.T2_Story),
            new QuestionBank(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2,R.string.T3_Story,R.string.T4_End),
            new QuestionBank(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2,R.string.T6_End,R.string.T5_End)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbuttonButtom = findViewById(R.id.buttonBottom);
        mbuttonTop = findViewById(R.id.buttonTop);
        mQuestionView = findViewById(R.id.storyTextView);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mQuestionView.setText(questions[mcurrentIndx].getMcurrentQuestionIndx());
        mbuttonTop.setText(questions[mcurrentIndx].getMcurrentTopIndx());
        mbuttonButtom.setText(questions[mcurrentIndx].getMcurrentButtom());
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions[mcurrentIndx].mnextQuestionIndx == R.string.T2_Story)
                {
                    mcurrentIndx = 1;
                    updateScreen();
                }
                else if(questions[mcurrentIndx].mnextQuestionIndx == R.string.T3_Story)
                {
                    mcurrentIndx = 2;
                    updateScreen();
                }
                else
                {
                    mQuestionView.setText(questions[mcurrentIndx].mnextQuestionIndx);
                    mbuttonTop.setVisibility(view.INVISIBLE);
                    mbuttonButtom.setVisibility(view.INVISIBLE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions[mcurrentIndx].mnextQuestionIndx2 == R.string.T2_Story)
                {
                    mcurrentIndx = 1;
                    updateScreen();
                }
                else if(questions[mcurrentIndx].mnextQuestionIndx2 == R.string.T3_Story)
                {
                    mcurrentIndx = 2;
                    updateScreen();
                }
                else
                {
                    mQuestionView.setText(questions[mcurrentIndx].mnextQuestionIndx2);
                    mbuttonTop.setVisibility(view.INVISIBLE);
                    mbuttonButtom.setVisibility(view.INVISIBLE);
                }
            }
        });


    }
    void updateScreen()
    {
        mQuestionView.setText(questions[mcurrentIndx].getMcurrentQuestionIndx());
        mbuttonTop.setText(questions[mcurrentIndx].getMcurrentTopIndx());
        mbuttonButtom.setText(questions[mcurrentIndx].getMcurrentButtom());
    }
}
