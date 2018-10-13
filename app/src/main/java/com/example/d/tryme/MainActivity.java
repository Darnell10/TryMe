package com.example.d.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.windowViewId)
    View windowView;

    @BindView(R.id.tryMeButton)
    Button tryMe;

    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        colors = new int[]{Color.YELLOW,Color.BLACK,Color.BLUE,Color.GRAY,Color.MAGENTA,Color.RED,Color.GREEN,
                            Color.LTGRAY};



        tryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorArrayLenght = colors.length;

                Random random = new Random();
                int randomNum =random.nextInt(colorArrayLenght);

                windowView.setBackgroundColor(colors[randomNum]);

                //Logs that button is pressed
                Log.d("TEST","tap");
                //Logs that new color is actually random
                Log.d("Random",String.valueOf(randomNum));
            }
        });
    }
}
