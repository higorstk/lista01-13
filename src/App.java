import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Passo1:Mostrar variaveil
    String sexo;
    String H;
    String M;
    double altura;
    double pesoidealhomem;
    double pesoidealmulher;
    
    // Passo2:Entrada de dados
    Scanner teclado = new Scanner(System.in);
     System.out.println("Qual seu sexo ? Digite 'H' = HOMEM ou 'M' = MULHER");
    sexo = teclado.next();
    
    System.out.println("Digite sua altura :");
    altura = teclado.nextDouble();
    

    if (sexo .equals("H")){
       pesoidealhomem = (72.7 * altura) - 58;
      
      System.out.println("Seu peso ideal é :" + pesoidealhomem);
      
    }
    else{
      if (sexo .equals("M")){
         pesoidealmulher = (62.1 * altura) - 44.7;
       
        System.out.println("Seu peso ideal é :" + pesoidealmulher);
      }
    }
  }
}
