 package calculadora;

 public class Operacoes {
   
    public double n1;
    public double n2;

    public double somar (){
        return n1 + n2;
    }

    public double dividir (){
        if (n2 == 0) {
            System.out.println("Divisão Inválida.");
            return 0; // Retorna 0 se a divisão for inválida
        } else {
            return n1 / n2; // Retorna o resultado da divisão se n2 não for zero
        }
    }

    public double subtracao() {
            return n1 - n2;
        }
    
    public double multiplicar(){
            return n1 * n2;
        }
    

    public double porde1num (){
        return n1 * (n2/100);
    }
 }