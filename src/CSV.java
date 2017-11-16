import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class CSV {

	public static void palestrante() {
		System.out.println("=====================================");
		Scanner spk;
		try {
			spk = new Scanner(new File("C:/Users/Guilherme/Desktop/labtrab/participantes.csv"));
			spk.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo CSV. Tente novamente ou desista pra sempre.");
			return;
		}
		
		while (spk.hasNext()) {
			Controle.palestrante = new Speakers(spk.next(), spk.next());
			System.out.print("Nome: "+Controle.palestrante.getNome()+" \n- Email: "+Controle.palestrante.getAssunto());
		}
		
		
	}

	public static void organizador() {
		System.out.println("=====================================");
		Scanner event;
		try {
			event = new Scanner(new File("C:/Users/Guilherme/Desktop/labtrab/participantes.csv"));
			event.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo CSV. Tente novamente ou desista pra sempre.");
			return;
		}
		
		while (event.hasNext()) {
			Controle.organizador = new Managers(event.next(), event.next());
			System.out.print("Nome: "+Controle.organizador.getNome()+" \n- Email: "+Controle.organizador.getEmail()+"\n");
		}
		
	}

	public static void palestra() {
		System.out.println("=====================================");
		Scanner lec;
		try {
			lec = new Scanner(new File("C:/Users/Guilherme/Desktop/labtrab/participantes.csv"));
			lec.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo CSV. Tente novamente ou desista pra sempre.");
			return;
		}
		
		while (lec.hasNext()) {
			Controle.palestra = new Lectures(lec.next(),lec.next(),lec.next(), lec.next());
			System.out.print("Título: "+Controle.palestra.getTitle()+"\nResumo : "+Controle.palestra.getSummary()+"\nPalestrante: "+Controle.palestra.getSpeaker()+" - Sala: "+Controle.palestra.getRoom());
			if (lec.hasNext()) {
				System.out.println("...");
			} else {
				System.out.println("666 lúcifer é demais");
			}
		}
		
		
	}
	
	public static void sala() {
		System.out.println("=====================================");
		Scanner sal;
		try {
			sal = new Scanner(new File("C:/Users/Guilherme/Desktop/labtrab/participantes.csv"));
			sal.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo CSV. Tente novamente ou desista pra sempre.");
			return;
		}
		
		while (sal.hasNext()) {
			Controle.sala = new Rooms(sal.next());
			System.out.print("Sala: "+Controle.sala.getNumero());
		}
		System.out.println("");
		
	}

	public static void convidado() {
		System.out.println("=====================================");
		Scanner conv;
		try {
			conv = new Scanner(new File("C:/Users/Guilherme/Desktop/labtrab/participantes.csv"));
			conv.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo CSV. Tente novamente ou desista pra sempre.");
			return;
		}
		
		while (conv.hasNext()) {
			Controle.convidado = new Convidados(conv.next(),conv.next(), conv.next());
			System.out.print("Nome: "+Controle.convidado.getNome()+" - Email: "+Controle.convidado.getEmail()+" Currúculo: "+Controle.convidado.getCurriculum());
		}
		
		
	}
}