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

public class Fragment_JobLink extends Fragment {
    public Fragment_JobLink() {
        // Required empty public constructor
    }
    RecyclerView recyclerView_bengli_job,recyclerView_enlish_job,recyclerView_hindi_job;
    AdapterBengliJobLink adapterBengliJobLink;
    AdapterEnglishJobLink adapterEnglishJobLink;
    AdapterHindiJobLink adapterHindiJobLink;
    ArrayList<ImageInformation> datalist_bengli_job,datalist_english_job,datalist_hindi_job;
    Context context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View row= inflater.inflate(R.layout.fragment_job_link, container, false);

        // Inflate the layout for this fragment
        context=container.getContext();

        recyclerView_bengli_job=row.findViewById(R.id.id_rv_BengliJob);
        recyclerView_enlish_job=row.findViewById(R.id.id_rv_EnglishJob);
        recyclerView_hindi_job=row.findViewById(R.id.id_rv_HindiJob);

        datalist_bengli_job=new ArrayList<>();
        adapterBengliJobLink=new AdapterBengliJobLink(container.getContext(),datalist_bengli_job);
        recyclerView_bengli_job.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_bengli_job.setHasFixedSize(true);
        recyclerView_bengli_job.setAdapter(adapterBengliJobLink);
        RecyclerView.ItemDecoration itemDecorationBengli =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_bengli_job.addItemDecoration(itemDecorationBengli);


        datalist_english_job=new ArrayList<>();
        adapterEnglishJobLink=new AdapterEnglishJobLink(container.getContext(),datalist_english_job);
        recyclerView_enlish_job.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_enlish_job.setHasFixedSize(true);
        recyclerView_enlish_job.setAdapter(adapterEnglishJobLink);
        RecyclerView.ItemDecoration itemDecorationEnglish =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_enlish_job.addItemDecoration(itemDecorationEnglish);

        datalist_hindi_job=new ArrayList<>();
        adapterHindiJobLink=new AdapterHindiJobLink(container.getContext(),datalist_hindi_job);
        recyclerView_hindi_job.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView_hindi_job.setHasFixedSize(true);
        recyclerView_hindi_job.setAdapter(adapterHindiJobLink);
        RecyclerView.ItemDecoration itemDecorationHindi =
                new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL);
        recyclerView_hindi_job.addItemDecoration(itemDecorationHindi);

        recyclerView_bengli_job.setNestedScrollingEnabled(false);
        recyclerView_enlish_job.setNestedScrollingEnabled(false);
        recyclerView_hindi_job.setNestedScrollingEnabled(false);
        return row;
    }

    @Override
    public void onStart() {
        super.onStart();
        datalist_bengli_job.clear();
        datalist_english_job.clear();
        datalist_hindi_job.clear();
        String[] booknameBengli=context.getResources().getStringArray(R.array.benglibookname);
        String[] bookdescBengli=context.getResources().getStringArray(R.array.benglibookdesc);
        String[] booknameEnglish=context.getResources().getStringArray(R.array.englishbookname);
        String[] bookdescEnglish=context.getResources().getStringArray(R.array.englishbookdesc);
        String[] booknameHindi=context.getResources().getStringArray(R.array.hindibookname);
        String[] bookdescHindi=context.getResources().getStringArray(R.array.hindibookdesc);
        int[] imagebook={R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow,R.drawable.up_arrow,R.drawable.down_arrow};
        for (int i=0;i<bookdescBengli.length;i++){
            datalist_bengli_job.add(new ImageInformation(booknameBengli[i],bookdescBengli[i],imagebook[i]));
            adapterBengliJobLink.notifyDataSetChanged();
        }for (int i=0;i<bookdescEnglish.length;i++){
            datalist_english_job.add(new ImageInformation(booknameEnglish[i],bookdescEnglish[i],imagebook[i]));
            adapterEnglishJobLink.notifyDataSetChanged();
        }for (int i=0;i<bookdescHindi.length;i++){
            datalist_hindi_job.add(new ImageInformation(booknameHindi[i],bookdescHindi[i],imagebook[i]));
            adapterHindiJobLink.notifyDataSetChanged();
        }
    }
}
