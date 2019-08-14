package com.example.despesaappopet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textDivisao, textPessoas;
    private SeekBar seekPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        textPessoas = findViewById(R.id.textPessoas);
        textDivisao = findViewById(R.id.textDivisao);
        seekPessoas = findViewById(R.id.seekPessoas);
    }

    /*public void dividirDespesa(View view) {
        double valor = Double.parseDouble(editValor.getText().toString());
        double pessoas = Double.parseDouble(editPessoa.getText().toString());
        double resultado = valor / pessoas;

        DecimalFormat df = new DecimalFormat("#0.00");

        String exibir = "R$ " + df.format(resultado);

        textDivisao.setText(exibir);
    }*/
}
