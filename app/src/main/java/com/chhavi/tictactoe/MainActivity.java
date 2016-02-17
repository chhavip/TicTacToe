package com.chhavi.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.circle_one)
    ImageView circleOne;
    @InjectView(R.id.cross_one)
    ImageView crossOne;
    @InjectView(R.id.circle_two)
    ImageView circleTwo;
    @InjectView(R.id.cross_two)
    ImageView crossTwo;
    @InjectView(R.id.circle_three)
    ImageView circleThree;
    @InjectView(R.id.cross_three)
    ImageView crossThree;
    @InjectView(R.id.circle_four)
    ImageView circleFour;
    @InjectView(R.id.cross_four)
    ImageView crossFour;
    @InjectView(R.id.circle_five)
    ImageView circleFive;
    @InjectView(R.id.cross_five)
    ImageView crossFive;
    @InjectView(R.id.circle_six)
    ImageView circleSix;
    @InjectView(R.id.cross_six)
    ImageView crossSix;
    @InjectView(R.id.circle_seven)
    ImageView circleSeven;
    @InjectView(R.id.cross_seven)
    ImageView crossSeven;
    @InjectView(R.id.circle_eight)
    ImageView circleEight;
    @InjectView(R.id.cross_eight)
    ImageView crossEight;
    @InjectView(R.id.circle_nine)
    ImageView circleNine;
    @InjectView(R.id.cross_nine)
    ImageView crossNine;
    @InjectView(R.id.option_one)
    RelativeLayout optionOne;
    @InjectView(R.id.option_two)
    RelativeLayout optionTwo;
    @InjectView(R.id.option_three)
    RelativeLayout optionThree;
    @InjectView(R.id.option_four)
    RelativeLayout optionFour;
    @InjectView(R.id.option_five)
    RelativeLayout optionFive;
    @InjectView(R.id.option_six)
    RelativeLayout optionSix;
    @InjectView(R.id.option_seven)
    RelativeLayout optionSeven;
    @InjectView(R.id.option_eight)
    RelativeLayout optionEight;
    @InjectView(R.id.option_nine)
    RelativeLayout optionNine;

    int chance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        chance = 1;
        optionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossOne.setVisibility(View.VISIBLE);
                else
                    circleOne.setVisibility(View.VISIBLE);
                chance = 1 - chance;

            }
        });
        optionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossTwo.setVisibility(View.VISIBLE);
                else
                    circleTwo.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossThree.setVisibility(View.VISIBLE);
                else
                    circleThree.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossFour.setVisibility(View.VISIBLE);
                else
                    circleFour.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossFive.setVisibility(View.VISIBLE);
                else
                    circleFive.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossSix.setVisibility(View.VISIBLE);
                else
                    circleSix.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossSeven.setVisibility(View.VISIBLE);
                else
                    circleSeven.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossEight.setVisibility(View.VISIBLE);
                else
                    circleEight.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });

        optionNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chance == 1)
                    crossNine.setVisibility(View.VISIBLE);
                else
                    circleNine.setVisibility(View.VISIBLE);
                chance = 1 - chance;
            }
        });
    }
}
