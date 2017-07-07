package edu.ifce.sistops.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
	public static String[] lerArquivo(File file) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(file);
        
        String line;
        String[] elementosLidos = null;
        
        if(scanner.hasNextLine()) {
            line = scanner.nextLine();
            
            elementosLidos = line.split("-");
        }
        return elementosLidos;
    }

}
