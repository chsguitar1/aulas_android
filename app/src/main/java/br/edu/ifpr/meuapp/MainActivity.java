package br.edu.ifpr.meuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //criação do objeto botao
    Button btEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instacia do objeto botao
        btEnviar =(Button) findViewById(R.id.bt_login);

        //criação do click para abrir outra telA

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                irParaListas();
            }
        });

    }

    //criar o metodo que navega ate a tela de listas
    void irParaListas(){
        //cria somente a intenção para navegar ate outra tela, no caso a ListasActivity
        Intent it = new Intent(MainActivity.this,
                ListasActivity.class);
        startActivity(it);
        //desenpilhar esta tela
        finish();
    }
}
