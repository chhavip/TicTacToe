package com.chhavi.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }
}
