package com.chhavi.tictactoe;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
    @InjectView(R.id.horizontal_first)
    View horizontalLineOne;
    @InjectView(R.id.horizontal_second)
    View horizontalLineTwo;
    @InjectView(R.id.horizontal_third)
    View horizontalLineThree;
    @InjectView(R.id.vertical_first)
    View verticalFirst;
    @InjectView(R.id.vertical_second)
    View verticalSecond;
    @InjectView(R.id.vertical_third)
    View verticalThird;



    int chance;
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;
    int seven = 0;
    int eight = 0;
    int nine = 0;
    Canvas canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        setLinesInvisible();


        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
            canvas = new Canvas(bitmap);

        chance = 1;


        optionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one == 0) {
                    if (chance == 1) {
                        crossOne.setVisibility(View.VISIBLE);
                        one = 1;
                        Paint paint = new Paint();
                        paint.setColor(Color.rgb(255, 153, 51));
                        paint.setStrokeWidth(10);
                        int startx = 50;
                        int starty = 90;
                        int endx = 150;
                        int endy = 360;
                        canvas.drawLine(startx, starty, endx, endy, paint);
                    } else {
                        circleOne.setVisibility(View.VISIBLE);
                        one = 2;
                    }
                    chance = 1 - chance;
                }

            }
        });
        optionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (two == 0) {
                    if (chance == 1) {
                        crossTwo.setVisibility(View.VISIBLE);
                        two = 1;
                    } else {
                        circleTwo.setVisibility(View.VISIBLE);
                        two = 2;
                    }
                    chance = 1 - chance;


                }
            }
        });

        optionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (three == 0) {
                    if (chance == 1) {
                        crossThree.setVisibility(View.VISIBLE);
                        three = 1;
                    } else {
                        circleThree.setVisibility(View.VISIBLE);
                        three = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });

        optionFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (four == 0) {
                    if (chance == 1) {
                        crossFour.setVisibility(View.VISIBLE);
                        four = 1;
                    } else {
                        circleFour.setVisibility(View.VISIBLE);
                        four = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });

        optionFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five == 0) {
                    if (chance == 1) {
                        crossFive.setVisibility(View.VISIBLE);
                        five = 1;
                    }else {
                        circleFive.setVisibility(View.VISIBLE);
                        five = 2;
                    }  chance = 1 - chance;

                }
            }
        });

        optionSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(six == 0) {
                    if (chance == 1) {
                        crossSix.setVisibility(View.VISIBLE);
                        six = 1;
                    }
                    else {
                        circleSix.setVisibility(View.VISIBLE);
                        six = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });

        optionSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(seven == 0) {
                    if (chance == 1) {
                        crossSeven.setVisibility(View.VISIBLE);
                        seven = 1;
                    }
                    else {
                        circleSeven.setVisibility(View.VISIBLE);
                        seven = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });

        optionEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eight == 0) {
                    if (chance == 1) {
                        crossEight.setVisibility(View.VISIBLE);
                        eight = 1;
                    }
                    else {
                        circleEight.setVisibility(View.VISIBLE);
                        eight = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });

        optionNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nine == 0) {
                    if (chance == 1) {
                        crossNine.setVisibility(View.VISIBLE);
                        nine = 1;
                    }
                    else {
                        circleNine.setVisibility(View.VISIBLE);
                        nine = 2;
                    }
                    chance = 1 - chance;
                }
            }
        });
    }

    void setLinesInvisible(){
        verticalFirst.setVisibility(View.INVISIBLE);
        verticalSecond.setVisibility(View.INVISIBLE);
        verticalThird.setVisibility(View.INVISIBLE);
        horizontalLineOne.setVisibility(View.INVISIBLE);
        horizontalLineTwo.setVisibility(View.INVISIBLE);
        horizontalLineThree.setVisibility(View.INVISIBLE);
    }

    boolean gameWon(){
        

        return false;
    }
}
