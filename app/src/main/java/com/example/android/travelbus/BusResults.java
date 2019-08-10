package com.example.android.travelbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BusResults extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textView,textView1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_results);

        editText1 = findViewById(R.id.from_location);
        editText2 = findViewById(R.id.to_location);
        textView = findViewById(R.id.busResultTitle);
        textView1 = findViewById(R.id.busResult1);
        button = findViewById(R.id.search);

        textView.setVisibility(View.INVISIBLE);


        final Item0 busName = new Item0();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromLocation = editText1.getText().toString();
                String toLocation = editText2.getText().toString();
                textView.setVisibility(View.VISIBLE);


               if((fromLocation.toUpperCase().equals("LUCKNOW")) && (toLocation.toUpperCase().equals("GURGAON"))) {
                   textView1.setText(busName.Buses[0]);
               }else if((fromLocation.toUpperCase().equals("DELHI")) && (toLocation.toUpperCase().equals("NOIDA"))){
                   textView1.setText(busName.Buses[0]);
               }else if((fromLocation.toUpperCase().equals("LUCKNOW")) && (toLocation.toUpperCase().equals("KANPUR"))){
                   textView1.setText(busName.Buses[0]);
               }else if((fromLocation.toUpperCase().equals("MUMBAI")) && (toLocation.toUpperCase().equals("PUNE"))){
                   textView1.setText(busName.Buses[1]);
               }else if((fromLocation.toUpperCase().equals("MUMBAI")) && (toLocation.toUpperCase().equals("ANDHERI"))){
                   textView1.setText(busName.Buses[1]);
               }else if((fromLocation.toUpperCase().equals("PUNE")) && (toLocation.toUpperCase().equals("ANDHERI"))){
                   textView1.setText(busName.Buses[1]);
               }else if((fromLocation.toUpperCase().equals("RAJHASTHAN")) && (toLocation.toUpperCase().equals("GUJRAT"))){
                   textView1.setText(busName.Buses[2]);
               }else if((fromLocation.toUpperCase().equals("RAJHASTHAN")) && (toLocation.toUpperCase().equals("AJMER"))){
                   textView1.setText(busName.Buses[2]);
               }else if((fromLocation.toUpperCase().equals("AJMER")) && (toLocation.toUpperCase().equals("RAJHASTHAN"))){
                   textView1.setText(busName.Buses[2]);
               }

               else {
                       Toast.makeText(BusResults.this, "No buses Available", Toast.LENGTH_SHORT).show();
                       textView1.setText("");
                       textView.setVisibility(View.INVISIBLE);
               }




            }
        });
    }
}
