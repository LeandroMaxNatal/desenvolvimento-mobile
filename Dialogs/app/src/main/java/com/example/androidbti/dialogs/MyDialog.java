package com.example.androidbti.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by android.bti on 19/04/18.
 */

public class MyDialog extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pergunta");
        builder.setMessage("Você entendeu?");
        builder.setPositiveButton("Sim",this);
        builder.setNegativeButton("Não",this);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
        String msg = null;

        if(which == DialogInterface.BUTTON_POSITIVE)
            msg = "Você escolheu Sim";
        else if (which == DialogInterface.BUTTON_NEGATIVE)
            msg = "voce escolheu Não";

        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }
}
