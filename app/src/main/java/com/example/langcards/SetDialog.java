package com.example.langcards;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SetDialog extends AppCompatDialogFragment{

    private EditText setLabel;
    private EditText setDesc;
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder build = new AlertDialog.Builder(getActivity());

        LayoutInflater inflate = getActivity().getLayoutInflater();
        View view = inflate.inflate(R.layout.set_dialog, null);

        build.setView(view)
                .setTitle("Label Set")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Do Nothing
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        //When OK is hit
                        String label = setLabel.getText().toString();
                        String desc = setDesc.getText().toString();
                        if(!desc.equals("") || !label.equals("")){
                            //create set update ui
                            ((SetsView)getActivity()).setsScreen();
                        }
                        dialog.dismiss();
                    }

                });
        setLabel = view.findViewById(R.id.edit_set_label);
        setDesc = view.findViewById(R.id.edit_set_desc);
        return build.create();
    }
}
