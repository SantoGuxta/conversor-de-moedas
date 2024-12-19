package trabalhojv;
//Cofrinho.java
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
 List<Moeda> listaMoedas;

 public Cofrinho() {
     listaMoedas = new ArrayList<>();
 }

 public void adicionar(Moeda moeda) {
     listaMoedas.add(moeda);
 }

 public void remover(Moeda moeda) {
     listaMoedas.remove(moeda);
 }

 public void listagemMoedas() {
     for (Moeda moeda : listaMoedas) {
         System.out.println(moeda.getNome() + ": " + moeda.getValor());
     }
 }

 public double totalConvertido() {
     double total = 0;
     for (Moeda moeda : listaMoedas) {
         total += moeda.converterParaReal();
     }
     return total;
 }
}