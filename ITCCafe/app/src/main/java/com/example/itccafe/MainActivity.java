package com.example.itccafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_Tambahspicy, btn_Kurangspicy, btn_Tambah_mieayam, btn_Kurangmieayam, btn_Tambah_burger, btn_Kurangburger, btn_Tambah_lasagna, btn_Kuranglasagna, btn_Tambah_risol, btn_Kurangrisol, btn_Tambah_mahkota, btn_Kurangmahkota, btn_Tambah_siomay, btn_Kurangsiomay, btn_Tambah_tea, btn_Kurangtea, btn_Tambah_orange, btn_Kurangorange, btn_Buy, btn_Reset;
    TextView tv_Jmlh_spicy, tv_Jmlh_mieayam, tv_Jmlh_burger, tv_Jmlh_lasagna, tv_Jmlh_risol, tv_Jmlh_mahkota, tv_Jmlh_siomay, tv_Jmlh_tea, tv_Jmlh_orange, tv_Harga, tv_Purchase;
    int jmlspicy = 0;
    int jmlmieayam = 0;
    int jmlburger = 0;
    int jmllasagna = 0;
    int jmlrisol = 0;
    int jmlmahkota = 0;
    int jmlsiomay = 0;
    int jmltea = 0;
    int jmlorange = 0;
    int totalharga = 0;
    final int HARGA_SPICY = 32000;
    final int HARGA_MIEAYAM = 10000;
    final int HARGA_BURGER = 18000;
    final int HARGA_LASAGNA = 30000;
    final int HARGA_RISOL = 5000;
    final int HARGA_MAHKOTA = 7000;
    final int HARGA_SIOMAY = 5000;
    final int HARGA_TEA = 2000;
    final int HARGA_ORANGE = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Tambahspicy = findViewById(R.id.btn_tambahspicy);
        btn_Kurangspicy = findViewById(R.id.btn_kurangspicy);
        btn_Tambah_mieayam = findViewById(R.id.btn_tambah_mieayam);
        btn_Kurangmieayam = findViewById(R.id.btn_kurangmieayam);
        btn_Tambah_burger = findViewById(R.id.btn_tambah_burger);
        btn_Kurangburger = findViewById(R.id.btn_kurangburger);
        btn_Tambah_lasagna = findViewById(R.id.btn_tambah_lasagna);
        btn_Kuranglasagna = findViewById(R.id.btn_kuranglasagna);
        btn_Tambah_risol = findViewById(R.id.btn_tambah_risol);
        btn_Kurangrisol = findViewById(R.id.btn_kurangrisol);
        btn_Tambah_mahkota = findViewById(R.id.btn_tambah_mahkota);
        btn_Kurangmahkota = findViewById(R.id.btn_kurangmahkota);
        btn_Tambah_siomay = findViewById(R.id.btn_tambah_siomay);
        btn_Kurangsiomay = findViewById(R.id.btn_kurangsiomay);
        btn_Tambah_tea = findViewById(R.id.btn_tambah_tea);
        btn_Kurangtea = findViewById(R.id.btn_kurangtea);
        btn_Tambah_orange = findViewById(R.id.btn_tambah_orange);
        btn_Kurangorange = findViewById(R.id.btn_kurangorange);
        btn_Buy = findViewById(R.id.btn_buy);
        btn_Reset = findViewById(R.id.btn_reset);

        tv_Jmlh_spicy = findViewById(R.id.tv_jmlh_spicy);
        tv_Jmlh_mieayam = findViewById(R.id.tv_jmlh_mieayam);
        tv_Jmlh_burger = findViewById(R.id.tv_jmlh_burger);
        tv_Jmlh_lasagna = findViewById(R.id.tv_jmlh_lasagna);
        tv_Jmlh_risol = findViewById(R.id.tv_jmlh_risol);
        tv_Jmlh_mahkota = findViewById(R.id.tv_jmlh_mahkota);
        tv_Jmlh_siomay = findViewById(R.id.tv_jmlh_siomay);
        tv_Jmlh_tea = findViewById(R.id.tv_jmlh_tea);
        tv_Jmlh_orange = findViewById(R.id.tv_jmlh_orange);
        tv_Harga = findViewById(R.id.tv_harga);
        tv_Purchase = findViewById(R.id.tv_purchase);

        btn_Tambahspicy.setOnClickListener(this);
        btn_Kurangspicy.setOnClickListener(this);
        btn_Tambah_mieayam.setOnClickListener(this);
        btn_Kurangmieayam.setOnClickListener(this);
        btn_Tambah_burger.setOnClickListener(this);
        btn_Kurangburger.setOnClickListener(this);
        btn_Tambah_lasagna.setOnClickListener(this);
        btn_Kuranglasagna.setOnClickListener(this);
        btn_Tambah_risol.setOnClickListener(this);
        btn_Kurangrisol.setOnClickListener(this);
        btn_Tambah_mahkota.setOnClickListener(this);
        btn_Kurangmahkota.setOnClickListener(this);
        btn_Tambah_siomay.setOnClickListener(this);
        btn_Kurangsiomay.setOnClickListener(this);
        btn_Tambah_tea.setOnClickListener(this);
        btn_Kurangtea.setOnClickListener(this);
        btn_Tambah_orange.setOnClickListener(this);
        btn_Kurangorange.setOnClickListener(this);
        btn_Buy.setOnClickListener(this);
        btn_Reset.setOnClickListener(this);


        tv_Purchase.setText("");


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tambahspicy:
                //operasinya disini
                tambah(R.id.btn_tambahspicy);
                break;
            case R.id.btn_kurangspicy:
                kurang(R.id.btn_kurangspicy);
                break;
            case R.id.btn_tambah_mieayam:
                tambah(R.id.btn_tambah_mieayam);
                break;
            case R.id.btn_kurangmieayam:
                kurang(R.id.btn_kurangmieayam);
                break;
            case R.id.btn_tambah_burger:
                tambah(R.id.btn_tambah_burger);
                break;
            case R.id.btn_kurangburger:
                kurang(R.id.btn_kurangburger);
                break;
            case R.id.btn_tambah_lasagna:
                tambah(R.id.btn_tambah_lasagna);
                break;
            case R.id.btn_kuranglasagna:
                kurang(R.id.btn_kuranglasagna);
                break;
            case R.id.btn_tambah_risol:
                tambah(R.id.btn_tambah_risol);
                break;
            case R.id.btn_kurangrisol:
                kurang(R.id.btn_kurangrisol);
                break;
            case R.id.btn_tambah_mahkota:
                tambah(R.id.btn_tambah_mahkota);
                break;
            case R.id.btn_kurangmahkota:
                kurang(R.id.btn_kurangmahkota);
                break;
            case R.id.btn_tambah_siomay:
                tambah(R.id.btn_tambah_siomay);
                break;
            case R.id.btn_kurangsiomay:
                kurang(R.id.btn_kurangsiomay);
                break;
            case R.id.btn_tambah_tea:
                tambah(R.id.btn_tambah_tea);
                break;
            case R.id.btn_kurangtea:
                kurang(R.id.btn_kurangtea);
                break;
            case R.id.btn_tambah_orange:
                tambah(R.id.btn_tambah_orange);
                break;
            case R.id.btn_kurangorange:
                kurang(R.id.btn_kurangorange);
                break;
            case R.id.btn_buy:
                tv_Purchase.setText("Purchased");
                break;
            case R.id.btn_reset:
                reset();
                break;
        }
    }

    void reset(){
        jmlspicy = 0;
        jmlmieayam = 0;
        jmlburger = 0;
        jmllasagna = 0;
        jmlrisol = 0;
        jmlmahkota = 0;
        jmlsiomay = 0;
        jmltea = 0;
        jmlorange = 0;
        totalharga = 0;

        tv_Jmlh_spicy.setText("0");
        tv_Jmlh_mieayam.setText("0");
        tv_Jmlh_burger.setText("0");
        tv_Jmlh_lasagna.setText("0");
        tv_Jmlh_risol.setText("0");
        tv_Jmlh_mahkota.setText("0");
        tv_Jmlh_siomay.setText("0");
        tv_Jmlh_tea.setText("0");
        tv_Jmlh_orange.setText("0");
        tv_Harga.setText("Rp.0");
        tv_Purchase.setText("");
    }

    void tambah(int asal) {
        if(asal == R.id.btn_tambahspicy) {
            if (jmlspicy < 10) {
                jmlspicy++;
                totalharga = totalharga + HARGA_SPICY;

                tv_Jmlh_spicy.setText(""+ jmlspicy);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_mieayam) {
            if (jmlmieayam < 10) {
                jmlmieayam++;
                totalharga = totalharga + HARGA_MIEAYAM;

                tv_Jmlh_mieayam.setText(""+ jmlmieayam);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_burger) {
            if (jmlburger < 10) {
                jmlburger++;
                totalharga = totalharga + HARGA_BURGER;

                tv_Jmlh_burger.setText(""+ jmlburger);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_lasagna) {
            if (jmllasagna < 10) {
                jmllasagna++;
                totalharga = totalharga + HARGA_LASAGNA;

                tv_Jmlh_lasagna.setText(""+ jmllasagna);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_risol) {
            if (jmlrisol < 10) {
                jmlrisol++;
                totalharga = totalharga + HARGA_RISOL;

                tv_Jmlh_risol.setText(""+ jmlrisol);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_mahkota) {
            if (jmlmahkota < 10) {
                jmlmahkota++;
                totalharga = totalharga + HARGA_MAHKOTA;

                tv_Jmlh_mahkota.setText(""+ jmlmahkota);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_siomay) {
            if (jmlsiomay < 10) {
                jmlsiomay++;
                totalharga = totalharga + HARGA_SIOMAY;

                tv_Jmlh_siomay.setText(""+ jmlsiomay);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_tea) {
            if (jmltea < 10) {
                jmltea++;
                totalharga = totalharga + HARGA_TEA;

                tv_Jmlh_tea.setText(""+ jmltea);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_tambah_orange) {
            if (jmlorange < 10) {
                jmlorange++;
                totalharga = totalharga + HARGA_ORANGE;

                tv_Jmlh_orange.setText(""+ jmlorange);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
    }

    void kurang(int asal) {
        if(asal == R.id.btn_kurangspicy) {
            if (jmlspicy > 0) {
                jmlspicy--;
                totalharga = totalharga - HARGA_SPICY;

                tv_Jmlh_spicy.setText(""+ jmlspicy);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangmieayam) {
            if (jmlmieayam > 0) {
                jmlmieayam--;
                totalharga = totalharga - HARGA_MIEAYAM;

                tv_Jmlh_mieayam.setText(""+ jmlmieayam);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangburger) {
            if (jmlburger > 0) {
                jmlburger--;
                totalharga = totalharga - HARGA_BURGER;

                tv_Jmlh_burger.setText(""+ jmlburger);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kuranglasagna) {
            if (jmllasagna > 0) {
                jmllasagna--;
                totalharga = totalharga - HARGA_LASAGNA;

                tv_Jmlh_lasagna.setText(""+ jmllasagna);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangrisol) {
            if (jmlrisol > 0) {
                jmlrisol--;
                totalharga = totalharga - HARGA_RISOL;

                tv_Jmlh_risol.setText(""+ jmlrisol);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangmahkota) {
            if (jmlmahkota > 0) {
                jmlmahkota--;
                totalharga = totalharga - HARGA_MAHKOTA;

                tv_Jmlh_mahkota.setText(""+ jmlmahkota);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangsiomay) {
            if (jmlsiomay > 0) {
                jmlsiomay--;
                totalharga = totalharga - HARGA_SIOMAY;

                tv_Jmlh_siomay.setText(""+ jmlsiomay);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangtea){
            if (jmltea > 0) {
                jmltea--;
                totalharga = totalharga - HARGA_TEA;

                tv_Jmlh_tea.setText(""+ jmltea);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
        else if(asal == R.id.btn_kurangorange) {
            if (jmlorange > 0) {
                jmlorange--;
                totalharga = totalharga - HARGA_ORANGE;

                tv_Jmlh_orange.setText(""+ jmlorange);
                tv_Harga.setText("Rp." + totalharga);
            }
        }
    }
}