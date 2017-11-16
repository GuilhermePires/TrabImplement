import java.util.Scanner;

public class Start {
	public static void menu() {
	do{
		System.out.println("===============================");
		System.out.println("Menu");
		System.out.println("===============================");
		System.out.println("1 - Speakers");
		System.out.println("2 - Managers");
		System.out.println("3 - Lectures");
		System.out.println("4 - Rooms");
		System.out.println("5 - Convidados");
		char op = 0;
		op = new Scanner(System.in).next().charAt(0);
		switch (op){
		
		case '1' : 
			CSV.palestrante();
		break;
		case '2' : 
			CSV.organizador();
		break;
		case '3' : 
			CSV.palestra();
		break;
		case '4' : 
			CSV.sala();
		break;
		case '5' : 
			CSV.convidado();
		break;
		default:
			System.out.println("Comando inválido. Lúcifer o punirá se cometer esse erro de novo");
		}
		
	}  while (true);
}
}