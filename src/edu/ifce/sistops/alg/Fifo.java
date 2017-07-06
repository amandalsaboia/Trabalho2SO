package edu.ifce.sistops.alg;
import java.io.IOException;
//import java.io.File;
import java.util.LinkedList;
import java.util.List;

//import FileUtil;

public class Fifo {
	private static int insert=0;
	private String arq;
	private int acertos=0,erros=0,elementos;
	private int frameinicial,framefinal;
	private LinkedList<String> listafifo=new LinkedList <>();
	private List<Integer> lis =new LinkedList <>(); //lista de acertos
	public Fifo(String arq,int frameinicial,int framefinal){
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
      public void imprime()
      {
          int i=0;
          for(i=0;i<this.listafifo.size();i++)
          {
              System.out.printf(" %s ",this.listafifo.get(i));
          }
      }
      public void insereFifo(String elem) throws IOException
      {
          //String aux=elem.substring(0, elem.length()-1);
    	  String aux = FileUtil.getString(arq);

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
     public List<Integer> repeticao(String s[])
      {
          while(this.frameinicial<=this.framefinal)
          {
             this.lis.add(this.RodaAlgoritmoFifo(s));
             this.frameinicial++;
          }
          return this.lis;
      }
	public int getNumeroAcertosFIFO() {
		// TODO Auto-generated method stub
		return acertos;
	}
	


}
