package com.example.ticnl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Main extends AppCompatActivity {
    int p=1,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        tv=(TextView)findViewById(R.id.textView);
        int a=1,b=1,c=1,d=1,e=1,f=1,g=1,h=1,i=1;
        if(a==1 || b==1 || c==1 || d==1 || e==1 || f==1 || g==1|| h==1 || i==1) // For Result
        {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a1 = 2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a1=3;
                    }
                    b1.setEnabled(false);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a2=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a2=3;
                    }
                    b2.setEnabled(false);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a3=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a3=3;
                    }
                    b3.setEnabled(false);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a4=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a4=3;
                    }
                    b4.setEnabled(false);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a5=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        a5=3;
                    }
                    b5.setEnabled(false);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a6=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a6=3;
                    }
                    b6.setEnabled(false);
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a7=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a7=3;
                    }
                    b7.setEnabled(false);
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a8=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a8=3;
                    }
                    b8.setEnabled(false);
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(p==1 || p==3 || p==5 || p==7|| p==9)
                    {
                        b1.setText("X");
                        p=p+1;
                        tv.setText("Move O");
                        a9=2;
                    }
                    else
                    {
                        b1.setText("O");
                        p=p+1;
                        tv.setText("Move X");
                        a9=3;
                    }
                    b9.setEnabled(false);
                }
            });
        }
        else
        {
            if ((a1==2 && a2 ==2 && a3==2) || (a4==2 && a5==2 && a6==2) ||(a7==2 && a8==2 && a9==2) || (a1 ==2 && a5 ==2 && a9==2)
                    || (a3==2 && a5==2 && a7==2) ||(a1==2 && a4==2 && a7==2)||(a2==2 && a5==2 && a8==2)||(a3==2&&a6==2&&a9==2))
            {
                Toast.makeText(getApplicationContext(),"Player X WON!!",Toast.LENGTH_LONG).show();
            }
            else if ((a1==3 && a2 == 3&& a3==3) || (a4==3 && a5==3 && a6==3) ||(a7==3 && a8==3 && a9==3) || (a1 ==3 && a5 ==3 && a9==3)
                    || (a3==3 && a5==3 && a7==3) ||(a1==3 && a4==3 && a7==3)||(a2==3 && a5==3 && a8==3)||(a3==3&&a6==3&&a9==3))
            {
                Toast.makeText(getApplicationContext(),"Player Y WON!!",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Draw!!",Toast.LENGTH_LONG).show();
            }

        }


    }
}
