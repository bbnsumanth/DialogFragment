package com.slidenerd.exmples.two.dialogfragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by bharat.sumanth on 3/24/2015.
 */
public class MyDialog extends DialogFragment {
    Button ok;
    Button cancel;
    Communicator comm;
    public void onAttach(Activity activity){
        super.onAttach(activity);
        comm = (Communicator) activity;
    }
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.my_dialog  ,container,false);
        setCancelable(false);
        ok = (Button) v.findViewById(R.id.ok);
        cancel = (Button) v.findViewById(R.id.cancel);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              dismiss();
              comm.onDialogMessage("ok was clicked");

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                comm.onDialogMessage("cancel was clicked");
            }
        });

        return v;
    }
    public interface Communicator{
        public void onDialogMessage(String s);
    }
}
