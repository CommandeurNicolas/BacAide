package com.example.bacaide.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bacaide.R;
import com.example.bacaide.info.InfoActivity;

public class HomeFragment extends Fragment {

    private Button buttonInfo;
    private Button buttonFaq;
    private Button buttonForum;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        buttonInfo = (Button) root.findViewById(R.id.button_info);
        buttonFaq = (Button) root.findViewById(R.id.button_faq);
        buttonForum = (Button) root.findViewById(R.id.button_forum);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(root.getContext(), InfoActivity.class);
                startActivity(i);
            }
        });
        buttonFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(root.getContext(), InfoActivity.class);
                startActivity(i);
            }
        });
        buttonForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(root.getContext(), InfoActivity.class);
                startActivity(i);
            }
        });

        return root;
    }
}