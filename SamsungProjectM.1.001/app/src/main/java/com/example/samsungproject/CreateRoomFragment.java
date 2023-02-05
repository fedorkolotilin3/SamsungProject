package com.example.samsungproject;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class CreateRoomFragment extends Fragment implements View.OnClickListener{

    public static int layout = R.layout.creating_room_dialog;
    Button buttonCreate;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(layout, container, false);
        view.setBackgroundColor(Color.BLACK);

        buttonCreate = view.findViewById(R.id.buttonCreate);
        buttonCreate.setOnClickListener(new RoomFragment());

        return view;

    }

    @Override
    public void onClick(View view) {
        MainActivity.replaceFragment(this);
    }
}
