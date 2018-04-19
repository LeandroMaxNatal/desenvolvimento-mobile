package com.example.androidbti.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void open(View view) {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getFragmentManager(), "mydialog");

    }

    public void openSimples(View view) {
        SimpleDialogFragment mySimpleDialogFragment = new SimpleDialogFragment();
        mySimpleDialogFragment.show(getFragmentManager(), "mySimpleDialogFrame");
    }

    public void openRadio(View view) {
        RadioDialogFragment radioDialogFragment = new RadioDialogFragment();
        radioDialogFragment.show(getFragmentManager(), "myRadioDialog");
    }

    public void openMulti(View view) {
        MultiDialogFragment multiDialogFragment = new MultiDialogFragment();
        multiDialogFragment.show(getFragmentManager(), "myMultiDialog");
    }
}
