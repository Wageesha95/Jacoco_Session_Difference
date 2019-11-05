package org.jacoco.difference;

import java.io.File;
import java.io.IOException;


import java.util.List;

import org.jacoco.core.tools.ExecFileLoader;

public class FileLoader {


	private  ExecFileLoader loadExecutionData(List<File> execFiles, int x) throws IOException {

		 ExecFileLoader execFileLoader = new ExecFileLoader();
		

		System.out.printf("[INFO] Loading execution data file %s.%n",
				((File) execFiles.get(x)).getAbsolutePath());
		execFileLoader.load(execFiles.get(x));

		return execFileLoader;

	}
	
	
	
	public ExecFileLoader  getExecFile(List<File> execFiles,int x) throws IOException {
		return this.loadExecutionData( execFiles,x);
		}
	
	
	}


	


