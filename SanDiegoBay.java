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
public class SanDiegoBay extends Fragment {
    private View view;
    String[] list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_sandiegobay, container, false);
        View rootView = inflater.inflate(R.layout.fragment_sandiegobay, container, false);
        super.onCreate(savedInstanceState);
        final ArrayList <Word> words = new ArrayList <Word>();
        words.add(new Word("This is San Diego Bay"));
        words.add(new Word("Renting out a boat costs about 600$"));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;} }