package projeto_aspectos_ageis;

public class projeto_aspectos_ageis {
	
	public static void main(String[] args) {
		
		int valor = 618;
		
		String[][] frutas = new String[10][10];
		frutas[0][0] = "manga"; 	frutas[0][1] = "1";
		frutas[1][0] = "maca"; 		frutas[1][1] = "2";
		frutas[2][0] = "limao"; 	frutas[2][1] = "4";
		frutas[3][0] = "laranja"; 	frutas[3][1] = "8";
		frutas[4][0] = "uva"; 		frutas[4][1] = "16";
		frutas[5][0] = "morango"; 	frutas[5][1] = "32";
		frutas[6][0] = "abacate"; 	frutas[6][1] = "64";
		frutas[7][0] = "pitaia"; 	frutas[7][1] = "128";
		
		for(;;) {
			
			while(valor > 256) {
				valor = valor - 256;
			}
			
			if(valor==256) {
				System.out.println("[]");
				break;
			}
			
			if(valor != 0) {
				
				for(int i=0; i<8; i++) {
					
					if(valor == Integer.parseInt(frutas[i][1])) {
						System.out.println(frutas[i][0]);
						valor = 0;
						break;
					}else if(valor < Integer.parseInt(frutas[i][1])) {
						System.out.println(frutas[i-1][0]);
						valor = valor - Integer.parseInt(frutas[i-1][1]);
						break;
					}
					
					if(i==7) {
						System.out.println(frutas[i][0]);
						valor = valor - Integer.parseInt(frutas[i][1]);
					}
				}
				
			}else{
				break;
			}
		}	
	}
}
