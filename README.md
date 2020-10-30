# Methode-de-Newtone-pour-une-racine-precis
Dans l'analyse numérique , existe une méthode pour avoir une solution d'une fonction , la solution est une racine qui est proche d'un Alpha par une précision donnée. 

public class MethodeNewton {

	public static void main(String[] args) {
		double res=1; // Juste pour démarrer la boucle while 
		double x0=3.0 ; 
		double Fx0;
		double Fx0prime;
		int n=0; //quelle indice nous a donné la racine par la précision  
		double La_Precision =0.0001;
		
		while(res>La_Precision) {
		System.out.println("** Itération numéro : "+(int)n+" **");
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
		//La première iteration on commance par x0 donc n=0
        //mais dans la boucle n prend 1 dans la premier itération
		System.out.println("La racine trouvé est x = "+n+" par précision = "+La_Precision);

	}
    public static double calculeF(double x) {
    	return Math.pow(x, 2)-4*Math.sin(x);
    }
    public static double calculeFprime(double x) {
    	return 2*x-4*Math.cos(x);
    }
}
