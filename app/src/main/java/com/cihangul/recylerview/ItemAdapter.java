package com.cihangul.recylerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Cihan on 25.06.2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    List<Item> itemList;
    Activity activity;

    public ItemAdapter(List<Item> itemList, Activity activity) {
        this.itemList = itemList;
        this.activity = activity;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,null);

        ItemViewHolder viewHolder = new ItemViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        holder.itemText.setText(itemList.get(position).getText());
        Picasso.with(activity).load(itemList.get(position).getImage()).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
