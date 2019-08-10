package com.example.android.travelbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Route3 extends AppCompatActivity {

    TextView textView;
    TextView stop7,stop8,stop9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route1);

        textView = findViewById(R.id.route1);
        stop7 = findViewById(R.id.stop1);
        stop8 = findViewById(R.id.stop2);
        stop9 = findViewById(R.id.stop3);

        textView.setText("WildOrchid   STOPS:");
        stop7.setText(this.getString(R.string.Stop7));
        stop8.setText(this.getString(R.string.Stop8));
        stop9.setText(this.getString(R.string.Stop9));
    }
}
