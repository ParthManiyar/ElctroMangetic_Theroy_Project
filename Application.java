import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Application {

	public static void main(String[] args) {
		try {
				Function function;                                         
				function = new Function();
		    	double t = 1 ;
		        double a = 0 ;
		        double it;
		        FileWriter fw=null;
		        String filename;
		        Scanner input = new Scanner(System.in);
		        System.out.print("enter the file name:");
		        filename = input.next();
		        fw=new FileWriter("VectorPotential.txt");
				File file = new File(filename);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					String str = line;
			         String [] arrOfStr = str.split(" ");
					t = Double.parseDouble(arrOfStr[0]);
			        it = Double.parseDouble(arrOfStr[1]);
				    	for(Function.s=1;Function.s<=10;Function.s++) {
						    double b = java.lang.Math.sqrt((double)((300*t)-(Function.s))*(double)((300*t)+(Function.s))) ;
						    int n = 100000;
						    Double resultat =2*function.IntSimpson(a,b,n)*it;
						    resultat =  java.lang.Math.round(resultat.doubleValue()*1000.0)/1000.0;
						    fw.write(resultat.toString());
						    fw.write(" ");
				    	}
		    	fw.write("\n");
				}
				fw.close();
			    input.close();
				MagenticField m = new MagenticField();
				m.main1();
				ElectricField e= new ElectricField();
				e.main2();
				System.out.println("program run successfully");
		}catch(Exception e) {			
			System.out.println(e);
		}		
	}
}
