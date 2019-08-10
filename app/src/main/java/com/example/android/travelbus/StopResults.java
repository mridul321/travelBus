package com.example.android.travelbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StopResults extends AppCompatActivity {

    private EditText editText;
    private TextView textView,textView1,textView2,textView3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_results);

        editText = findViewById(R.id.route_number);
        button = findViewById(R.id.stopGet);
        textView = findViewById(R.id.stopResult1);
        textView1 = findViewById(R.id.stopResult2);
        textView2 = findViewById(R.id.stopResult3);
        textView3 = findViewById(R.id.stopNamesTitle);

        textView3.setVisibility(View.INVISIBLE);


       final Item0 routeIndex = new Item0();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String routeNumber = editText.getText().toString();
                textView3.setVisibility(View.VISIBLE);

                    if((routeIndex.index[0]).equals(routeNumber)) {
                        textView.setText(R.string.Stop1);
                        textView1.setText(R.string.Stop2);
                        textView2.setText(R.string.Stop3);
                    }
                    else if((routeIndex.index[1]).equals(routeNumber)){
                        textView.setText(R.string.Stop4);
                        textView1.setText(R.string.Stop5);
                        textView2.setText(R.string.Stop6);
                    }
                    else if((routeIndex.index[2]).equals(routeNumber)){
                        textView.setText(R.string.Stop7);
                        textView1.setText(R.string.Stop8);
                        textView2.setText(R.string.Stop9);
                    }








                }

        });


    }
}
