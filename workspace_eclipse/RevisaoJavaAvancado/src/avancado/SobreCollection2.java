package avancado;
import java.util.*;
public class SobreCollection2 {
	public static void main(String[] args) {
		//1
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		
		engenhariasAtuais.add("Telecomunicacao");
		engenhariasAtuais.add("Biomedica");
		engenhariasAtuais.add("Computacao");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Producao");
		
		System.out.println("Engenharias Atuais: " + engenhariasAtuais);
		
		//2
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		engenhariasFuturas.add("Mecanica");
		engenhariasFuturas.add("Mecatronica");
		
		System.out.println("Engenharias futuras: " + engenhariasFuturas);
		
		//3
		Collection<String> todas = new ArrayList<String>();
		todas.addAll(engenhariasFuturas);
		todas.addAll(engenhariasAtuais);
		
		System.out.println("Todas as Engenharias: " + todas);
		
	}
}
