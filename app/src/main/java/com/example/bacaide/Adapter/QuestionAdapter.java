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

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> question;
    private String theme;

    //private DataBaseHelper db;
    public QuestionAdapter(Context context,String theme){
        this.context=context;
        // this.db= new DataBaseHelper(context);
        // this.reponse=db
        this.question  = new ArrayList<String>();
        this.theme = theme;
        this.question.add("Est-ce que ça coûte chère ?");
        this.question.add("Est-ce que cela est loin  ?");

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_question,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position){
        holder.question.setText(this.question.get(position));
    }

    @Override
    public int getItemCount(){return this.question.size();}


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView question;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            question=itemView.findViewById(R.id.question);
        }
    }
}
