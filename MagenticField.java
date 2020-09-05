import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagenticField {

	public static void main1() throws IOException {
		FileWriter fw=null;
		int i;
        fw=new FileWriter("ElectricField.txt");
		BufferedReader br = new BufferedReader(new FileReader("VectorPotential.txt"));
		try {
		    String line1 = br.readLine();
		    String line2 = br.readLine();
		    while (line1 != null && line2!=null) {
		    	 String str = line1;
		         String [] arrOfStr = str.split(" ");
		         String str1 = line2;
		         String [] arrOfStr1 = str1.split(" ");
		         for (i=0;i<10;i++) {
			        double xPos = Double.parseDouble(arrOfStr[i]);
			        double yPos = Double.parseDouble(arrOfStr1[i]);
			        System.out.println();
			        Double r = xPos - yPos;
			        r = (-1)*(java.lang.Math.round(r*1000.0)/1000.0);
			        fw.write(r.toString());
			        fw.write(" ");
		         }
		        fw.write("\n");
		        line1 = br.readLine();
		        line2 = br.readLine();
		    }
		    
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    br.close();
		    fw.close();
		}

	}

}
