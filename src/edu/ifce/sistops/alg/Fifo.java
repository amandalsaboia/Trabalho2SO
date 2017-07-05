package edu.ifce.sistops.alg;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Fifo {
	private static int insert=0;
	private File arq;
	private int acertos=0,erros=0,elementos;
	private int frameinicial,framefinal;
	private LinkedList<String> listafifo=new LinkedList <>();
	private List<String> lis =new LinkedList <>(); //lista de acertos
	public Fifo(File arq,int frameinicial,int framefinal){
		this.arq=arq;
		this.frameinicial=frameinicial;
		this.framefinal=framefinal;
		this.acertos=0;
		this.elementos=0;
		
	}
	public void insere(String ele) {
	    this.listafifo.add(ele);
	    elementos++;
	  }
      public void remove (){
    	  elementos--;
    	  this.listafifo.remove(0);
      }
      public void insereFifo(String elem)
      {
          String aux=elem.substring(0, elem.length()-1);

          String strRead;
          StringBuilder sb = new StringBuilder();
          sb.append(aux);
          sb.append('R');
          strRead = sb.toString();
          
          String strWrite;
          StringBuilder sb2 = new StringBuilder();
          sb2.append(aux);
          sb2.append('W');
          strWrite = sb2.toString();
          
          if((this.listafifo.contains(strWrite)||this.listafifo.contains(strRead))==true)
          {
              this.acertos++;
          }
          else
        	 
          {
              if(this.elementos<this.frameinicial)
              {
                  this.insere(elem);
              }
              else{
                  this.remove();
                  this.insere(elem);
                  
              }
          }
          
      }

      public int RodaAlgoritmoFifo(String s[])
      {
          this.acertos=0;
          this.elementos=0;
          //this.memoria.clear();
          this.listafifo.clear();
          int i=s.length-1;
          int j;

              for(j=0;j<=i;j++)
              {
                  //System.out.println("\n");
                  this.insereFifo(s[j]);
                  //this.imprime();
                  //System.out.println("\n");
              }
              
          return this.acertos;
                
      }
     public List<Number> repeticao(String s[])
      {
          while(this.frameinicial<=this.framefinal)
          {
             this.lis.add(this.RodaAlgoritmoFifo(s));
             this.frameinicial++;
          }
          return this.lis;
      } 


}
