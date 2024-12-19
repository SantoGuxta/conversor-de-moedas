package trabalhojv;
//Real.java 1.00
public class Real extends Moeda {
 public Real(double valor) {
     super(valor);
 }

 @Override
 public String getNome() {
     return "Real";
 }

 @Override
 public double converterParaReal() {
    
     return valor *1.00;
 }
}