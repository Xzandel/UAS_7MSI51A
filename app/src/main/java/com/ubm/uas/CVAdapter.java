package com.ubm.uas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CVAdapter extends RecyclerView.Adapter<CVAdapter.CVViewHolder> {
    private ArrayList<CVItems> mCVList;
    public static class CVViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView;

        public CVViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_items);
            mTextView= itemView.findViewById(R.id.tv_items);
        }
    }


    public CVAdapter(ArrayList<CVItems> cvList){
        mCVList = cvList;
    }

    @NonNull
    @Override
    public CVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_items, parent, false);
        CVViewHolder cvvh = new CVViewHolder(v);
        return cvvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CVViewHolder holder, int position) {
        CVItems currentItem = mCVList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView.setText(currentItem.getText());
    }

    @Override
    public int getItemCount() {
        return mCVList.size();
    }
}

