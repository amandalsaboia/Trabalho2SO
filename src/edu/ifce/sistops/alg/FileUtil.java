package edu.ifce.sistops.alg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
	
	public static String getString(String arq) throws IOException {
		BufferedReader reader = null;
		try {
			reader= new BufferedReader(new FileReader(arq));
			return reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			reader.close();
		}
		return null;
	}

}