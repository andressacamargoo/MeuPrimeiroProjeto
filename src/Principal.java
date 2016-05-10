import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String [] args){
		//Instanciando um objeto
		
		calculadora Calculadora = new /*cria um objeto baseado na classe calculadora*/ calculadora ();
		
		Calculadora.somar(10,50);
		Calculadora.somar(20,10);
		
		
		JOptionPane.showMessageDialog(null, 
				"o valor somado é: "+Calculadora.getValor());
				
		
	}

}
