import java.io.File;

public class Fifo {
	private static int insert=0;
	private File arq;
	private int acertos=0,erros=0;
	private int frameinicial,framefinal;
	public Fifo(File arq,int min,int max){
		this.arq=arq;
		this.frameinicial=min;
		this.framefinal=max;
		
	}

}
