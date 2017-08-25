package com.example.hd_h.baitapnhom;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    Button button;
    TextView textViewName, textViewBirth, textViewClass, textViewAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button = (Button) findViewById(R.id.btnFollow);
        textViewName = (TextView) findViewById(R.id.txtName);
        textViewBirth = (TextView) findViewById(R.id.txtBirthDay);
        textViewClass = (TextView) findViewById(R.id.txtClass);
        textViewAddress = (TextView) findViewById(R.id.txtAddress);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("packet");
        textViewName.setText(bundle.getString("name"));
        textViewBirth.setText(bundle.getString("birthday"));
        textViewAddress.setText(bundle.getString("address"));
        textViewClass.setText(bundle.getString("class"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogFun();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void AlertDialogFun() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirm");
        builder.setMessage("Bạn Có muốn theo dõi không ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(DetailActivity.this, "Đã theo dõi", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
