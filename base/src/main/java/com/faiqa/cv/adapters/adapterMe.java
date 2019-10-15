package com.faiqa.cv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.faiqa.cv.base.R;

public class adapterMe extends RecyclerView.Adapter<adapterMe.viewHolderMe> {
    private String [] data;
    private int[] img;
    private Context context;
    public adapterMe(String[]data,int[]img,Context context){
        this.data=data;
        this.img=img;
        this.context=context;

    }
    @NonNull
    @Override
    public viewHolderMe onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.list_item_layout,parent,false);
        return new viewHolderMe(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderMe holder, int position) {
        String title=data[position];
        holder.t1.setText(title);
        int loc=img[position];
        holder.imgIcon.setImageResource(loc);
      //  holder.imgIcon.setBackgroundResource(R.drawable.pucitlogo);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewHolderMe extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView t1;
 //       TextView t2;
//        TextView t3;

        public viewHolderMe(@NonNull View itemView) {

            super(itemView);
            imgIcon=itemView.findViewById(R.id.me1);
            t1=itemView.findViewById(R.id.me2);
           // t2=itemView.findViewById(R.id.me3);
            //t3=itemView.findViewById(R.id.me4);

        }
    }
}
