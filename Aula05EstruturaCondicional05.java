package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 10;
        // chat, int, byte, short, enum, string

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }

        String sexo = "F";
         switch (sexo){
             case "M":
                 System.out.println("Homem");
                 break;
             case "F":
                 System.out.println("Mulher");
                 break;
             default:
                 System.out.println("Inválido");
                 break;

         }

    }
}
