package org.jacoco.difference;

import java.io.File;
import java.io.IOException;

import org.jacoco.core.tools.ExecFileLoader;

public class CalculateDifference {
	
	
	
	public void calculateDifference(ExecFileLoader ExecFileLoader1,ExecFileLoader ExecFileLoader2,String destinationPath) throws IOException {
		
		File dest = new File(destinationPath); 
		
		ExecFileLoader1.getExecutionDataStore()
	.subtract(ExecFileLoader2.getExecutionDataStore());
		
		System.out.println("Subtarction Executed");

		ExecFileLoader1.save(dest, false);
		System.out.println("Subtarcted output saved");
	}
	
}
