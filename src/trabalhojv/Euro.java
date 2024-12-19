package trabalhojv;
//Euro.java 6.20
public class Euro extends Moeda {
 public Euro(double valor) {
     super(valor);
 }

 @Override
 public String getNome() {
     return "Euro";
 }

 @Override
 public double converterParaReal() {
    
     return valor * 6.20; //  1 Euro = 6.20 Reais
 }
}
