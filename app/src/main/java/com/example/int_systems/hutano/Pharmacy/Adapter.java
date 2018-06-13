package com.example.int_systems.hutano.Pharmacy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.int_systems.hutano.R;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter <Adapter.ViewHolder> {
    public Adapter(Context mCtx, List<Response> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Response> productList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_pharmacy, null);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Response product = productList.get(position);

        //binding the data with the viewholder views
        holder.name.setText(product.getPharmacy_name());
        holder.address.setText(product.getAddress());
        holder.distance.setText(product.getDistance());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, address,distance;

        TextView driverId;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.pharmacy_name);
            address = (TextView)itemView.findViewById(R.id.pharmacy_address);
            distance =(TextView) itemView.findViewById(R.id.pharmacy_distance);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }

}
