import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.print("Digite um número: \n "); 
      double n1 = scanner.nextDouble();
      System.out.print("Digite outro número: \n "); 
      double n2 = scanner.nextDouble();
      System.out.print("Digite a operação desejada (+ , - , * , / ): \n");
      char operator = scanner.next().charAt(0); 
      scanner.close();  
      double result;

      switch(operator) {
        case '+':
        result = n1 + n2;
        break;
        case '-':
        result = n1 - n2;
        break;
        case '*':
        result = n1 * n2;
        break;
        case '/':
        if (n2 == 0){
            System.out.println("Erro: Não é possível realizar divisão por zero.");
        }
        result = n1 / n2;
        break;
        default: System.out.println("Operação inválida");
        return;
    }
    System.out.println(n1+" "+operator+" "+n2+": "+result);
    }
}

       
     

