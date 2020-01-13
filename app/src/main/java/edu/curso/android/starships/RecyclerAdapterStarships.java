package edu.curso.android.starships;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import edu.curso.android.starships.api.Starship;

public class RecyclerAdapterStarships extends RecyclerView.Adapter<RecyclerAdapterStarships.StarshipViewHolder> {
    private Context context;
    private ArrayList<Starship> starships;
    private OnClickListener onClickListener;

    public RecyclerAdapterStarships(Context context, ArrayList<Starship> starships, OnClickListener onClickListener){
        this.context = context;
        this.starships = starships;
        this.onClickListener = onClickListener;

    }


    public void setStarships(ArrayList<Starship> starships){
        this.starships = starships;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public RecyclerAdapterStarships.StarshipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false);
        return new StarshipViewHolder(view, onClickListener);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterStarships.StarshipViewHolder holder, int position) {
        holder.tvNave.setText(starships.get(position).getName() );
    }

    @Override
    public int getItemCount() {
        if (starships != null){
            return starships.size();
        }
        return 0;
    }

    public class StarshipViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNave;
        OnClickListener onClickListener;

        public StarshipViewHolder(View itemView, OnClickListener onClickListener){
            super(itemView);
            tvNave = itemView.findViewById(R.id.tvNave);
            this.onClickListener = onClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onClickListener.onClick(getAdapterPosition());
        }
    }

    public interface OnClickListener {
        void onClick(int position);
    }


}
