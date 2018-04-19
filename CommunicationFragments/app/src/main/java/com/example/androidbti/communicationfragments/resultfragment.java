package com.example.androidbti.communicationfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by android.bti on 12/04/18.
 */

public class resultfragment extends Fragment{

    private TextView textview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container);

        textview  = view.findViewById(F.id);
        return  view;

    }

    public void inverta(String text){
        String invertida = new StringBuilder(text).reverse().toString();

        textview.setText(invertida);
    }
}
