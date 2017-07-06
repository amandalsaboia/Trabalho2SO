package edu.ifce.sistops.model;

public class ResultadoTeste {
  
 /* private int numeroFrames;
  private int numeroAcertosFIFO;
  private int numeroAcertosSegundaChance;
  private int numeroAcertosNUR;
  private int numeroAcertosMRU;
  private int numeroAcertosOtimo; */
	private Object numeroFrames;
	private Object numeroAcertosFIFO;
    private Object numeroAcertosSegundaChance;
    private Object numeroAcertosNUR;
	private Object numeroAcertosMRU;
    private Object numeroAcertosOtimo;

  public ResultadoTeste(){}

 /* public ResultadoTeste(int numeroFrames, int numeroAcertosFIFO, int numeroAcertosSegundaChance, int numeroAcertosNUR, int numeroAcertosMRU, int numeroAcertosOtimo) {
    this.numeroFrames = numeroFrames;
    this.numeroAcertosFIFO = numeroAcertosFIFO;
    this.numeroAcertosSegundaChance = numeroAcertosSegundaChance;
    this.numeroAcertosNUR = numeroAcertosNUR;
    this.numeroAcertosMRU = numeroAcertosMRU;
    this.numeroAcertosOtimo = numeroAcertosOtimo;
  } */
  
  public ResultadoTeste(int numeroFrames, Object numeroAcertosFIFO, Object numeroAcertosSegundaChance, Object numeroAcertosNUR, Object numeroAcertosMRU, Object numeroAcertosOtimo) {
	    this.numeroFrames = numeroFrames;
	    this.numeroAcertosFIFO = numeroAcertosFIFO;
	    this.numeroAcertosSegundaChance = numeroAcertosSegundaChance;
	    this.numeroAcertosNUR = numeroAcertosNUR;
	    this.numeroAcertosMRU = numeroAcertosMRU;
	    this.numeroAcertosOtimo = numeroAcertosOtimo;
	  }
  
  
  
  public Object getNumeroFrames() {
    return numeroFrames;
  }

  public void setNumeroFrames(Object numeroFrames) {
    this.numeroFrames = numeroFrames;
  }

/*  public int getNumeroAcertosFIFO() {
	    return numeroAcertosFIFO;
	  }*/
  public int getNumeroAcertosFIFO() {
	    return numeroAcertosFIFO;
	  }
 /* public void setNumeroAcertosFIFO(int numeroAcertosFIFO) {
    this.numeroAcertosFIFO = numeroAcertosFIFO;
  }*/
  public void setNumeroAcertosFIFO(int numeroAcertosFIFO) {
	    this.numeroAcertosFIFO = numeroAcertosFIFO;}

  public int getNumeroAcertosSegundaChance() {
    return numeroAcertosSegundaChance;
  }

  public void setNumeroAcertosSegundaChance(int numeroAcertosSegundaChance) {
    this.numeroAcertosSegundaChance = numeroAcertosSegundaChance;
  }

  public int getNumeroAcertosNUR() {
    return numeroAcertosNUR;
  }

  public void setNumeroAcertosNUR(int numeroAcertosNUR) {
    this.numeroAcertosNUR = numeroAcertosNUR;
  }

  public int getNumeroAcertosMRU() {
    return numeroAcertosMRU;
  }

  public void setNumeroAcertosMRU(int numeroAcertosMRU) {
    this.numeroAcertosMRU = numeroAcertosMRU;
  }

  public int getNumeroAcertosOtimo() {
    return numeroAcertosOtimo;
  }

  public void setNumeroAcertosOtimo(int numeroAcertosOtimo) {
    this.numeroAcertosOtimo = numeroAcertosOtimo;
  }

  public Object get(int columnIndex) {
    switch(columnIndex){
      case 0: return numeroFrames;
      case 1: return numeroAcertosFIFO;
      case 2: return numeroAcertosSegundaChance;
      case 3: return numeroAcertosNUR;
      case 4: return numeroAcertosMRU;
      case 5: return numeroAcertosOtimo;
      default: return "Vixe!";
    }
  }  
}
