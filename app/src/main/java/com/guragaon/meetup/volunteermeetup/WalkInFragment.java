package com.guragaon.meetup.volunteermeetup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WalkInFragment extends Fragment
{

    RecyclerView eventsList;
    LinearLayoutManager linearLayoutManager;

    public WalkInFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_walk_in, container, false);
        eventsList=(RecyclerView) view.findViewById(R.id.eventList);
        linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        eventsList.setLayoutManager(linearLayoutManager);



        return view;
    }

}
