import java.util.LinkedList;

public abstract class SecondChance extends AlgoritmodeSubstituicao{
	LinkedList<Integer> bits;
	private static int ponteiro=0;
		public SecondChance(int numquadros){
			super(numquadros);
			this.quadros=new LinkedList();
			this.bits=new LinkedList();
		}
	@Override
	public void inserir(String pagenum){
		int tmp = quadros.indexOf(pagenum);
		//caso a pagina ainda nao esteja na memoria
		if(tmp==-1){
			if(quadros.size()<numquadros){
				quadros.add(pagenum);
				bits.add(0);
			}else{
				while(bits.get(ponteiro)== 1){
					bits.set(ponteiro, 0);
					ponteiro++;
					// ponteiro voltando ao inicio
					if(ponteiro==numquadros){
						ponteiro=0;
					}
				}
				//substituição
				quadros.remove(ponteiro);
				bits.remove(ponteiro);
				quadros.add(ponteiro, pagenum);
				bits.add(ponteiro, 0);
				ponteiro++;
				if(ponteiro ==numquadros){
					ponteiro=0;
				}
			}
			numfalhas++;
		}else{
			bits.set(tmp, 1);
		}
	}
	@Override
	public void imprimirQuadro(){
		System.out.print("Quadros:");
		for(int i=0;i<quadros.size();i++){
			System.out.print(quadros.get(i)+ "bit:" +bits.get(i)+"");
	}
	System.out.println();
		
	}
}
