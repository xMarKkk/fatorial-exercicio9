import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    int n1, n2, n3, n4, n5, n6, i;
    n1=1;
    n2=2;
    n4=1;
    n3=1*n2;

    System.out.println("Qual numero fatorial você quer calcular?");
    i= scan.nextInt();
    if(i>1){
    while(i>1){
      i--;
      n3=n3*n2;
      n2++;
      n4=n3/2;
    }
      System.out.print(n4);
    }
    else{
      System.out.println("Escolha um numero positivo inteiro");
    }
  }
}