package com.example.karan.alertdialogboxdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find view by id
        btn = findViewById(R.id.btnClick);
        builder = new AlertDialog.Builder(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do You Want To Exit ?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Action YES clicked
                        finish();
                        Toast.makeText(MainActivity.this, "You selected exit", Toast.LENGTH_SHORT).show();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Action NO Clicked
                        dialog.cancel();
                        Toast.makeText(MainActivity.this, "Permission Declined", Toast.LENGTH_SHORT).show();
                    }
                });
                //Creating Dialog Box
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }
}
