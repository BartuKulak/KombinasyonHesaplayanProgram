import java.util.Scanner;
public class Main {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n,r,fak1=1,fak2=1,fak3=1,kom;
    System.out.print("N değerini girin: ");
    n= input.nextInt();
    System.out.print("R değerini girin: ");
    r= input.nextInt();
    for(int i=1;i<=n;i++)
        fak1=fak1*i;
    for(int j=1;j<=(n-r);j++)
        fak2=fak2*j;
    for(int j=1;j<=r;j++)
        fak3=fak3*j;
    kom=fak1/(fak3*fak2);
    System.out.println("Kombinasyon= "+kom);
}
}
