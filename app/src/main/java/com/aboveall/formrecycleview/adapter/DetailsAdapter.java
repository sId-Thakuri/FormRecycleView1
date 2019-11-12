package com.aboveall.formrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aboveall.formrecycleview.R;
import com.aboveall.formrecycleview.model.Details;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>{
    Context context;
    List<Details> detailsList;

    public DetailsAdapter(Context context,List<Details> detailsList){
        this.context=context;
        this.detailsList=detailsList;
    }


    @NonNull
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler,parent,false);
        return new DetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        final Details details = detailsList.get(position);

        holder.imgProfile.setImageResource(details.getImage());
        holder.tvName.setText(details.getName());
        holder.tvAge.setText(details.getAge());
        holder.tvGender.setText(details.getGender());

    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }


    public class DetailsViewHolder extends RecyclerView.ViewHolder{


        CircleImageView imgProfile;
        TextView tvName,tvAge,tvGender;
        public DetailsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);

            tvGender = itemView.findViewById(R.id.tvGender);


        }
}
}


