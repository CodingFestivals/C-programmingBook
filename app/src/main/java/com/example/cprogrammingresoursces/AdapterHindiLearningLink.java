package com.example.cprogrammingresoursces;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterHindiLearningLink extends RecyclerView.Adapter<AdapterHindiLearningLink.MyViewHolder>{
    Context context;
    ArrayList<ImageInformation> arrayList;

    public AdapterHindiLearningLink(Context context, ArrayList<ImageInformation> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public AdapterHindiLearningLink.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.layout_single_row_link,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHindiLearningLink.MyViewHolder myViewHolder, int i) {
        //Name Set In Text View
        ImageInformation information=arrayList.get(i);
        myViewHolder.txtview_name.setText(information.getName());
        myViewHolder.txtview_desc.setText(information.getDesc());

        //Image Set In ImageView
        //  Toast.makeText(context,information.getName(),Toast.LENGTH_LONG).show();
        Glide.with(context)
                .load(information.getImage())
                .placeholder(R.drawable.default_image)
                .fitCenter()
                .into(myViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtview_name,txtview_desc;
        CircleImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtview_name=itemView.findViewById(R.id.id_tv_linkName);
            txtview_desc=itemView.findViewById(R.id.id_tv_linkdesc);
            imageView=itemView.findViewById(R.id.id_iv_link);
        }
    }
}
