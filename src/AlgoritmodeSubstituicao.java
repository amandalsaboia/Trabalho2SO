import java.util.LinkedList;

public abstract class AlgoritmodeSubstituicao {
protected int numfalhas;//num de falhas da página física
protected int numquadros;//num de frames da página física
LinkedList quadros;

public AlgoritmodeSubstituicao(int numerodeframes){
	if(numerodeframes <0)
	{
		throw new IllegalArgumentException();
	}
	this.numquadros=numquadros;
	numfalhas=0;
}
public int getPageFaultcont(){
	return numfalhas;
}
public abstract void inserir(String pageNumber);
public void imprimirQuadro(){
	System.out.print("Quadros");
	for(int i=0;i<quadros.size();i++){
		System.out.print(quadros.get(i)+ "");
	}
	System.out.println();
}

}

