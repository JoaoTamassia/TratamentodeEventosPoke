package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GerenciadorPokemon implements ActionListener{
    private TelaPokemon tp;

    public GerenciadorPokemon(){
        tp = new TelaPokemon();
        tp.adicionarListener1(this);
    }

    // O parâmetro e contém informações sobre o evento
    // gerado ao apertar o botão
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("vou aprender a pegar os dados do pokemon da tela para o objeto pokemon e vice-versa na próxima aula!");
    }

}
