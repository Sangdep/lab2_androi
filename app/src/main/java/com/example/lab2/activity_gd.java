package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_gd extends AppCompatActivity {


    Button BtnTinhTT,btnTiep,btnTK;
    EditText editSLS,editTenKH;
    CheckBox checkVip;
    TextView txtTT,txtTongKH,txtTongKHVIP,txtTongDT;




    int TongKH =0, TongVIP=0, TongDT=0;

    double thanhtien=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hoadon);




        editTenKH=findViewById(R.id.editTenKH);
        BtnTinhTT=findViewById(R.id.btnTT);
        editSLS=findViewById(R.id.editSLS);
        checkVip=findViewById(R.id.checkVIP);
        txtTT=findViewById(R.id.txtThanhTien);
        btnTiep=findViewById(R.id.btnTiep);
        btnTK=findViewById(R.id.btnTK);
        txtTongKH=findViewById(R.id.txtTongKH);
        txtTongKHVIP=findViewById(R.id.txtTongKHVIP);
        txtTongDT=findViewById(R.id.txtTongDT);



        BtnTinhTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soluong=Integer.parseInt(editSLS.getText().toString());

                thanhtien=soluong*20000;
                if (checkVip.isChecked())
                {
                    thanhtien= thanhtien*0.9;
                }

                int kq=(int) thanhtien;

                txtTT.setText(String.valueOf(kq));
            }
        });


        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TongKH++;
                if (checkVip.isChecked())
                {
                    TongVIP++;
                }
                TongDT+=thanhtien;

                editTenKH.setText("");
                editSLS.setText("");
                checkVip.setChecked(false);
                txtTT.setText("");


            }
        });

        btnTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTongKH.setText(String.valueOf(TongKH));
                txtTongKHVIP.setText(String.valueOf(TongVIP));
                txtTongDT.setText(String.valueOf(TongDT));
            }
        });

    }
}