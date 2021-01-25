/**
 * @author lucas marques
 * */

public class GeraCPFTestDrive {
	public static void main(String[] args){
//		GeraCPF g = new GeraCPF();
//	
//		System.out.println(g.geraCPFFinal());
		
		GeraCpfCnpj gerador = new GeraCpfCnpj();
		String cpf = gerador.cpf(true);
		System.out.printf("CPF: %s, Valido: %s\n", cpf, gerador.isCPF(cpf));
		
	}
}
