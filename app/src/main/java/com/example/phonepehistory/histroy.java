package com.example.phonepehistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class histroy extends BaseAdapter {
    Context mcontext;
    int[] arrow;
    String [] action;
    String[] rupees;
    String[] time;
    String[] tofrom;
    int[] logo;
    String[] name;
    public histroy(Context mcontext, int[] arrow, String[] action, String[] rupees, String[] time, String[] tofrom, int[] logo,String[] name) {
        this.mcontext = mcontext;
        this.arrow = arrow;
        this.action = action;
        this.rupees = rupees;
        this.time = time;
        this.tofrom = tofrom;
        this.logo = logo;
        this.name=name;
    }

    @Override
    public int getCount() {
        return action.length;
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
        View myview = null;
        if (myview==null){
            LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
            myview=layoutInflater.inflate(R.layout.listdesign,null);
        }
        else {
            myview = convertView;
        }
        ImageView imageView=myview.findViewById(R.id.imageView);
        TextView txt1=myview.findViewById(R.id.action);
        CircleImageView circleImageView=myview.findViewById(R.id.circleImageView);
        TextView txt2=myview.findViewById(R.id.name);
        TextView txt3=myview.findViewById(R.id.rupees);
        TextView txt4=myview.findViewById(R.id.timee);
        TextView txt5=myview.findViewById(R.id.tofrom);

        imageView.setImageResource(arrow[position]);
        txt1.setText(action[position]);
        txt2.setText(name[position]);
        txt3.setText(rupees[position]);
        txt4.setText(time[position]);
        txt5.setText(tofrom[position]);
        circleImageView.setImageResource(logo[position]);
        return myview;
    }
}
