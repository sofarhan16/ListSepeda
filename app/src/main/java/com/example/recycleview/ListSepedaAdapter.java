package com.example.recycleview;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSepedaAdapter extends RecyclerView.Adapter<ListSepedaAdapter.ListViewHolder> {
    private ArrayList<Sepeda> listSepeda;

    public ListSepedaAdapter(ArrayList<Sepeda> list){
        this.listSepeda = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_sepeda, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Sepeda hero = listSepeda.get(position);

        Glide.with(holder.itemView.getContext()).load(hero.getPhoto())
            .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(hero.getName());
        holder.tvBrand.setText(hero.getBrand());
        holder.tvType.setText(hero.getType());
        holder.tvSeries.setText(hero.getSeries());
        holder.tvJenis.setText(hero.getJenis());
        holder.tvDeskripsi.setText(hero.getDeskripsi());
    }


    @Override
    public int getItemCount() {
        return listSepeda.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvBrand, tvType, tvSeries, tvJenis, tvDeskripsi;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName =  itemView.findViewById(R.id.tv_item_name);
            tvBrand =  itemView.findViewById(R.id.tv_item_brand);
            tvType = itemView.findViewById(R.id.tv_item_type);
            tvSeries = itemView.findViewById(R.id.tv_item_series);
            tvJenis = itemView.findViewById(R.id.tv_item_jenis);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_deskripsi);
        }
    }
}