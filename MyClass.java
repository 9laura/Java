public class MyClass {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println("Olá mundo");
    
    //Variaveis
    int idade = 24; //números inteiros
    double salario = 1.75; //números quebrados
    char letra = 'J'; //letra ou simbolo
    boolean estudante = true; // true or false
    String nome = "Juliana"; //texto
    
    System.out.println ("Minha idade é: " + idade);
    System.out.println ("O salário é: " + salario);
    System.out.println ("A letra é: " + letra);
    System.out.println ("Você é estudante? " + estudante);
    System.out.println ("Meu nome é: " + nome);
    
    // Operadores Aritmeticos
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println ("Soma " + soma);
    System.out.println ("Subtração " + sub);
    System.out.println ("Multiplicação " + mult);
    System.out.println ("Divisão " + div);
    
    // Calculo da área de um Retângulo
    // Largura * Comprimento
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println ("Área: " + area);
    
    // Calculo do desconto
    double valor = 100;
    double desconto = 15; //15%
    double valorDesc = valor * (desconto / 100);
    double valorFinal = valor - valorDesc;
    System.out.println ("A pagar " + valorFinal);
  }
}