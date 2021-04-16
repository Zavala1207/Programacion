import java.util.Scanner;
 
public class Problema5 {
	public static void main(String[]args){
 
	int n, m, nec, i, k;
 
	Scanner leer = new Scanner(System.in);
 
	System.out.print("Número de elementos del vector A: ");
	n=leer.nextInt();
	System.out.print("Número de elementos del vector B: ");
	m=leer.nextInt();
 
 
 
	int a[] = new int [n];
 
	for(i=0;i<n;i++){
		System.out.print("Elemento del vector A: ");
		a[i]=leer.nextInt();
	}
 
	int b[] = new int [m];
 
	for(k=0;k<m;k++){
		System.out.print("Elemento del vector B: ");
		b[k]=leer.nextInt();
	}
 
	int c[] = new int [(n+m)-1];
 
	for(i=0;i<n;i++){
		c[i]=a[i];
	}
 
	nec=n-1;
 
	for(k=0;k<m;k++){
		i=0;
		while((i<n) && (b[k]!=a[i])){
			i=i+1;
 
		}
		if(i>n){
			nec=nec+1;
			c[nec]=b[k];
		}
	}
 
	for(i=0;i<nec;i++){
		System.out.println("Valor del vector C["+i+"]: "+c[i]);
	}
 
	}
}