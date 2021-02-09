package com.example.cprogrammingresoursces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class  ViewHolderParentProgram{
    TextView textViewParent;
    ViewHolderParentProgram(View v){
        this.textViewParent=v.findViewById(R.id.id_tv_elv_tutorial_parent);
    }

}class  ViewHolderChildProgram{
    TextView textViewChild;
    ViewHolderChildProgram(View v){
        this.textViewChild=v.findViewById(R.id.id_tv_elv_tutorial_child);
    }

}
public class Adapter_Program extends BaseExpandableListAdapter {
    Context context;
    //groupName means parents name
    List<String> groupName;
    //1 parent have multiple child
    Map<String,List<String>> childName;
    public Adapter_Program(Context context){
        this.context=context;
        String[] parents=context.getResources().getStringArray(R.array.parent);
        groupName=new ArrayList<>();
        childName=new HashMap<>();

        String[] child1=context.getResources().getStringArray(R.array.child1);
        String[] child2=context.getResources().getStringArray(R.array.child2);
        String[] child3=context.getResources().getStringArray(R.array.child3);
        String[] child4=context.getResources().getStringArray(R.array.child4);
        String[] child5=context.getResources().getStringArray(R.array.child5);
        String[] child6=context.getResources().getStringArray(R.array.child6);
        String[] child7=context.getResources().getStringArray(R.array.child7);
        String[] child8=context.getResources().getStringArray(R.array.child8);
        String[] child9=context.getResources().getStringArray(R.array.child9);
        String[] child10=context.getResources().getStringArray(R.array.child10);
        String[] child11=context.getResources().getStringArray(R.array.child11);
        String[] child12=context.getResources().getStringArray(R.array.child12);
        String[] child13=context.getResources().getStringArray(R.array.child13);
        String[] child14=context.getResources().getStringArray(R.array.child14);
        String[] child15=context.getResources().getStringArray(R.array.child15);
        String[] child16=context.getResources().getStringArray(R.array.child16);
        String[] child17=context.getResources().getStringArray(R.array.child17);
        String[] child18=context.getResources().getStringArray(R.array.child18);

        List[] allChild={Arrays.asList(child1),Arrays.asList(child2),Arrays.asList(child3),Arrays.asList(child4),
                Arrays.asList(child5),Arrays.asList(child6),Arrays.asList(child7),Arrays.asList(child8),Arrays.asList(child9),
                Arrays.asList(child10),Arrays.asList(child11),
                Arrays.asList(child12),Arrays.asList(child13),Arrays.asList(child14),Arrays.asList(child15),
                Arrays.asList(child16),Arrays.asList(child17),Arrays.asList(child18)
        };
        for (int i=0;i<parents.length;i++){
            groupName.add(parents[i]);
            childName.put(groupName.get(i),allChild[i]);
        }
    }
    @Override
    public int getGroupCount() {
        return groupName.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childName.get(groupName.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupName.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childName.get(groupName.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolderParentProgram holderParentProgram;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.layout_elv_tutorial_parents,parent,false);
            holderParentProgram=new ViewHolderParentProgram(row);
            row.setTag(holderParentProgram);
        }
        holderParentProgram= (ViewHolderParentProgram) row.getTag();
        String value= (String) getGroup(groupPosition);
        holderParentProgram.textViewParent.setText(value);
        if (isExpanded){
            holderParentProgram.textViewParent.setBackground(context.getResources().getDrawable(R.drawable.bg_elv_tutorial1));
        }else{
            holderParentProgram.textViewParent.setBackground(context.getResources().getDrawable(R.drawable.bg_elv_tutorial_parent));
        }
        return row;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolderChildProgram holderChild;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.layout_elv_tutorial_child,parent,false);
            holderChild=new ViewHolderChildProgram(row);
            row.setTag(holderChild);
        }
        holderChild= (ViewHolderChildProgram) row.getTag();
        String value= (String) getChild(groupPosition,childPosition);
        holderChild.textViewChild.setText(value);
        return row;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
