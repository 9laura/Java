public class Lista1 {
  public static void main(String args[]) {
      // 1 - Cálculo para empresa 
      int inst = 300;
      int limp = 150;
      double manu = 499.99;
      double total = inst + limp + manu;
      System.out.println ("A pagar " + total);
      
      // 2 - Cálculo de salário
      int reaisPorHora = 35;
      int horasTrabalhadas = 8;
      int totalDia = reaisPorHora * horasTrabalhadas;
      System.out.println ("Ao final do dia ele recebera " + totalDia);
      
      // 3 - Caixas de bombons
      int unidades = 27;
      int caixas = 16;
      int totalBombom = unidades * caixas;
      System.out.println ("Quantos bombons Pamela tem? Ela tem " + totalBombom);
      
      // 4 - Garrafas de água
 
      int garrafasPorCx = 20;
      int garrafasVendidas = 300;
      int caixasVendidas = garrafasVendidas / garrafasPorCx;
      System.out.println ("A pagar " + caixasVendidas);
      
      // 5 - Cálculo para camisetas
      int comprou1 = 120;
      int vendeu = 80;
      int preco = 30;
      int comprou2 = 50;
      
      int totalCamisas1 = comprou1 - vendeu;
      int faturamento = vendeu * preco;
      int totalCamisas2 = totalCamisas1 + comprou2;
      
      System.out.println ("Quantidade de camisas: " + totalCamisas2 );
      System.out.println ("Faturamento: " + faturamento );
      
      //  Dobro e Metade
      
      int numero = 4;
      int dobro = numero + numero;
      int metade = numero / 2;
      
      System.out.println ("Numero: " + numero );
      System.out.println ("Dobro: " + dobro );
      System.out.println ("Metade: " + metade );
  }
}