package com.example.cprogrammingresoursces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

class SingleRowDataBengliBook{
    int image;
    String text_name,text_desc;

    public SingleRowDataBengliBook(int image, String text_name, String desc) {
        this.image = image;
        this.text_name = text_name;
        this.text_desc = desc;
    }
}
class ViewHolderBookLink{
    TextView txt_name,txt_desc;
    CircleImageView imageView;
    ViewHolderBookLink(View row){
        txt_name=row.findViewById(R.id.id_tv_linkName);
        txt_desc=row.findViewById(R.id.id_tv_linkdesc);
        imageView=row.findViewById(R.id.id_iv_link);
    }
}
public class AdapterBengliBookLink extends BaseAdapter {
    Context context;
    List<SingleRowDataBengliBook> arraylist;
    public AdapterBengliBookLink(Context context) {
        this.context = context;
        arraylist=new ArrayList<>();
        String[] bookname=context.getResources().getStringArray(R.array.benglibookname);
        String[] bookdesc=context.getResources().getStringArray(R.array.benglibookname);
        int[] imagebook={R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow};
        for (int i=0;i<bookname.length;i++){
            arraylist.add(new SingleRowDataBengliBook(imagebook[i],bookname[i],bookdesc[i]));
        }
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return arraylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolderBookLink holder;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.layout_single_row_link,parent,false);
            holder=new ViewHolderBookLink(row);
            row.setTag(holder);
        }
        holder= (ViewHolderBookLink) row.getTag();
        SingleRowDataBengliBook temp=arraylist.get(position);
        holder.txt_name.setText(temp.text_name);
        holder.txt_desc.setText(temp.text_desc);
        Glide.with(context)
                .load(temp.image)
                .placeholder(R.drawable.default_image)
                .fitCenter()
                .into(holder.imageView);
        return row;
    }
}
