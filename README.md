# ElctroMangetic_Theroy_Project

1. This Program Calculate Values of Electric filed and Magnetic field for any function of current which is depend only on time at specific location of space.

2.  All Unit follow MKS unit Style.

3.  You have to specify how current depend on time (Function of current) in a txt file called  in specific way (See Guidelines below.) You have to create it manually.

4. Your value for S must be between 1 to 300 mega meter. However , we are initially calculate Starting from 1 to 10 mega meter .

5.   After successful execution of program all answer of Electric-field will be stored in “ElectricField.txt”, all answer of Vector potential will be stored in “VectorPotential.txt” and answer of Magnetic-field will be stored in “MagneticField.txt” automatically in pre-define format (For format see Guideline below.).

6. One more thing about all field’s answers is if you want to final answer then you have to multiply it with 10e-7. Program can’t do it. But the graph will be plotted correctly 

7. Answer of all field is not accurate but maximum error due to derivatives is ±30% (because value of time is always increase by 1 second) for some case where value of time is small i.e. t < 10 second and after this error reduce to ±1.5%. This error is only in value of B and E.

8.Error in value of Vector Potential is less than ±1%.

9. Main code of this project stored inside the file name “Application.java” in java programming languages. Execution of it may take some time.



					Guidelines
	
1. For input file: -

* Make sure that before you run this program you created input file in same directory in which your “Application.java” file located or specify the absolute path of input file.

For t=0 limit is undefined. So, there will be kink in the graph. 

* In every line, you first have to write value of time in second then put a space and write value of current corresponding to this particular value of time.

* So, your input file look like this.......

	1 1
	2 2
	.  .
	.  .
	1000 8

	
2. Format of filed (Answer) file: -

* After execution of program, program write 10 columns and 1000 rows in three of this files.

*Here each column indicates different values of S and each row indicate different value of time.


3. Make sure that all file you created is in same directory in which “Appication.java” located and has extension “.txt”

4. If you run program more than one time then it will overwrite values in files.

5. After execution you get message on terminal “PROGRAM SUCESSFULY EXECUTED!” if it executes successfully otherwise you probably made some mistake in creating file (you also get error message for the same.).

6. It will run for both the negative and positive value.

7. we are assuming that there will be same current in the whole wire at any point of time.   

8. Here I am assuming that tr = 0. Therefore, limits define by the formula   b=sqrt(((300*t)-(s))*(((300*t)+(s))

The sample attached with the file is for current = constant value.

*******************************************************************************

