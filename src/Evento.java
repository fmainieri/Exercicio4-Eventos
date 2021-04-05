import java.util.Scanner;
public class Evento {

	public static void main(String[] args) {

		
		
	
		int qtdEventos = 1;
		int eventoAdd = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=====================================================================================");
		System.out.print("Informe a quantidade de Eventos que deseja cadastrar: ");
		qtdEventos = sc.nextInt();
		System.out.println("=====================================================================================");

		String[] nomeEvento = new String[qtdEventos];
		String[] responsavel = new String[qtdEventos];
		String[] dataInicio = new String[qtdEventos];
		String[] dataFim =  new String[qtdEventos];
		int[] chEvento =  new int[qtdEventos];
		double[] vlhoraResponsavel =  new double[qtdEventos];
		int[] qtdPalestrantes =  new int[qtdEventos];
		double[] totalGastosPalestra = new double [qtdEventos];
		
		while (eventoAdd <= qtdEventos) {
			
			Scanner ev = new Scanner(System.in);

			System.out.println("Informações sobre o evento numero: " + eventoAdd);
			System.out.print("Informe o nome Evento: ");
			nomeEvento[eventoAdd-1] = ev.nextLine();
					
			System.out.print("Informe o responsavel do evento: ");
			responsavel[eventoAdd-1] = ev.nextLine();
			
			System.out.print("Informe a Data de Inicio do evento: ");
			dataInicio[eventoAdd-1] = ev.nextLine();
			
			System.out.print("Informe a Data Final do evento: ");
			dataFim[eventoAdd-1]= ev.nextLine();
			
			System.out.print("Informe a Carga Horaria do evento: ");
			chEvento[eventoAdd-1] = ev.nextInt();
			
			System.out.print("Informe a Valor Hora do Responsavel: ");
			vlhoraResponsavel[eventoAdd-1] = ev.nextDouble();
			
			System.out.print("Informe a quantidade de Palestrantes: ");
			qtdPalestrantes[eventoAdd-1] = ev.nextInt();
			
			// variaveis usadas no palestante
			String[] titulo = new String[qtdPalestrantes[eventoAdd-1]];
			String[] palestrante = new String[qtdPalestrantes[eventoAdd-1]];
			String[] descricao = new String[qtdPalestrantes[eventoAdd-1]];
			int ch[] = new int[qtdPalestrantes[eventoAdd-1]];
			String[] horaInicio = new String[qtdPalestrantes[eventoAdd-1]];
			int vlhoraPalestrante[] = new int[qtdPalestrantes[eventoAdd-1]];
			int palestranteAdd = 1;
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			while (palestranteAdd <= qtdPalestrantes[eventoAdd-1]) {
				
				Scanner pal = new Scanner(System.in);
				
				System.out.print("Informe o Titulo da Palestra: ");
				titulo[palestranteAdd-1] = pal.nextLine();
				
				System.out.print("Informe o nome do Palestrante: ");
				palestrante[palestranteAdd-1] = pal.nextLine();
				
				System.out.print("Informe a descrição da Palestra: ");
				descricao[palestranteAdd-1] = pal.nextLine();
							
				System.out.print("Informe a Hora de Inicio da Palestra: ");
				horaInicio[palestranteAdd-1] = pal.nextLine();
				
				System.out.print("Informe a Carga Horaria da Palestra: ");
				ch[palestranteAdd-1] = pal.nextInt();
				
				System.out.print("Informe a Valor hora do Palestrante: ");
				vlhoraPalestrante[palestranteAdd-1] = pal.nextInt();

				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				
				totalGastosPalestra[eventoAdd-1] = totalGastosPalestra[eventoAdd-1] + (ch[palestranteAdd-1] * vlhoraPalestrante[palestranteAdd-1]);
				
				palestranteAdd = palestranteAdd + 1;
			}
				
			eventoAdd = eventoAdd + 1;
			
		}
	
	// Apresentar as informações no final
	eventoAdd = 1;
	while (eventoAdd <= qtdEventos) {
		System.out.println("******************************************************************************************************");
		System.out.println("Info Informações sobre o Evento numero: " + eventoAdd );
		System.out.println("Valor Gasto com responsavel: " + chEvento[eventoAdd-1] * vlhoraResponsavel[eventoAdd-1]);
		System.out.println("Valor Total gasto com Palestras: " + totalGastosPalestra[eventoAdd-1]);
		
		eventoAdd = eventoAdd+1;	
	}
	
	}
		
}
