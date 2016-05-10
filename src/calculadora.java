
public class calculadora {
	
	private int valor;
	
	
	public void somar(int valorum, int valordois){
		
		this.valor = this.valor + (valorum + valordois);
	}
		
		/*this.valorum = valorum;
		this.valordois = valordois;
		this.total +=//this.total+// this.valorum + this.valordois; //O THIS É DESTA CLASSE. (O VALOR 1 DESTA CLASSE) DO ESCOPO DESTA CLASSE.
		
	}*/
	
	public void subtrair(){
	}
	public void dividir(){
	}
	public void multiplicar(int valorum, int valordois){
		this.valor = this.valor + (valorum * valordois);
	}
	
	public int getValor(){
	 return valor;
	}
}
