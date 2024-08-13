
package Atividade1;

public class Paciente {
   String Nome;
   String rg;
   String Endereco;
   String Datanasc;
   String Telefone;
   String Profissao;
   
   
   Paciente(){};

   Paciente (String n, String t, String e, String d, String p, String r){
      this.Nome = n;
      this.Endereco = e;
      this.Telefone = t;
      this.Profissao = p;
      this.Datanasc = d;
      this.rg= r;
   }
}
