package com.example.android.travelbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Route2 extends AppCompatActivity {

    TextView textView;
    TextView stop4,stop5,stop6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route1);

        textView = findViewById(R.id.route1);
        stop4 = findViewById(R.id.stop1);
        stop5 = findViewById(R.id.stop2);
        stop6 = findViewById(R.id.stop3);

        textView.setText("ZebraForce   STOPS:");
        stop4.setText(this.getString(R.string.Stop4));
        stop5.setText(this.getString(R.string.Stop5));
        stop6.setText(this.getString(R.string.Stop6));
    }
}
