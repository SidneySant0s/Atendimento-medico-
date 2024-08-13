package Atividade1;

import javax.swing.JOptionPane;

public class MainPaciente {

    public static void main(String[] args) {
        String n;
        String e;
        String t;
        String d;
        String p;
        String r;

        n = JOptionPane.showInputDialog("Digite o Nome do paciente");
        r = JOptionPane.showInputDialog("Digite o RG do paciente:");
        e = JOptionPane.showInputDialog("Digite o Endereco");
        t = JOptionPane.showInputDialog("Digite o Telefone");
        d = JOptionPane.showInputDialog("Digite a data de nascimento");
        p = JOptionPane.showInputDialog("Digite a profissão");

        Paciente P1 = new Paciente();

        Paciente P2 = new Paciente(n ,t, e, d, p, r);
        System.out.println("Nome: " + P2.Nome);
        System.out.println("Endereco: " + P2.Endereco);
        System.out.println("Telefone: " + P2.Telefone);
        System.out.println("Data de nascimento: " + P2.Datanasc);
        System.out.println("Profissão: " + P2.Profissao);
        System.out.println("RG: " + P2.rg);
    }
    
}
