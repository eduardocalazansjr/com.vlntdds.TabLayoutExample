package com.vlntdds.tablayoutexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class page2Fragment extends Fragment {

    @Bind(R.id.page2textview) TextView page2textview;

    public static final String ARG_PAGE = "ARG_PAGE";

    public static page2Fragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        page2Fragment fragment = new page2Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2, container, false);
        ButterKnife.bind(this, view);
        page2textview.setText("TextView binded with Butterknife - 2");
        return view;
    }
}