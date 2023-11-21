package org.example;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TelaPokemon extends JFrame{
    private JLabel jlName;
    private JTextField jtName;
    private JLabel jlHP;
    private JTextField jtHP;

    private JLabel jlAttack;
    private JTextField jtAttack;
    private JLabel jlDefense;
    private JTextField jtDefense;

    private JButton jbBotao1;
    private JButton jbBotao2;

        public TelaPokemon(){
            // Configurar a tela
            this.setTitle("Pokemon");
            this.setLayout(null);
            this.setSize(500,500);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Instanciar cada componente

            jlName = new JLabel();
            jlName.setText("Name:");
            jlName.setBounds(50,100,50,20);

            jtName = new JTextField();
            jtName.setBounds(110,100,200,20);

            jlHP = new JLabel();
            jlHP.setText("HP:");
            jlHP.setBounds(50,150,50,20);

            jtHP = new JTextField();
            jtHP.setBounds(110,150,200,20);

            jlAttack = new JLabel();
            jlAttack.setText("Attack:");
            jlAttack.setBounds(50,200,50,20);

            jtAttack = new JTextField();
            jtAttack.setBounds(110,200,200,20);

            jlDefense = new JLabel();
            jlDefense.setText("Defense:");
            jlDefense.setBounds(50,250,70,20);

            jtDefense = new JTextField();
            jtDefense.setBounds(110,250,200,20);

            jbBotao1 = new JButton();
            jbBotao1.setText("Cadastrar");
            jbBotao1.setBounds(300,300,150,30);

            jbBotao2 = new JButton();
            jbBotao2.setText("Apresentar");
            jbBotao2.setBounds(120,300,150,30);

            // Adicionar cada componente na janela gráfica

            this.add(jlName);
            this.add(jtName);
            this.add(jlHP);
            this.add(jtHP);
            this.add(jlAttack);
            this.add(jtAttack);
            this.add(jlDefense);
            this.add(jtDefense);
            this.add(jbBotao1);
            this.add(jbBotao2);

            // Deixar a janela visível

            this.setVisible(true);
        }

        public void adicionarListener1(ActionListener gp){
            jbBotao1.addActionListener(gp);
            jbBotao2.addActionListener(gp);
        }

}
