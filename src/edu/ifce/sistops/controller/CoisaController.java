package edu.ifce.sistops.controller;

import edu.ifce.sistops.alg.Fifo;
import edu.ifce.sistops.model.ResultadoTeste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CoisaController {
	private int ac=0;
	List<ResultadoTeste> list = new LinkedList<>();

	public List<ResultadoTeste> iniciarTeste(String nomeArquivo, int q1, int q2, int bitR) throws IOException {
		// TODO trocar pelo código real do uso dos algoritmos
		// List<ResultadoTeste> list = new ArrayList<>();
//		List<ResultadoTeste> list = new LinkedList<>();
		
		/*
		list.add(new ResultadoTeste(1, 10, 22, 34, 65, 23));
		list.add(new ResultadoTeste(2, 30, 42, 34, 65, 33));
		list.add(new ResultadoTeste(3, 50, 72, 44, 65, 43));
		list.add(new ResultadoTeste(4, 60, 82, 54, 75, 53));
		list.add(new ResultadoTeste(5, 70, 92, 64, 75, 63));
		list.add(new ResultadoTeste(6, 70, 92, 74, 75, 73));
		list.add(new ResultadoTeste(7, 80, 82, 84, 85, 83));
		list.add(new ResultadoTeste(8, 90, 92, 94, 95, 93));
		list.add(new ResultadoTeste(9, 100, 202, 304, 605, 303));
		list.add(new ResultadoTeste(10, 120, 282, 340, 625, 330)); */

		for (; q1 <= q2; q1++) {
            String content = new String(Files.readAllBytes(Paths.get("Gui.java")));
            String aux[]=content.split("-");
            ResultadoTeste r = new ResultadoTeste();
			// http://www.adam-bien.com/roller/abien/entry/java_8_reading_a_file
			r.setNumeroFrames(q1);
			// TODO rodar algoritmos 
			// AlgFifo a = new AlgFifo(nomeArquivo,q1);
		 	 Fifo t=new Fifo(content,q1,q2);
			//a.executar();
		 	 t.RodaAlgoritmoFifo(aux);
			// r.setNumeroAcertosFIFO(a.getAcertos());
		 	 r.setNumeroAcertosFIFO(t.getNumeroAcertosFIFO());
		 	
			 list.add(new ResultadoTeste(q1,t,0,0,0,0));
			 
		}

		return list;
	}
        
}
