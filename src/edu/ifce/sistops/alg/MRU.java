package edu.ifce.sistops.alg;
import java.io.File;

public  class MRU {
	private static int insert=0;
	private File arq;
	private int acertos=0,erros=0,bitR=0;
	private int frameinicial,framefinal;
	public MRU(File arq,int min,int max,int bitR){
		this.arq=arq;
		this.frameinicial=min;
		this.framefinal=max;
		this.bitR=bitR;
		
	}
}
