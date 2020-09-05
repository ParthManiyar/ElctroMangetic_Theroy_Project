import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
public class ElectricField {

	private static double xPos;
	private static double yPos;

	public static void main2() {
		try {
				int i;
				FileWriter fw=null;
		        fw=new FileWriter("MagneticField.txt");
				File file = new File("VectorPotential.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					String [] columns = line.trim().split("\\s+");
					for(i=0;i<9;i++) {
					xPos = Double.parseDouble(columns[i]);
			        yPos = Double.parseDouble(columns[i+1]);
			        Double r = yPos-xPos;
			        r = java.lang.Math.round(r*1000.0)/1000.0;
					fw.write(r.toString());
					fw.write(" ");
				}
				fw.write("\n");
			}
			
			fileReader.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
