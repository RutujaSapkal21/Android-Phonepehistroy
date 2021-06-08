package com.example.phonepehistory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] arrow={R.drawable.ic_outline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_outline_call_received_24,
            R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_outline_call_received_24,
            R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_outline_call_received_24,
            R.drawable.ic_baseline_call_made_24};
    String[] action={"Received from","Paid to","Received from","Paid to","Paid to","Received from","Paid to","Paid to","Received from","Paid to"};
    String[] rupees={"₹1000","₹4000","₹1350","₹4010","₹1000","₹4000","₹1350","₹4010","₹1000","₹4000"};
    String[] time={"4 days ago","10 days ago","20 days ago","15/05/2021","1/05/2021","29/04/2021","13/04/2021","11/04/2021","19/03/2021","15/02/2021"};
    String[] tofrom={"Credited to","Debited from","Credited to","Debited from","Debited from","Credited to","Debited from","Debited from","Credited to","Debited from"};
    String[] name={"Saurabh","Sahil","Aai","Store","Medical","Sahil","Saurabh","Bro","Sahil","Aai"};
    int[]   logo={R.drawable.bankomaha,R.drawable.bankomaha,R.drawable.bankomaha,
            R.drawable.bankomaha,R.drawable.bankomaha,R.drawable.bankomaha,
            R.drawable.bankomaha,R.drawable.bankomaha,R.drawable.bankomaha,R.drawable.bankomaha};
    histroy his;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        his=new histroy(this,arrow,action,rupees,time,tofrom,logo,name);
        listView.setAdapter(his);
    }
}