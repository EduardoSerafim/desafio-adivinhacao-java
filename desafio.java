import java.util.Scanner;
 class main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, tentativa, acerto;
		tentativa = 1;
		acerto = 0;
		numero = 0;
		
		System.out.println("informe o numero pensado:");
		acerto = ler.nextInt();
		System.out.println("informe o seu palpite:");
		numero = ler.nextInt();
		
		while(numero != acerto) {
			if(numero != acerto) {
				tentativa++;
			}
			
			if(numero < acerto) {
				System.out.println("chute um numero maior");
				System.out.println("informe o seu palpite:");
				numero = ler.nextInt();
			}else {
				if (numero > acerto) {
					System.out.println("chute um numero menor");
					System.out.println("informe o seu palpite:");
					numero = ler.nextInt();
				}
				
				
				
			}
			
		
		}
		if (numero == acerto) {
			System.out.printf("voce acertou em %d tentativas",tentativa);
		}
		
		
		
	}

}
