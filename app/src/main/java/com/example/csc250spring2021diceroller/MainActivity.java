package com.example.csc250spring2021diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private TextView qtyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.zeroButton = this.findViewById(R.id.ZeroB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.oneButton = this.findViewById(R.id.OneB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.twoButton = this.findViewById(R.id.TwoB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.threeButton = this.findViewById(R.id.ThreeB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fourButton = this.findViewById(R.id.FourB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fiveButton = this.findViewById(R.id.FiveB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sixButton = this.findViewById(R.id.SixB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sevenButton = this.findViewById(R.id.SevenB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eightButton = this.findViewById(R.id.EightB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nineButton = this.findViewById(R.id.NineB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    public void qtyButtonPressed(View v)
    {
        if(v == this.zeroButton)
        {
            this.qtyTV.setText("0");
        }
    }

    {
        if(v == this.oneButton)
        {
            this.qtyTV.setText("1");
        }
    }

    {
        if(v == this.twoButton)
        {
            this.qtyTV.setText("2");
        }
    }

    {
        if(v == this.threeButton)
        {
            this.qtyTV.setText("3");
        }
    }

    {
        if(v == this.fourButton)
        {
            this.qtyTV.setText("4");
        }
    }

    {
        if(v == this.fiveButton)
        {
            this.qtyTV.setText("5");
        }
    }

    {
        if(v == this.sixButton)
        {
            this.qtyTV.setText("6");
        }
    }

    {
        if(v == this.sevenButton)
        {
            this.qtyTV.setText("7");
        }
    }

    {
        if(v == this.eightButton)
        {
            this.qtyTV.setText("8");
        }
    }

    {
        if(v == this.nineButton)
        {
            this.qtyTV.setText("9");
        }
    }

}