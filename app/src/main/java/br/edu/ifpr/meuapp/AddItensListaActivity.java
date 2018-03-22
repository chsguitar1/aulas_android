package br.edu.ifpr.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.edu.ifpr.meuapp.model.Itens;
import br.edu.ifpr.meuapp.model.Lista;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddItensListaActivity extends AppCompatActivity {
    Button btSalvaItens;
    Lista lista;
    @BindView(R.id.bt_add_item)
    Button btAddItem;
    @BindView(R.id.ed_nome_item)
    TextInputEditText edNomeItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_itens_lista);
        ButterKnife.bind(this);
        btSalvaItens = findViewById(R.id.bt_salva_itens);
        btSalvaItens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaListas();
            }
        });
        //pega a lista que veio da tela anterior
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            lista = (Lista) extras.getSerializable("li");
            this.setTitle("Lista de " + lista.getNome());
        }

    }

    private void irParaListas() {
        Intent it = new Intent(AddItensListaActivity.this,
                ListasActivity.class);
        startActivity(it);
    }

    @OnClick(R.id.bt_add_item)
    public void onViewClicked() {
     //cria um item
        Itens itens = new Itens();
        //pega o valor do campo digitado e coloca no item
        itens.setNome(edNomeItem.getText().toString());
        //adicionar um item na lista que veio da outra tela
        lista.getItens().add(itens);
        //aqui mostra no log cat
        System.out.println("lista ="+lista.toString());
        //limpa o campo
        edNomeItem.setText("");
    }
}
