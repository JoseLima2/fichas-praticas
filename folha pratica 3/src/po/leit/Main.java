package po.leit;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n= 0;
    int i = 0;
    int d = 0;
    int p = 0;
    int somaI= 0;
    int somaP= 0;
    int somaQ= 0;
    int b;
    int c;

        System.out.println("insira um valor inteiro");
        n= ler.nextInt();
    while (i <n){
      int q;
      q = i * i;
      if (q < n) {
          System.out.println("quadrado "+q);
      }
        i++;
    }
    while (d < n) {
        if (d % 10 == 0) {
            System.out.println("divisao " + d);
        }
        d++;
    }

    while (p < n){
int x =(int) Math.pow(2,p);
            if(x < n){
            System.out.println("potencia "+ x);}
p++;

    }



for (int y = 0;y<=100;y++ ){

    if(y%2 == 0){
        somaP= somaP + y;
    }
}
System.out.println("A soma dos numeros pares é = "+ somaP);

for(int a = 0;a <= 100;a++ ){
    somaQ = somaQ+ (a*a);

}
        System.out.println("A soma dos quadrados é= " + somaQ);

        System.out.println("insira um numero");
        b= ler.nextInt();
        System.out.println("insira outro numero");
        c= ler.nextInt();
        if( b<=c){
            for (;b<=c;b++)
                if (b%2 != 0){
                    somaI= somaI + b;
                }

        }
        else if(c<=b){
            for (;c<=b;c++){
                if (c%2 !=0){
                    somaI = somaI + c;
                }
            }
        }
        System.out.println("Soma de numeros impares recebidos " + somaI );












    }
}
