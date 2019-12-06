package com.example.bacaide.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bacaide.R;
import com.example.bacaide.ui.home.HomeFragment;

public class InfoFragment extends Fragment {

    private ImageButton backButton;

    private Button financeButton;
    private Button santeButton;
    private Button logementButton;
    private Button jobsButton;
    private Button foodButton;
    private Button eventsButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_info, container, false);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.nav_host_fragment, this, "Info");
        transaction.addToBackStack(null);
        transaction.commit();

        backButton = (ImageButton) root.findViewById(R.id.button_return);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.nav_host_fragment, new HomeFragment(), "Home");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return root;
    }

}
