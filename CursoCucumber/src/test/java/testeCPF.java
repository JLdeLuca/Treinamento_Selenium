import java.util.Date;

import br.com.luca.Utils.DateUtils;
import br.com.luca.Utils.GeraCpf;

public class testeCPF {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		GeraCpf cpfn = new GeraCpf();
		String valor = cpfn.geraCPF();
		System.out.println(valor);
		
		
		Date dateCompra = DateUtils.obterDataDiferencaDias(2);
		System.out.println(dateCompra);
		
		
		
	}

}
