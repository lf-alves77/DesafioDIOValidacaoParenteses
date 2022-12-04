// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String caracter = scanner.nextLine();

        boolean teste = false;

        if(caracter.equals("()")){
            System.out.println("true");;

        } else if (caracter.equals("[]")) {
            System.out.println("true");;
        }

        else{
            System.out.println("false");;

        }





    }}





