package com.example.android.travelbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.TextView;

public class Route1 extends AppCompatActivity {

    TextView textView;
    TextView stop1,stop2,stop3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route1);

        textView = findViewById(R.id.route1);
        stop1 = findViewById(R.id.stop1);
        stop2 = findViewById(R.id.stop2);
        stop3 = findViewById(R.id.stop3);


        textView.setText("BusRanger   STOPS:");
        stop1.setText(this.getString(R.string.Stop1));
        stop2.setText(this.getString(R.string.Stop2));
        stop3.setText(this.getString(R.string.Stop3));

    }
}
