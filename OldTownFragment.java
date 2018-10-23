package com.example.ricardo.drawer;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OldTownFragment extends Fragment {

    private ListView lvHomePage;
    private String[] items;
    private View view;
    String[] list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_old_town, container, false);


        View rootView = inflater.inflate(R.layout.fragment_old_town, container, false);
        super.onCreate(savedInstanceState);

        final ArrayList <Word> words = new ArrayList <Word>();
        words.add(new Word("This is Old Town Sandiego"));
        words.add(new Word("It was originally settled by the Spaniards and is a huge tourist attraction"));


        WordAdapter adapter = new WordAdapter(getActivity(), words);        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;} }