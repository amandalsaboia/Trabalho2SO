
public abstract class AlgoritmodeSubstituicao {
protected int numerodefalhas;//num de falhas da p�gina f�sica
protected int numerodeframes;//num de frames da p�gina f�sica

public AlgoritmodeSubstituicao(int numerodeframes){
	if(numerodeframes <0)
	{
		throw new IllegalArgumentException();
	}
	this.numerodeframes=numerodeframes;
	numerodefalhas=0;
}
public int getNumeroDeFalhas(){
	return numerodefalhas;
}
public abstract void insert(int pageNumber);

}
