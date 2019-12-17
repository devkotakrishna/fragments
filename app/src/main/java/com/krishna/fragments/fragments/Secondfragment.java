package com.krishna.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.krishna.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Secondfragment extends Fragment implements View.OnClickListener  {


            private Button btnArea;
            private EditText etRadius;

    public Secondfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_secondfragment,container,false);
        etRadius=view.findViewById(R.id.etRadius);
        btnArea=view.findViewById(R.id.btnArea);

        btnArea.setOnClickListener(this);
        return view;


        // Inflate the layout for this fragment
        // inflater.inflate(R.layout.fragment_secondfragment, container, false);
    }

    @Override
    public void onClick(View v) {
        float radius =Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f*radius*radius;
        Toast.makeText(getActivity(), "Area of a Circle:" +area,Toast.LENGTH_SHORT).show();

    }
}
