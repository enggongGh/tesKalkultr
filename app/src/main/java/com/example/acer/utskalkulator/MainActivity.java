package com.example.acer.utskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView hasil;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnTambah, btnKurang, btnKali, btnBagi, btnSamaDgn, btnTitik;

    public static double nilai=0;
    public static String operasi="";
    public static double hasil1=0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init() {
        hasil = (TextView) findViewById(R.id.hasil);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);


        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(this);

        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(this);

        btnKali = (Button) findViewById(R.id.btnKali);
        btnKali.setOnClickListener(this);

        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(this);

        btnSamaDgn = (Button) findViewById(R.id.btnSamaDgn);
        btnSamaDgn.setOnClickListener(this);

        btnTitik = (Button) findViewById(R.id.btnTitik);
        btnTitik.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                hasil.setText(hasil.getText().toString().trim()+"1");
            break;

            case R.id.btn2:
                hasil.setText(hasil.getText().toString().trim()+"2");
                break;

            case R.id.btn3:
                hasil.setText(hasil.getText().toString().trim()+"3");
                break;

            case R.id.btn4:
                hasil.setText(hasil.getText().toString().trim()+"4");
                break;

            case R.id.btn5:
                hasil.setText(hasil.getText().toString().trim()+"5");
                break;

            case R.id.btn6:
                hasil.setText(hasil.getText().toString().trim()+"6");
                break;

            case R.id.btn7:
                hasil.setText(hasil.getText().toString().trim()+"7");
                break;

            case R.id.btn8:
                hasil.setText(hasil.getText().toString().trim()+"8");
                break;

            case R.id.btn9:
                hasil.setText(hasil.getText().toString().trim()+"9");
                break;

            case R.id.btn0:
                hasil.setText(hasil.getText().toString().trim()+"0");
                break;
            case R.id.btnTitik:
                hasil.setText(".");
                break;


            case R.id.btnTambah:
                operasi = "Tambah";
                nilai = Double.parseDouble(hasil.getText().toString());
                hasil.setText(" ");
                break;
            case R.id.btnKurang:
                operasi = "Kurang";
                nilai = Double.parseDouble(hasil.getText().toString());
                hasil.setText(" ");
                break;
            case R.id.btnKali:
                operasi = "Kali";
                nilai = Double.parseDouble(hasil.getText().toString());
                hasil.setText(" ");
                break;
            case R.id.btnBagi:
                operasi = "Bagi";
                nilai = Double.parseDouble(hasil.getText().toString());
                hasil.setText(" ");
                break;


            case R.id.btnSamaDgn:

                    if (operasi.equals("Tambah")){
                        hasil1 = nilai+Double.parseDouble(hasil.getText().toString().trim());
                    }

                    if (operasi.equals("Kurang")){
                        hasil1 = nilai-Double.parseDouble(hasil.getText().toString().trim());
                    }
                    if (operasi.equals("Kali")){
                        hasil1 = nilai*Double.parseDouble(hasil.getText().toString().trim());
                    }
                    if (operasi.equals("Bagi")){
                        hasil1 = nilai/Double.parseDouble(hasil.getText().toString().trim());
                    }

                    int nilaitemp = (int) hasil1;

                    if (nilaitemp == hasil1) {
                        hasil.setText(String.valueOf((int)hasil1));
                    }else {
                        hasil.setText(String.valueOf(hasil1));
                    }


                break;

        }
    }
}
