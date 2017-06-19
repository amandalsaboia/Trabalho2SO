
public abstract class AlgoritmodeSubstituicao {
protected int numerodefalhas;//num de falhas da página física
protected int numerodeframes;//num de frames da página física

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
