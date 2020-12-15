package com.example.demoches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView brook1, bkngiht1, bbishop1, bqueen, bking, brook2, bknight2, bbishop2;
    TextView bpawn1, bpawn2, bpawn3, bpawn4, bpawn5, bpawn6, bpawn7, bpawn8;
    TextView wrook1, wkngiht1, wbishop1, wqueen, wking, wrook2, wknight2, wbishop2;
    TextView wpawn1, wpawn2, wpawn3, wpawn4, wpawn5, wpawn6, wpawn7, wpawn8;


    Button btEnd;
    TextView p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btEnd = findViewById(R.id.btnEndGame);
        p1 = findViewById(R.id.game_over);
        p2 = findViewById(R.id.game_over2);

        btEnd.setVisibility(View.INVISIBLE);
        p1.setVisibility(View.INVISIBLE);
        p2.setVisibility(View.INVISIBLE);

        btEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        initialize();
        setValues();
        checkForValidMove();

    }



    private void setValues() {
        // black coins
        // for the first row
        brook1.setBackgroundResource(R.drawable.rookblack);
        bkngiht1.setBackgroundResource(R.drawable.knightblack);
        bbishop1.setBackgroundResource(R.drawable.bishopblack);
        bqueen.setBackgroundResource(R.drawable.queenblack);
        bking.setBackgroundResource(R.drawable.kingblack);
        bbishop2.setBackgroundResource(R.drawable.bishopblack);
        bknight2.setBackgroundResource(R.drawable.knightblack);
        brook2.setBackgroundResource(R.drawable.rookblack);

        // for second row
        bpawn1.setBackgroundResource(R.drawable.pawnblack);
        bpawn2.setBackgroundResource(R.drawable.pawnblack);
        bpawn3.setBackgroundResource(R.drawable.pawnblack);
        bpawn4.setBackgroundResource(R.drawable.pawnblack);
        bpawn5.setBackgroundResource(R.drawable.pawnblack);
        bpawn6.setBackgroundResource(R.drawable.pawnblack);
        bpawn7.setBackgroundResource(R.drawable.pawnblack);
        bpawn8.setBackgroundResource(R.drawable.pawnblack);


        // white coins
        // for the last row
        wrook1.setBackgroundResource(R.drawable.rookwhite);
        wkngiht1.setBackgroundResource(R.drawable.knightwhite);
        wbishop1.setBackgroundResource(R.drawable.bishopwhite);
        wqueen.setBackgroundResource(R.drawable.queenwhite);
        wking.setBackgroundResource(R.drawable.kingwhite);
        wbishop2.setBackgroundResource(R.drawable.bishopwhite);
        wknight2.setBackgroundResource(R.drawable.knightwhite);
        wrook2.setBackgroundResource(R.drawable.rookwhite);


        // for the seventh row
        wpawn1.setBackgroundResource(R.drawable.pawnwhite);
        wpawn2.setBackgroundResource(R.drawable.pawnwhite);
        wpawn3.setBackgroundResource(R.drawable.pawnwhite);
        wpawn4.setBackgroundResource(R.drawable.pawnwhite);
        wpawn5.setBackgroundResource(R.drawable.pawnwhite);
        wpawn6.setBackgroundResource(R.drawable.pawnwhite);
        wpawn7.setBackgroundResource(R.drawable.pawnwhite);
        wpawn8.setBackgroundResource(R.drawable.pawnwhite);
    }

    void initialize()
    {
        // black coins
        // for the first row
        brook1 = findViewById(R.id.R00);
        bkngiht1 = findViewById(R.id.R10);
        bbishop1 = findViewById(R.id.R20);
        bqueen = findViewById(R.id.R30);
        bking = findViewById(R.id.R40);
        bbishop2 = findViewById(R.id.R50);
        bknight2 = findViewById(R.id.R60);
        brook2 = findViewById(R.id.R70);

        // for the second row
        bpawn1 = findViewById(R.id.R01);
        bpawn2 = findViewById(R.id.R11);
        bpawn3 = findViewById(R.id.R21);
        bpawn4 = findViewById(R.id.R31);
        bpawn5 = findViewById(R.id.R41);
        bpawn6 = findViewById(R.id.R51);
        bpawn7 = findViewById(R.id.R61);
        bpawn8 = findViewById(R.id.R71);

        // white coins
        // for the last row
        wrook1 = findViewById(R.id.R07);
        wkngiht1 = findViewById(R.id.R17);
        wbishop1 = findViewById(R.id.R27);
        wqueen = findViewById(R.id.R37);
        wking = findViewById(R.id.R47);
        wbishop2 = findViewById(R.id.R57);
        wknight2 = findViewById(R.id.R67);
        wrook2 = findViewById(R.id.R77);

        // for the seventh row
        wpawn1 = findViewById(R.id.R06);
        wpawn2 = findViewById(R.id.R16);
        wpawn3 = findViewById(R.id.R26);
        wpawn4 = findViewById(R.id.R36);
        wpawn5 = findViewById(R.id.R46);
        wpawn6 = findViewById(R.id.R56);
        wpawn7 = findViewById(R.id.R66);
        wpawn8 = findViewById(R.id.R76);
    }
}