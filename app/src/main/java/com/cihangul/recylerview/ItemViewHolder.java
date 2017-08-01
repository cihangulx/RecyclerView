package com.cihangul.recylerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cihan on 25.06.2017.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    ImageView itemImage;
    TextView itemText;

    public ItemViewHolder(View itemView) {
        super(itemView);

        itemImage = itemView.findViewById(R.id.item_iv);
        itemText = itemView.findViewById(R.id.item_tv);
    }
}
