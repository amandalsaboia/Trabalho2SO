package edu.ifce.sistops.alg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.ifce.sistops.alg.AlgoritmoSwap;
import edu.ifce.sistops.model.*;

public class FIFO {

private List<String> listaFifo = new ArrayList<String>();
private List<Number> listaAcertos = new ArrayList<Number>();
// private List<String> memoria = new ArrayList<String>();
//private List<Integer> ListAcertos = new ArrayList<Integer>();
private int tamanhoIni;
private int tamanhoFin;
private int acertos;
private int elementos;
public FIFO(int tamanhoIni,int tamanhoFin,ArrayList<String> arq)
{
    this.tamanhoIni=tamanhoIni;
    this.tamanhoFin=tamanhoFin;
    this.listaFifo=arq;
    this.elementos=0;
    this.acertos=0;
}
public void insere(String t) {
  this.listaFifo.add(t);
  elementos++;
}

public void remove() {
  elementos--;
  //System.out.printf("\nremovido %s\n", this.listaFifo.get(0));
  this.listaFifo.remove(0);
  
}
public void imprime()
  {
      int i=0;
      for(i=0;i<this.listaFifo.size();i++)
      {
          System.out.printf(" %s ",this.listaFifo.get(i));
      }
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
    
    if((this.listaFifo.contains(strWrite)||this.listaFifo.contains(strRead))==true)
    {
        this.acertos++;
    }
    else
    {
        if(this.elementos<this.tamanhoIni)
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
    this.listaFifo.clear();
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
    while(this.tamanhoIni<=this.tamanhoFin)
    {
       this.listaAcertos.add(this.RodaAlgoritmoFifo(s));
       this.tamanhoIni++;
    }
    return this.listaAcertos;
}

}