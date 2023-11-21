package com.example.menufitmobile.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menufitmobile.R;
import com.example.menufitmobile.modal.CardItem;

import java.util.List;

// CardAdapter.java
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardItem> cardList;
    private Context context;

    public CardAdapter(List<CardItem> cardList, Context context) {
        this.cardList = cardList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardItem cardItem = cardList.get(position);
        // Set data to views
        holder.tvName.setText(cardItem.getName());
        holder.tvDescription.setText(cardItem.getDescription());
        holder.tvCalories.setText("Calories: " + cardItem.getCalories());
        // Load image from URL (you might want to use a library like Picasso or Glide)
        // holder.imageView.setImageBitmap(loadImageFromURL(cardItem.getImageURL()));
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tvDescription, tvCalories;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvCalories = itemView.findViewById(R.id.tvCalories);
        }
    }
}

