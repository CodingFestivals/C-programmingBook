package com.example.cprogrammingresoursces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class SingleRowDataUniversityQuestionMark8{
    int image;
    String text;
    SingleRowDataUniversityQuestionMark8(int image,String textt){
        this.image=image;
        this.text=textt;
    }
}
class ViewHolderUniversityQuestionMark8{
    ImageView imageView;
    TextView textView;
    ViewHolderUniversityQuestionMark8(View row){
        imageView=row.findViewById(R.id.id_iv_uq);
        textView=row.findViewById(R.id.id_tv_uq);
    }
}
public class Adapter_UniversityQuestionMark8 extends BaseAdapter {
    Context context;
    ArrayList<SingleRowDataUniversityQuestionMark8> datalist;
    Adapter_UniversityQuestionMark8(Context context){
        this.context=context;
        datalist=new ArrayList<>();
        String[] question=context.getResources().getStringArray(R.array.universityquestionmark2);
        int img[]={R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow};
        for (int i=0;i<question.length;i++){
            datalist.add(new SingleRowDataUniversityQuestionMark8(img[i],question[i]));
        }
    }
    @Override
    public int getCount() {
        return datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolderUniversityQuestionMark8 holderUniversityQuestionMark8;
        if(row==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.layout_single_row_uninversity_question,parent,false);
            holderUniversityQuestionMark8=new ViewHolderUniversityQuestionMark8(row);
            row.setTag(holderUniversityQuestionMark8);
        }
        holderUniversityQuestionMark8= (ViewHolderUniversityQuestionMark8) row.getTag();
        SingleRowDataUniversityQuestionMark8 temp=datalist.get(position);
        holderUniversityQuestionMark8.imageView.setImageResource(temp.image);
        holderUniversityQuestionMark8.textView.setText(temp.text);
        return row;
    }
}
