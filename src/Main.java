import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Receba o nome de um usuário pelo console, e depois receba um número positivo.
        System.out.println("Digite seu nome: ");
        String nomeUsuario =  sc.nextLine();

        //Garantindo que o numero seja positivo.
        int numeroDigitado = verificarNumPositivo();


        //Exiba o número de forma crescente e decrescente, de zero a n, e depois de n a zero.
        forCrescente(numeroDigitado);
        forDecrescente(numeroDigitado);

        //Em seguida, se o nome do usuário tiver mais do que 6 letras, exiba-o n vezes. Se não, exiba-o somente 1 vez.
        verificarNome(nomeUsuario, numeroDigitado);

        sc.close();
    }

    //Função Crescente
    public static void forCrescente(int numeroDigitado){
        System.out.println("A forma Crescente de 0 a " + numeroDigitado + ":");
        for (int i = 0; i <= numeroDigitado; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");
    }

    //Função Decrescente
    public static void forDecrescente(int numeroDigitado){
        System.out.println("A forma Decrescente de " + numeroDigitado + " a 0:");
        for (int i = numeroDigitado; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");
    }

    //Verifica se o nome do usuario tem mais de 6 letras
    public static void verificarNome(String nomeUsuario, int numeroDigitado){
        if(nomeUsuario.length() > 6){
            System.out.println("Seu nome tem mais de 6 letras.\n");
            for (int i = 1; i <= numeroDigitado; i++) {
                System.out.println(nomeUsuario);
            }
        } else {
            System.out.println("Seu nome não tem mais de 6 letras.");
            System.out.println(nomeUsuario);
        }
    }

    //Funçao que analisa e garante que o numero digitado pelo usuario e positivo
    public static int verificarNumPositivo(){
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = 0;
        do {
            System.out.println("Digite um numero maior que 0: ");
            numeroDigitado = sc.nextInt();
            if(numeroDigitado <= 0){
                System.out.println("Numero digitado e invalido, digite um numero Positivo!");
            }
        } while (numeroDigitado <= 0);

        sc.close();

        return numeroDigitado;
    }

}
