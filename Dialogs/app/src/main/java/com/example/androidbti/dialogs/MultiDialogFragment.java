package com.example.androidbti.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MultiDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean[] checked = {true,false,true,false, false};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Escolha uma linguagem");
        builder.setMultiChoiceItems(R.array.Linguagens,checked, this);

        return  builder.create();
    }


    @Override
    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.Linguagens);
        String linguagem = linguagens[which];

        if(isChecked)
            Toast.makeText(getActivity(), "Voce escolheu a linguagem: "+linguagem, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getActivity(), "Voce não escolheu a linguagem: "+linguagem, Toast.LENGTH_LONG).show();
    }
}
