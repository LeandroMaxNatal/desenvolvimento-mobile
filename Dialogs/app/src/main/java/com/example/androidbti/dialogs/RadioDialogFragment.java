package com.example.androidbti.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class RadioDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Escolha uma linguagem");
        builder.setSingleChoiceItems(R.array.Linguagens, 0, this);

        return  builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.Linguagens);
        String linguagem = linguagens[which];

        Toast.makeText(getActivity(), "Voce escolheu a linguagem: "+linguagem, Toast.LENGTH_LONG).show();
    }
}
