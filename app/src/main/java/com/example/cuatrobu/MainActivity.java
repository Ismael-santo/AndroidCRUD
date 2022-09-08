package com.example.cuatrobu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1, b2, b3, b4;
    private TextView resu;
    private EditText n1, n2;
    View focusView = null;
    String Cadena = "Ismael";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.numero1);
        n2=findViewById(R.id.numero2);
        resu=findViewById(R.id.lblresu);
        b1=findViewById(R.id.btnsumar);
        b2=findViewById(R.id.btnrestar);
        b3=findViewById(R.id.btnmulti);
        b4=findViewById(R.id.btndividir);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String valor1 = "";
        String valor2 = "";
        String mensaje1="";
        String res="";float a;float b;float c;

        switch (v.getId()) {
            case R.id.btnsumar:
                valor1 = n1.getText().toString();
                valor2 = n2.getText().toString();
                if ((valor1 != "") && (!valor2.isEmpty())) {
                    a = Float.parseFloat(valor1);
                    b = Float.parseFloat(valor2);
                    c = a + b;
                    res = String.valueOf(c);
                    mensaje1 = "El suma de " + a + "+" + b + "=" + c;
                }else{
                    focusView = n1;
                    focusView.requestFocus();
                    res = "0.0";
                    mensaje1 = "Debe completar el formulario";
                }
                break;
            case R.id.btnrestar:
                valor1 = n1.getText().toString();
                valor2 = n2.getText().toString();
                a = Float.parseFloat(valor1);
                b = Float.parseFloat(valor2);
                c = a -b;
                res = String.valueOf(c);
                mensaje1 = "El resta de " + a + "-" + b + "=" + c;
                break;

            case R.id.btnmulti:
                valor1 = n1.getText().toString();
                valor2 = n2.getText().toString();
                a= Float.parseFloat(valor1);
                b = Float.parseFloat(valor2);
                c = a * b;
                res = String.valueOf(c);
                mensaje1 = "La multiplicación de " + a + "x" + b + "=" + c;
                break;
            case R.id.btndividir:
                valor1 = n1.getText().toString();
                valor2 = n2.getText().toString();
                a = Float.parseFloat(valor1);
                b = Float.parseFloat(valor2);
                c = a / b;
                res= String.valueOf(c);
                mensaje1 = "La división de " + a + "/" + b + "=" + c;
                break;



        }
        resu.setText(res);
        Toast mensaje = Toast.makeText(this, mensaje1, Toast.LENGTH_LONG);
        mensaje.show();
    }
}
