package org.jacoco.difference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class FileListCreation {
	
	static List<File> execfiles = new ArrayList<File>();
	

	public List<File> Load(String sourcePath1,String sourcePath2) throws IOException {

	
		

		
		String fileDir1 = sourcePath1;
		final File dir1 = new File(fileDir1 );

		execfiles.add(dir1);
		
		String fileDir2 = sourcePath2;
		final File dir2 = new File(fileDir2 );

		execfiles.add(dir2);
		
	//	final File[] filesArray = dir.listFiles();
	//	execfiles.addAll(Arrays.asList(filesArray));

		if (execfiles.isEmpty()) {
			System.out.printf("[WARN] No execution data files provided.");
		} else {
			return execfiles;
		}
		return null;

	}


	




}
