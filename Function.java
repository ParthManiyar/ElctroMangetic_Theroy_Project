class Function{                                                        
	public static double s;
    double f (double x) { 
    		return 1/(java.lang.Math.sqrt((x*x) + (s*s)));															
    }

    double IntSimpson(double a, double b,int n){                       
    	double h = (b - a) / n;              // step size
        double sum = 0.5 * (f(a) + f(b));    // area
        for (int i = 1; i < n; i++) {
           double x = a + h * i;
           sum = sum + f(x);
    }
       return sum*h;
    }
}  