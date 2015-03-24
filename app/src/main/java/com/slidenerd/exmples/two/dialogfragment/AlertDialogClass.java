package com.slidenerd.exmples.two.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog.Builder;
import android.widget.Toast;

/**
 * Created by bharat.sumanth on 3/24/2015.
 */
public class AlertDialogClass extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("alertDialog");
        builder.setMessage("This is alert dialog class");
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"cancel was clicked",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("ok",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"ok was clicked",Toast.LENGTH_SHORT).show();
            }
        });
        Dialog d = builder.create();


        return d;
    }


}
