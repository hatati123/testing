package com.adria.testchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;

public class DeviseAdapter extends BaseAdapter {
    @BindView(R.id.base)
    TextView base;
    @BindView(R.id.graphe)
    Button btn;

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Devise> deviseList;
    private DeviseItemClickListener deviseItemClickListener;

    public DeviseAdapter(Context context, List<Devise> deviseList,DeviseItemClickListener deviseItemClickListener) {
        this.context = context;
        this.deviseList = deviseList;
        this.deviseItemClickListener = deviseItemClickListener;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() { return deviseList.size(); }

    @Override
    public Object getItem(int i) { return  deviseList.get(i) ; }

    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View deviseItemView = layoutInflater.inflate(R.layout.devise_item,null);
        TextView name = (TextView) deviseItemView.findViewById(R.id.Name);
        TextView rate = (TextView) deviseItemView.findViewById(R.id.Rate);


        final Devise d = deviseList.get(i);
        name.setText(d.getName());
        rate.setText(Double.toString(d.getRate()));

        deviseItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { deviseItemClickListener.onDeviseItemClick(d);}
        });


        return deviseItemView;
    }
}
