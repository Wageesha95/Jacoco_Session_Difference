package org.jacoco.difference;



import java.io.File;
import java.io.IOException;


import org.jacoco.core.tools.ExecFileLoader;;

public class JacocoDifference {


		static String destinationFolder = "D:\\2nd floor\\jacoco sessions diff" ;
		static String source1 = "D:\\2nd floor\\jacoco sessions\\jacoco-client.exec";
		static String source2 = "D:\\2nd floor\\jacoco sessions\\TestMyClass2.exec";

		public static void main(final String args[]) throws IOException {
			
			
			String source1 = args[0];
			System.out.println(args[0]);
			String source2 = args[1];
			System.out.println(args[1]);
			String destinationFolder = args[2];
			String fileName = "difference.exec";
			
			
			File f = new File(destinationFolder,fileName);
			f.createNewFile();
			System.out.println(fileName + " file is created");

			
			System.out.println("================================================================================");
			
			System.out.println("Code Coverage file        :"+source1);
			System.out.println("Test Coverage file        :"+source2);
			System.out.println("Coverage difference file  :"+destinationFolder);
			
			System.out.println("================================================================================");

			FileListCreation cli = new FileListCreation();
			cli.Load(source1,source2);
			
			FileLoader fileLoader = new FileLoader();
			ExecFileLoader one = fileLoader.getExecFile(FileListCreation.execfiles,0);
			ExecFileLoader two = fileLoader.getExecFile(FileListCreation.execfiles,1);
			
			CalculateDifference caldiff = new CalculateDifference();
			caldiff.calculateDifference(one, two, destinationFolder+fileName);
			
			

		}

		/*java -jar org.jacoco.difference-0.0.1-SNAPSHOT-jar-with-dependencies.jar "D:\\2nd floor\\jacoco sessions\\jacoco-client.exec"  "D:\\2nd floor\\jacoco sessions\\TestMyClass2.exec" "D:\\2nd floor\\jacoco sessions diff\\diff.exec" */
			

		}


	


