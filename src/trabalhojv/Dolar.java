package trabalhojv;
//Dolar.java 5.50
public class Dolar extends Moeda {
 public Dolar(double valor) {
     super(valor);
 }

 @Override
 public String getNome() {
     return "Dólar";
 }

 @Override
 public double converterParaReal() {
    
     return valor * 5.50; // Exemplo: 1 Dólar = 5.50 Reais
 }
}