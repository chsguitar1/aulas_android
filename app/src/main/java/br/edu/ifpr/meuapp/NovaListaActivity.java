package br.edu.ifpr.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


import br.edu.ifpr.meuapp.model.Lista;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NovaListaActivity extends AppCompatActivity {
    Button btSalvaLista;
    @BindView(R.id.ed_nome_lista)
    TextInputEditText edNomeLista;
    @BindView(R.id.ed_data_lista)
    TextInputEditText edDataLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_lista);
        ButterKnife.bind(this);
        btSalvaLista = (Button) findViewById(R.id.bt_salva_lista);
        btSalvaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaAddListas();
            }
        });
    }

    private void irParaAddListas() {//melhorar o metodo
        if (!edNomeLista.getText().toString().equals("")
                && !edDataLista.getText().toString().equals("")) {
            //cria a lista com o nome e a data
            Lista lista = new Lista();
            lista.setNome(edNomeLista.getText().toString());
            lista.setData(edDataLista.getText().toString());
            lista.setItens(new ArrayList());//inicia uma lista de itens vazia
             //vou para outra tela
            Intent it = new Intent(NovaListaActivity.this,
                    AddItensListaActivity.class);
            //carrega alista para outra tela com o nome de li
            it.putExtra("li", lista);
            startActivity(it);//chama a tela additensListaActivity
        }else{
            String msg = "";
            if(edDataLista.getText().toString().equals("")){
                msg = "Data vazia \n";

            }
            if(edNomeLista.getText().toString().equals("")){
                msg = "Nome vazio \n";
            }
            Toast.makeText(this,"Dados inválidos\n"+msg ,Toast.LENGTH_LONG)
                    .show();
        }
    }
}
