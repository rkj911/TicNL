package com.example.ticnl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Main extends AppCompatActivity {
    int i,p=1,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv;
    public void checkResult()
    {
        if ((a1 == 2 && a2 == 2 && a3 == 2) || (a4 == 2 && a5 == 2 && a6 == 2) || (a7 == 2 && a8 == 2 && a9 == 2) || (a1 == 2 && a5 == 2 && a9 == 2)
                || (a3 == 2 && a5 == 2 && a7 == 2) || (a1 == 2 && a4 == 2 && a7 == 2) || (a2 == 2 && a5 == 2 && a8 == 2) || (a3 == 2 && a6 == 2 && a9 == 2)) {
            Toast.makeText(getApplicationContext(), "Player X WON!!", Toast.LENGTH_LONG).show();
            Intent i=new Intent(getApplicationContext(),XW.class);
            startActivity(i);
        } else if ((a1 == 3 && a2 == 3 && a3 == 3) || (a4 == 3 && a5 == 3 && a6 == 3) || (a7 == 3 && a8 == 3 && a9 == 3) || (a1 == 3 && a5 == 3 && a9 == 3)
                || (a3 == 3 && a5 == 3 && a7 == 3) || (a1 == 3 && a4 == 3 && a7 == 3) || (a2 == 3 && a5 == 3 && a8 == 3) || (a3 == 3 && a6 == 3 && a9 == 3)) {
            Toast.makeText(getApplicationContext(), "Player Y WON!!", Toast.LENGTH_LONG).show();
            Intent i=new Intent(getApplicationContext(),YW.class);
            startActivity(i);
        } else if (i==9)
        {
            Toast.makeText(getApplicationContext(), "No one Won!!", Toast.LENGTH_LONG).show();
        }
    }
    public void Playero()
    {
        p = p + 1;
        tv.setText("Move X");
    }
    public void Playerx()
    {
        p = p + 1;
        tv.setText("Move O");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            b1 = (Button) findViewById(R.id.b1);
            b2 = (Button) findViewById(R.id.b2);
            b3 = (Button) findViewById(R.id.b3);
            b4 = (Button) findViewById(R.id.b4);
            b5 = (Button) findViewById(R.id.b5);
            b6 = (Button) findViewById(R.id.b6);
            b7 = (Button) findViewById(R.id.b7);
            b8 = (Button) findViewById(R.id.b8);
            b9 = (Button) findViewById(R.id.b9);
            tv = (TextView) findViewById(R.id.textView);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b1.setText("X");
                        Playerx();
                        a1 = 2;

                    } else {
                        b1.setText("O");
                        Playero();
                        a1 = 3;

                    }
                    i=i+1;
                    b1.setEnabled(false);
                    checkResult();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b2.setText("X");
                        Playerx();
                        a2 = 2;
                    } else {
                        b2.setText("O");
                        Playero();
                        a2 = 3;
                    }
                    i=i+1;
                    b2.setEnabled(false);
                    checkResult();
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b3.setText("X");
                        Playerx();
                        a3 = 2;
                    } else {
                        b3.setText("O");
                        Playero();
                        a3 = 3;
                    }
                    i=i+1;
                    b3.setEnabled(false);
                    checkResult();
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b4.setText("X");
                        Playerx();
                        a4 = 2;
                    } else {
                        b4.setText("O");
                        Playero();
                        a4 = 3;
                    }
                    i=i+1;
                    b4.setEnabled(false);
                    checkResult();
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b5.setText("X");
                        Playerx();
                        a5 = 2;
                    } else {
                        b5.setText("O");
                        Playero();
                        a5 = 3;
                    }
                    i=i+1;
                    b5.setEnabled(false);
                    checkResult();
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b6.setText("X");
                        Playerx();
                        a6 = 2;
                    } else {
                        b6.setText("O");
                        Playero();
                        a6 = 3;
                    }
                    i=i+1;
                    b6.setEnabled(false);
                    checkResult();
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b7.setText("X");
                        Playerx();
                        a7 = 2;
                    } else {
                        b7.setText("O");
                        Playero();
                        a7 = 3;
                    }
                    i=i+1;
                    b7.setEnabled(false);
                    checkResult();
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b8.setText("X");
                        Playerx();
                        a8 = 2;
                    } else {
                        b8.setText("O");
                        Playero();
                        a8 = 3;
                    }
                    i=i+1;
                    b8.setEnabled(false);
                    checkResult();
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (p == 1 || p == 3 || p == 5 || p == 7 || p == 9) {
                        b9.setText("X");
                        Playerx();
                        a9 = 2;
                    } else {
                        b9.setText("O");
                        Playero();
                        a9 = 3;
                    }
                    i=i+1;
                    b9.setEnabled(false);
                    checkResult();
                }
            });
    }
}
