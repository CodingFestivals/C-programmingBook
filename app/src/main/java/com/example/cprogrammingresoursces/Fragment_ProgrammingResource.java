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

public class Fragment_ProgrammingResource extends Fragment {
    public Fragment_ProgrammingResource() {
        // Required empty public constructor
    }
    //res mean resource
    RecyclerView recyclerView_bengli_res,recyclerView_enlish_res,recyclerView_hindi_res;
    AdapterBengliLearningLink adapterBengliBookLinkRes;
    AdapterEnglishLearningLink adapterEnglishBookLinkRes;
    AdapterHindiLearningLink adapterHindiBookLinkRes;
    ArrayList<ImageInformation> datalist_bengli_res,datalist_english_res,datalist_hindi_res;
    Context context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View row= inflater.inflate(R.layout.fragment_programming_resource, container, false);

        // Inflate the layout for this fragment
        context=container.getContext();
        recyclerView_bengli_res=row.findViewById(R.id.id_rv_BengliResource);
        recyclerView_enlish_res=row.findViewById(R.id.id_rv_EnglishResource);
        recyclerView_hindi_res=row.findViewById(R.id.id_rv_HindiResource);

        datalist_bengli_res=new ArrayList<>();
        adapterBengliBookLinkRes=new AdapterBengliLearningLink(container.getContext(),datalist_bengli_res);
        recyclerView_bengli_res.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_bengli_res.setHasFixedSize(true);
        recyclerView_bengli_res.setAdapter(adapterBengliBookLinkRes);
        RecyclerView.ItemDecoration itemDecorationBengli =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_bengli_res.addItemDecoration(itemDecorationBengli);


        datalist_english_res=new ArrayList<>();
        adapterEnglishBookLinkRes=new AdapterEnglishLearningLink(container.getContext(),datalist_english_res);
        recyclerView_enlish_res.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_enlish_res.setHasFixedSize(true);
        recyclerView_enlish_res.setAdapter(adapterEnglishBookLinkRes);
        RecyclerView.ItemDecoration itemDecorationEnglish =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_enlish_res.addItemDecoration(itemDecorationEnglish);

        datalist_hindi_res=new ArrayList<>();
        adapterHindiBookLinkRes=new AdapterHindiLearningLink(container.getContext(),datalist_hindi_res);
        recyclerView_hindi_res.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_hindi_res.setHasFixedSize(true);
        recyclerView_hindi_res.setAdapter(adapterHindiBookLinkRes);
        RecyclerView.ItemDecoration itemDecorationHindi =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_hindi_res.addItemDecoration(itemDecorationHindi);

        recyclerView_bengli_res.setNestedScrollingEnabled(false);
        recyclerView_enlish_res.setNestedScrollingEnabled(false);
        recyclerView_hindi_res.setNestedScrollingEnabled(false);
        return row;
    }

    @Override
    public void onStart() {
        super.onStart();
        datalist_bengli_res.clear();
        datalist_english_res.clear();
        datalist_hindi_res.clear();
        String[] booknameBengli=context.getResources().getStringArray(R.array.benglibookname);
        String[] bookdescBengli=context.getResources().getStringArray(R.array.benglibookdesc);
        String[] booknameEnglish=context.getResources().getStringArray(R.array.englishbookname);
        String[] bookdescEnglish=context.getResources().getStringArray(R.array.englishbookdesc);
        String[] booknameHindi=context.getResources().getStringArray(R.array.hindibookname);
        String[] bookdescHindi=context.getResources().getStringArray(R.array.hindibookdesc);
        int[] imagebook={R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow};
        for (int i=0;i<bookdescBengli.length;i++){
            datalist_bengli_res.add(new ImageInformation(booknameBengli[i],bookdescBengli[i],imagebook[i]));
            adapterBengliBookLinkRes.notifyDataSetChanged();
        }for (int i=0;i<bookdescEnglish.length;i++){
            datalist_english_res.add(new ImageInformation(booknameEnglish[i],bookdescEnglish[i],imagebook[i]));
            adapterEnglishBookLinkRes.notifyDataSetChanged();
        }for (int i=0;i<bookdescHindi.length;i++){
            datalist_hindi_res.add(new ImageInformation(booknameHindi[i],bookdescHindi[i],imagebook[i]));
            adapterHindiBookLinkRes.notifyDataSetChanged();
        }
    }
}
