package AulaTP;

public class Matriz {
	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 10;
		matriz[0][2] = 20;
		
		matriz[1][0] = 2;
		matriz[1][1] = 20;
		matriz[1][2] = 40;
		
		matriz[2][0] = 3;
		matriz[2][1] = 52;
		matriz[2][2] = 74;
		
		for(int i = 0; i <= 2; i++) {
			for(int x =0; x <= 2; x++) {
				System.out.println(matriz[i][x] + "");
			}
	  }
		System.out.println("A soma da matriz em diagonal é = " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		System.out.println("A multiplicação da matriz no exercicio 4 é=" +matriz[0][2] * matriz[1][1] * matriz[2][0]);
		System.out.println("A divisão da matriz no exercicio é = " +(matriz[2][1] / matriz[1][1]));
}
}