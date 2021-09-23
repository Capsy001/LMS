package com.example.lms;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Assignmnets extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.assignments,container,false);

        Spinner spinner = (Spinner) v.findViewById(R.id.mycourse1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this.getActivity(), R.array.mycourses, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);

        Button b = (Button) v.findViewById(R.id.button4);
        b.setOnClickListener(this);
        return v;

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:

                Fragment fragment;

                fragment = new Assign_submit();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.view_pager,fragment);
                ft.commit();
                break;
        }
    }




}

