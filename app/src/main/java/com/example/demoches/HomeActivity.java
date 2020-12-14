package com.example.demoches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView brook1, bkngiht1, bbishop1, bqueen, bking, brook2, bknight2, bbishop2;
    TextView bpawn1, bpawn2, bpawn3, bpawn4, bpawn5, bpawn6, bpawn7, bpawn8;
    TextView wrook1, wkngiht1, wbishop1, wqueen, wking, wrook2, wknight2, wbishop2;
    TextView wpawn1, wpawn2, wpawn3, wpawn4, wpawn5, wpawn6, wpawn7, wpawn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initialize();

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