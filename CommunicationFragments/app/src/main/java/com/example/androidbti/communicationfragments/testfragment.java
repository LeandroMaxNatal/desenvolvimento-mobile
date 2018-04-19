package com.example.androidbti.communicationfragments;

import android.app.Fragment;
import android.content.Context;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by android.bti on 12/04/18.
 */

public class testfragment extends Fragment implements View.OnClickListener{

    private EditText editText;
    private Button button;

    private OnInvertListener listener;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(! (context instanceof OnInvertListener)){
            throw new RuntimeException("A activity nao implementa a interface tal");
        }

        listener = (OnInvertListener)context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container);

        editText = view.findViewById(R.id.edt_text);
        button = view.findViewById(R.id.btn_invert);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (listener != null){
            String texto = editText.getText().toString();
            listener.onInvert(texto);
        }
    }

    public interface OnInvertListener{
        public void onInvert(String texto);
    }
}
