package ejercicio3;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
descuento des1=new Descuento(0.1,100);
double total=des1.getTotal();
des1.settotalCompras(150);
System.out.println("total compras"+total);
System.out.println("total Compras"+ des1.gettotal);

	}

}
