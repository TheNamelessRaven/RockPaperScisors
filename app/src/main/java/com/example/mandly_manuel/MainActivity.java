package com.example.mandly_manuel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView rock,paper,scisor,playercard,aicard,hp1,hp2,hp3,hp4,usrhp1,usrhp2,usrhp3,usrhp4;
    private TextView draw;
    private int ai;
    private int elet=4;
    private int elet2=4;
    private int user;
    private int dw=0;
    private boolean move=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Random rnd=new Random();
            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playercard.setImageResource(R.drawable.rock);
                    aimove();
                    user=1;

                }
            });
            scisor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playercard.setImageResource(R.drawable.scissors);
                    aimove();
                    user=3;
                }
            });
            paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playercard.setImageResource(R.drawable.paper);
                    aimove();
                    user=2;
                }
            });
        if (ai==user){
            dw++;
            draw.setText(String.valueOf(dw));
        }
        if(aicard.image)
    }
    private void eletlevon(){

        switch(elet){
            case 4:
                usrhp4.setImageResource(R.drawable.heart1);
                elet--;
                break ;
            case 3:
                usrhp3.setImageResource(R.drawable.heart1);
                elet--;
                break;
            case 2:
                usrhp2.setImageResource(R.drawable.heart1);
                elet--;
                break;
            case 1:
                usrhp1.setImageResource(R.drawable.heart1);
                elet--;
                break;
            default:;

        }
    }
    private void aielet(){
        switch(elet2){
            case 4:
                elet--;
                break ;
            case 3:
                elet--;
                break;
            case 2:
                elet--;
                break;
            case 1:
                elet--;
                break;
            default:;

        }
    }
    private void aimove() {
        Random rnd=new Random();
        ai = rnd.nextInt(3) + 1;
        if (ai == 1) {
            aicard.setImageResource(R.drawable.rock);
        }
        if (ai == 2) {
            aicard.setImageResource(R.drawable.paper);

        }
        if (ai == 3) {
            aicard.setImageResource(R.drawable.scissors);
        }


    }
    private void init() {
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scisor = findViewById(R.id.scisor);
        playercard = findViewById(R.id.playercard);
        aicard = findViewById(R.id.aicard);
        hp1 = findViewById(R.id.hp1);
        hp2 = findViewById(R.id.hp2);
        hp3 = findViewById(R.id.hp3);
        hp4 = findViewById(R.id.hp4);
        usrhp1 = findViewById(R.id.usrhp1);
        usrhp2 = findViewById(R.id.usrhp2);
        usrhp3 = findViewById(R.id.usrhp3);
        usrhp4 = findViewById(R.id.usrhp4);
        elet=4;
        ai=(int)(Math.random()*3)+1;

    }
}