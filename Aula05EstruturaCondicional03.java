package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        //(condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda nao tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
