package com.abhijeetmalamkar.universal_android.Alert;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


//String.valueOf(new DecimalFormat("##.##").format(""));
public class Alert {

    public static void show(Context context, String title, String message, String positive, String negetive, DialogInterface.OnClickListener okayListener, DialogInterface.OnClickListener cancelListener){
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        build.setTitle(title);
        build.setMessage(message);
        build.setPositiveButton(positive,  okayListener);
        build.setNegativeButton(negetive, cancelListener);
        build.show();
    }

    public static AlertDialog.Builder getBuilder(Context context, String title, String message,String positive,String negetive, DialogInterface.OnClickListener okayListener,DialogInterface.OnClickListener cancelListener){
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        build.setTitle(title);
        build.setMessage(message);
        build.setPositiveButton(positive,  okayListener);
        build.setNegativeButton(negetive, cancelListener);
        return build;
    }
}
