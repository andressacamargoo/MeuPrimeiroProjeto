import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String [] args){
		//Instanciando um objeto
		
		calculadora Calculadora = new calculadora (); //cria um objeto baseado na classe calculadora 
		
//		Calculadora.somar(10,50);
//		Calculadora.somar(20,10);
		
		int primeiroValor = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o Primeiro Valor"));
		int segundoValor = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o Primeiro Valor"));
		
		Calculadora.multiplicar(primeiroValor, segundoValor);
		
		
		JOptionPane.showMessageDialog(null, Calculadora.getValor());
				
		
	}

}
