package com.example.android.travelbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Item0 extends AppCompatActivity {

    TextView textView;
    ListView listView;

    String[] index = {"#011","#012","#013"};
    String[] routes = {"Route1", "Route2", "Route3"};
    String[] Buses = {"BusRanger", "ZebraForce", "WildOrchid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.listView1);

        textView.setText(this.getString(R.string.City1));

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(Item0.this, Route1.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Item0.this, Route2.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(Item0.this, Route3.class);
                    startActivity(intent);
                }


            }
        });
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return routes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);
            TextView routeName = convertView.findViewById(R.id.route);
            TextView busName =  convertView.findViewById(R.id.busName);
            TextView routeIndex = convertView.findViewById(R.id.index);

            routeName.setText(routes[position]);
            busName.setText(Buses[position]);
            routeIndex.setText(index[position]);

            return convertView;
        }
    }
}
