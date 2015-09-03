package com.vlntdds.tablayoutexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class page1Fragment extends Fragment {

    @Bind(R.id.page1textview) TextView page1textview;

    public static final String ARG_PAGE = "ARG_PAGE";

    public static page1Fragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        page1Fragment fragment = new page1Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page1, container, false);

        ButterKnife.bind(this, view);
        page1textview.setText("TextView binded with Butterknife - 1");

        return view;
    }
}