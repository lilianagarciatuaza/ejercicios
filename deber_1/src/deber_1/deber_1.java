package deber_1;

import java.util.Scanner;

public class deber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		        Scanner teclado=new Scanner(System.in);
		        int pro=0,cal,i;
		        System.out.println("Bienvenidos al sistema");
		        for(i=1;i<=50;++i)
		           {
		            System.out.println("ingrese calificacion "+i+": ");
		            cal=teclado.nextInt();
		            pro+=cal;
		           }
		        pro=pro/50;
		       
		        if(pro>=70)
		            System.out.println("\npromedio= "+pro+"\nAPROVADO");
		        else
		            System.out.println("\npromedio= "+pro+"\nREPROVADO");
		        }     }
}
