package edu.ifce.sistops.model;

public class Page {

	private int id;
    private char op;
    private byte M;
    private byte R;
    private byte classe;
    public Page(int p, char op) {
        this.id = p;
        this.op = op;
        this.M = 0;
        this.R = 1;
        this.classe = 2;
    }
    public Page(Page p) {
        this.id = p.getId();
        this.op = p.getOperacao();
        this.M = p.getM();
        this.R = p.getR();
        this.classe = p.getClasse();
    }
   public int getId(){
	   return this.id;
   }
   public char getOperacao(){
	   return this.op;
   }
   public byte getM(){
	   return this.M;
   }
   public byte getR(){
	   return this.R;
   }
   public byte getClasse() {
       return this.classe;
   }
   public void setM() {
       this.M = 1;
       this.classe = (byte) ((this.classe | 0x01) & 0xFF);
   }
   
   public void clearM() {
       this.M = 0;
       this.classe = (byte) ((this.classe & 0x02) & 0xFF);
   }
   public boolean equals(Page other) {
       if (this.getId() == other.getId())
           return true;
       return false;
   }
   
   }
