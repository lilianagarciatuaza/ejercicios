import java.util.Scanner;


public class deber1 {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		{
	  Scanner teclado= new Scanner(System.in);

	       int [] prome;
	       prome= new int[20];

	       int j=0,i;
	       float total=0;
	       for(i=0;i<20;++i)
	       {
	           System.out.print("ingrese calificacion del alumno "+i+": ");
	           prome[i]=teclado.nextInt();
	          total=total+prome[i];
	       }
	       System.out.println("total es: "+total);
	       total= total/20;
	       System.out.println("promedio general es: "+total);
	       for(i=19;i>=0;--i)
	           System.out.println("alumno "+i+" su promedio es: "+prome[i]); 
	     



	}
	}
}


