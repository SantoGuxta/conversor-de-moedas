package trabalhojv;
//Moeda.java
public abstract class Moeda {
 protected double valor;

 public Moeda(double valor) {
     this.valor = valor;
 }

 public double getValor() {
     return valor;
 }

 public abstract String getNome();

 public abstract double converterParaReal();
}
