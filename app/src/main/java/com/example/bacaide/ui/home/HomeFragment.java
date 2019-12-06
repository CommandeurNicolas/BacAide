package com.example.bacaide.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bacaide.R;
import com.example.bacaide.info.InfoFragment;
import com.example.bacaide.ui.faq.FaqFragment;
import com.example.bacaide.ui.forum.ForumFragment;

public class HomeFragment extends Fragment {

    private Button buttonInfo;
    private Button buttonFaq;
    private Button buttonForum;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.nav_host_fragment, this, "Home");
        transaction.addToBackStack(null);
        transaction.commit();

        buttonInfo = (Button) root.findViewById(R.id.button_info);
        buttonFaq = (Button) root.findViewById(R.id.button_faq);
        buttonForum = (Button) root.findViewById(R.id.button_forum);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.nav_host_fragment, new InfoFragment(), "Info");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        buttonFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.nav_host_fragment, new FaqFragment(), "Faq");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        buttonForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.nav_host_fragment, new ForumFragment(), "Forum");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return root;
    }
}