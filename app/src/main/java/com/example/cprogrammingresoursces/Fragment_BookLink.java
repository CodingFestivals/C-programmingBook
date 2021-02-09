package com.example.cprogrammingresoursces;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment_BookLink extends Fragment {
    public Fragment_BookLink() {
        // Required empty public constructor
    }
    RecyclerView recyclerView_bengli,recyclerView_enlish,recyclerView_hindi;
    AdapterBengliBookLink1 adapterBengliBookLink;
    AdapterEnglishBookLink1 adapterEnglishBookLink;
    AdapterHindiBookLink1 adapterHindiBookLink;
    ArrayList<ImageInformation> datalist_bengli,datalist_english,datalist_hindi;
    Context context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context=container.getContext();

        View row= inflater.inflate(R.layout.fragment_booklink, container, false);

        recyclerView_bengli=row.findViewById(R.id.id_rv_BengliBook);
        recyclerView_enlish=row.findViewById(R.id.id_rv_EnglishBook);
        recyclerView_hindi=row.findViewById(R.id.id_rv_HindiBook);

        datalist_bengli=new ArrayList<>();
        adapterBengliBookLink=new AdapterBengliBookLink1(container.getContext(),datalist_bengli);
        recyclerView_bengli.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_bengli.setHasFixedSize(true);
        recyclerView_bengli.setAdapter(adapterBengliBookLink);
        RecyclerView.ItemDecoration itemDecorationBengli =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_bengli.addItemDecoration(itemDecorationBengli);


        datalist_english=new ArrayList<>();
        adapterEnglishBookLink=new AdapterEnglishBookLink1(container.getContext(),datalist_english);
        recyclerView_enlish.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_enlish.setHasFixedSize(true);
        recyclerView_enlish.setAdapter(adapterEnglishBookLink);
        RecyclerView.ItemDecoration itemDecorationEnglish =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_enlish.addItemDecoration(itemDecorationEnglish);

        datalist_hindi=new ArrayList<>();
        adapterHindiBookLink=new AdapterHindiBookLink1(container.getContext(),datalist_hindi);
        recyclerView_hindi.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_hindi.setHasFixedSize(true);
        recyclerView_hindi.setAdapter(adapterHindiBookLink);
        RecyclerView.ItemDecoration itemDecorationHindi =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_hindi.addItemDecoration(itemDecorationHindi);

        recyclerView_bengli.setNestedScrollingEnabled(false);
        recyclerView_enlish.setNestedScrollingEnabled(false);
        recyclerView_hindi.setNestedScrollingEnabled(false);
        return row;
    }

    @Override
    public void onStart() {
        super.onStart();
        datalist_bengli.clear();
        datalist_english.clear();
        datalist_hindi.clear();
        String[] booknameBengli=context.getResources().getStringArray(R.array.benglibookname);
        String[] bookdescBengli=context.getResources().getStringArray(R.array.benglibookdesc);
        String[] booknameEnglish=context.getResources().getStringArray(R.array.englishbookname);
        String[] bookdescEnglish=context.getResources().getStringArray(R.array.englishbookdesc);
        String[] booknameHindi=context.getResources().getStringArray(R.array.hindibookname);
        String[] bookdescHindi=context.getResources().getStringArray(R.array.hindibookdesc);
        int[] imagebook={R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow};
        for (int i=0;i<bookdescBengli.length;i++){
            datalist_bengli.add(new ImageInformation(booknameBengli[i],bookdescBengli[i],imagebook[i]));
            adapterBengliBookLink.notifyDataSetChanged();
        }for (int i=0;i<bookdescEnglish.length;i++){
            datalist_english.add(new ImageInformation(booknameEnglish[i],bookdescEnglish[i],imagebook[i]));
            adapterEnglishBookLink.notifyDataSetChanged();
        }for (int i=0;i<bookdescHindi.length;i++){
            datalist_hindi.add(new ImageInformation(booknameHindi[i],bookdescHindi[i],imagebook[i]));
            adapterHindiBookLink.notifyDataSetChanged();
        }
    }
}
