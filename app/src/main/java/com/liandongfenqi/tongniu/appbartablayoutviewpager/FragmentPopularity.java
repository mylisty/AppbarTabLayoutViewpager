package com.liandongfenqi.tongniu.appbartablayoutviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentPopularity extends Fragment {
    private static FragmentPopularity instance=null;
    public static FragmentPopularity newInstance() {
        if(instance==null){
            instance= new FragmentPopularity();
        }
        return instance;
    }
    public FragmentPopularity(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_layout, container, false);
        RecyclerView mRecyclerView = view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        String [] mTag = getActivity().getResources().getStringArray(R.array.test);
        mRecyclerView.setAdapter((new MyRecyclerViewAdapter(getActivity(), mTag)));
        return view;
    }
}
