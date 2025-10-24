package primeiroProjeto;

public class Lista21 {

    // 1 - Somar dois números
    static int somar(int a, int b) {
        return a + b;
    }

    // 2 - Subtrair dois números
    static int subtrair(int a, int b) {
        return a - b;
    }

    // 3 - Multiplicar dois números
    static int multiplicar(int a, int b) {
        return a * b;
    }

    // 4 - Dividir dois números (verificando divisão por zero)
    static String dividir(double a, double b) {
        if (b == 0) {
            return "Não é possível dividir por 0";
        } else {
            return "Resultado: " + (a / b);
        }
    }

    // 5 - Calcular média de duas notas
    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // 6 - Verificar aprovação com base na média
    static String verificarAprovacao(double nota1, double nota2) {
        double media = calcularMedia(nota1, nota2);
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7 - Retornar o maior número
    static String maiorNumero(int a, int b) {
        if (a > b) {
            return "O maior número é: " + a;
        } else if (b > a) {
            return "O maior número é: " + b;
        } else {
            return "Eles são iguais";
        }
    }

    // 8 - Converter Celsius para Fahrenheit
    static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 9 - Calcular área do retângulo
    static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // 10 - Gerar mensagem com nome
    static String gerarMensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11 - Juntar dois nomes
    static String juntarNomes(String nome1, String nome2) {
        return nome1 + " " + nome2;
    }

    // 12 - Avaliar idade
    static String avaliarIdade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }

    // Método principal para testar as funções
    public static void main(String[] args) {

        System.out.println("1 - Soma: " + somar(10, 5));
        System.out.println("2 - Subtração: " + subtrair(10, 5));
        System.out.println("3 - Multiplicação: " + multiplicar(10, 5));
        System.out.println("4 - Divisão: " + dividir(10, 0));
        System.out.println("5 - Média: " + calcularMedia(8, 6));
        System.out.println("6 - Aprovação: " + verificarAprovacao(8, 5));
        System.out.println("7 - Maior número: " + maiorNumero(10, 10));
        System.out.println("8 - Celsius → Fahrenheit: " + converterCelsiusParaFahrenheit(25));
        System.out.println("9 - Área do retângulo: " + calcularAreaRetangulo(5, 3));
        System.out.println("10 - Mensagem: " + gerarMensagem("Laura"));
        System.out.println("11 - Juntar nomes: " + juntarNomes("Laura", "Silva"));
        System.out.println("12 - Idade: " + avaliarIdade(20));
    }
}

