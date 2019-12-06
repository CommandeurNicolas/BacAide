package com.example.bacaide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bacaide.R;

import java.util.ArrayList;

public class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> reponse;
    private String question;

    //private DataBaseHelper db;
    public ResponseAdapter(Context context,String question){
        this.context=context;
        // this.db= new DataBaseHelper(context);     
        // this.reponse=db
        this.reponse  = new ArrayList<String>();
        this.question = question;
        this.reponse.add("1");
        this.reponse.add("2");
        this.reponse.add("3");
        this.reponse.add("4");
        this.reponse.add("5");

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_answer_question,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position){
        holder.answer.setText(this.reponse.get(position));
    }

    @Override
    public int getItemCount(){return this.reponse.size();}


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView answer;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            answer=itemView.findViewById(R.id.answer);
        }
    }
}
