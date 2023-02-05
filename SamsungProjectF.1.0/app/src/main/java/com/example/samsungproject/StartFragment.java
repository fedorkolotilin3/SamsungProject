package com.example.samsungproject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class StartFragment extends Fragment {

    public static int id = R.layout.start_fragment;

    Button button1, button2;

    @Override
    public void onAttach(@NonNull Context context) {

        super.onAttach(context);

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.start_fragment, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        button1 = getView().findViewById(R.id.createRoom);
        button1.setOnClickListener(new CreateRoomFragment());
        button2 = getView().findViewById(R.id.joinRoom);

        button2.setOnClickListener(new JoinRoomFragment());

    }
}
