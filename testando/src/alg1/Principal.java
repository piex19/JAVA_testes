package alg1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * System.out.println(example.substring(example.lastIndexOf("/") + 1));
 */
		
		String p1 = JOptionPane.showInputDialog("Escreva o nome de um arquivo");
		
		JOptionPane.showMessageDialog(null, p1.substring(p1.lastIndexOf(".") + 1 ));
		
		
		
		
	}

}
