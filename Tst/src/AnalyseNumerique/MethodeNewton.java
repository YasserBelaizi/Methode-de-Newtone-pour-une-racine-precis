package AnalyseNumerique;

public class MethodeNewton {

	public static void main(String[] args) {
		double res=1; // Juste pour d�marrer la boucle while 
		double x0=3.0 ; 
		double Fx0;
		double Fx0prime;
		int n=0; //quelle indice nous a donn� la racine par la pr�cision  
		double La_Precision =0.0001;
		
		while(res>La_Precision) {
		System.out.println("** It�ration num�ro : "+(int)n+" **");
		Fx0 = (double)Math.round(calculeF(x0)*10000)/10000;
        Fx0prime = (double)Math.round(calculeFprime(x0)*10000)/10000;
		System.out.println("Fx"+n+" : "+Fx0);
		System.out.println("Fx"+n+"' : "+Fx0prime);
		double x1 = (double)Math.round((x0-(Fx0/Fx0prime))*10000)/10000;
		System.out.println("x"+n+" : "+x1);
	    res = (double)Math.round(Math.abs(x1-x0)*10000)/10000;
		System.out.println("x"+(n+1)+"-"+"x"+n+" = "+res);
	    n++;
	    x0=x1;
		}
		n--; 
		//La premi�re iteration on commance par x0 donc n=0
        //mais dans la boucle n prend 1 dans la premier it�ration
		System.out.println("La racine trouv� est x = "+n+" par pr�cision = "+La_Precision);

	}
    public static double calculeF(double x) {
    	return Math.pow(x, 2)-4*Math.sin(x);
    }
    public static double calculeFprime(double x) {
    	return 2*x-4*Math.cos(x);
    }
}
