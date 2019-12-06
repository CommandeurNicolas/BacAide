package com.example.bacaide.ui.faq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bacaide.Adapter.QuestionAdapter;
import com.example.bacaide.Adapter.ResponseAdapter;
import com.example.bacaide.R;

public class FaqFragment extends Fragment {

    private QuestionAdapter finance;
    private QuestionAdapter sante;
    private QuestionAdapter logement;
    private QuestionAdapter jobs;
    private QuestionAdapter alimentation;
    private QuestionAdapter events;

    private RecyclerView financeRV;
    private RecyclerView santeRV;
    private RecyclerView logementRV;
    private RecyclerView jobsRV;
    private RecyclerView alimentationRV;
    private RecyclerView eventsRV;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_faq, container, false);
        alimentationRV = root.findViewById(R.id.alimentation);
        financeRV = root.findViewById(R.id.finance);
        santeRV = root.findViewById(R.id.sante);
        logementRV = root.findViewById(R.id.logement);
        jobsRV = root.findViewById(R.id.jobs);
        eventsRV = root.findViewById(R.id.events);

        finance = new QuestionAdapter(getContext(),"Finance");
        sante = new QuestionAdapter(getContext(),"Sante");
        logement = new QuestionAdapter(getContext(),"Logement");
        jobs = new QuestionAdapter(getContext(),"Jobs");
        alimentation = new QuestionAdapter(getContext(),"Alimentation");
        events = new QuestionAdapter(getContext(),"Events");

        alimentationRV.setAdapter(alimentation);
        alimentationRV.setLayoutManager(new LinearLayoutManager(getContext()));
        financeRV.setAdapter(finance);
        financeRV.setLayoutManager(new LinearLayoutManager(getContext()));
        santeRV.setAdapter(sante);
        santeRV.setLayoutManager(new LinearLayoutManager(getContext()));
        logementRV.setAdapter(logement);
        logementRV.setLayoutManager(new LinearLayoutManager(getContext()));
        jobsRV.setAdapter(jobs);
        jobsRV.setLayoutManager(new LinearLayoutManager(getContext()));
        eventsRV.setAdapter(events);
        eventsRV.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
}
