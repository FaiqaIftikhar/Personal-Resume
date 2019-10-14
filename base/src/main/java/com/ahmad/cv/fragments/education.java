package com.ahmad.cv.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.adapters.EducationAdapter;
import com.ahmad.cv.adapters.adapterMe;
import com.ahmad.cv.base.R;
import com.ahmad.cv.model.DemoItem;

import java.util.ArrayList;
import java.util.List;

public class education extends Fragment {
    public education() {
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ////////changes//////
    }
    public static education newInstance() {
        education fragment = new education();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        RecyclerView educationList = view.findViewById(R.id.educationList);
        educationList.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] languages={"Bachelor in Computer Science (BSCS)\n National University College of Computer and Emerging Sciences\n (2017 – 2021) ","A-levels in sciences and mathematics)\nLahore Grammar School -JT Girls\n(2015 – 2017)"};
        int [] imageViews={R.drawable.fastlogo,R.drawable.pucitlogo};

        educationList.setAdapter(new adapterMe(languages,imageViews, getContext()));
        return view;

    }


}
