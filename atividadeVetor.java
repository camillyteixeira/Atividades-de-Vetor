import java.util.Scanner;

public class atividadeVetor {
    public static void main(String[] args) {
        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();
        Algoritmo13();
        Algoritmo14();
        Algoritmo15();
        Algoritmo16();
        Algoritmo17();
        Algoritmo18();
        Algoritmo19();
        Algoritmo20();
    }
    private static void Algoritmo1() {
        System.out.println("Algoritmo 1");
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro:");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int numerosprimos = 0;
            if (numero > 1) {
                for (int numeral = 1; numeral <= numero; numeral++) {
                    if ((numero / numeral) * numeral == numero) {
                        numerosprimos++;
                    }
                }
                if (numerosprimos == 2) {
                    System.out.println("Número Primo: " + numero + " Posição no vetor: " + i);
                }
            }
        }
    }
    private static void Algoritmo2() {
        System.out.println("Algoritmo 2");
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];
        System.out.println("Digite os 10 números do vetor a");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor a " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite os 10 números do vetor b");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Vetor b " + i + ": ");
            vetorB[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[2 * i] = vetorA[i];
            vetorC[2 * i + 1] = vetorB[i];
        }
        System.out.println("Vetor intercalado vetor c");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Valor " + i + ": " + vetorC[i]);
        }
    }
    private static void Algoritmo3() {
        System.out.println("Algoritmo 3");
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            //Fiz o uso do math radom por ser números aleatórios
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Posição " + i + ": " + numeros[i]);
            soma = soma + numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println("A média de números aleatórios é: " + media);
    }
    private static void Algoritmo4() {
        System.out.println("Algoritmo 4");
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            //Fiz o uso do math radom por ser números aleatórios
            numeros[i] = (int) (Math.random() * 30) + 1;
            System.out.println("Posição " + i + ": " + numeros[i]);
            if (numeros[i] == 25) {
                System.out.println("O número 25 foi encontrado");
            }
        }
    }
    private static void Algoritmo5() {
        System.out.println("Algoritmo 5");
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            //Fiz o uso do math radom por ser números aleatórios
            numeros[i] = (int) (Math.random() * 50) + 1;
            System.out.println("Posição " + i + ": " + numeros[i]);
            if (numeros[i] == 20) {
                System.out.println("Tem 20 nos números aleatórios (na posição " + i + ")");
                break;
            }
        }
    }
    private static void Algoritmo6() {
        System.out.println("Algoritmo 6");
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];
        for (int i = 0; i < numeros.length; i++) {
            //Fiz o uso do math radom por ser números aleatórios
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        System.out.println("Digite o valor:");
        int valor = scanner.nextInt();
        boolean removido = true;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                numeros[i] = 0;
                System.out.println("Se o valor existe " + valor + " foi removido da posição " + i);
            }
            if (removido) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
    private static void Algoritmo7() {
        System.out.println("Algoritmo 7");
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número decimal: ");
            numeros[i] = scanner.nextDouble();
        }
        double maior = numeros[0];
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
    private static void Algoritmo8() {
        System.out.println("Algoritmo 8");
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[14 - i];
        }
        System.out.println("O vetor a: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("O vetor b: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
    private static void Algoritmo9() {
        System.out.println("Algoritmo 9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de recibos que deseja imprimir: ");
        int quantidade = scanner.nextInt();
        int[] recibos = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            recibos[i] = i + 1;
        }
        int i = 0;
        while (i < quantidade) {
            System.out.println("O recibo do número: " + recibos[i]);
            i++;
        }
    }
    private static void Algoritmo10() {
        System.out.println("Algoritmo 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para a tabuada desejada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + " ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    private static void Algoritmo11() {
        System.out.println("Algoritmo 11");
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[10];
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a " + (i + 1) + " temperatura: ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;
        System.out.println("A temperatura média das regiões é: " + media);
    }
    private static void Algoritmo12() {
        System.out.println("Algoritmo 12");
        int[] pares = new int[25];
        int posicao = 0;
        for (int i = 2; i <= 50; i += 2) {
            pares[posicao] = i;
            posicao++;
        }
        System.out.println("Produtos com quantidade par (1 a 50):");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
    }
    private static void Algoritmo13() {
        System.out.println("Algoritmo 13");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número inteiro N: ");
        int numero = scanner.nextInt();
        int[] numeros = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            int valorAtual = numeros[i];
            int numerosprimos = 0;
            if (valorAtual > 1) {
                for (int numeral = 1; numeral <= valorAtual; numeral++) {
                    if ((valorAtual / numeral) * numeral == valorAtual) {
                        numerosprimos++;
                    }
                }
                if (numerosprimos == 2) {
                    System.out.println("Número Primo: " + valorAtual);
                }
            }
        }
    }
    private static void Algoritmo14() {
        System.out.println("Algoritmo 14");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de etapas: ");
        int numeroEtapas = scanner.nextInt();
        if (numeroEtapas <= 0) {
            System.out.println("Erro no número de etapas");
        }
        int[] numeros = new int[numeroEtapas];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o tempo da etapa " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int tempoTotal = 0;
        System.out.println("Resumo das Etapas");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Etapa:" + (i + 1) + (" Tempo:") + numeros[i]);
            tempoTotal = tempoTotal + numeros[i];
        }
        System.out.println("Tempo total de produção: " + tempoTotal);
    }
    private static void Algoritmo15() {
        System.out.println("Algoritmo 15");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero positivo N: ");
        int numeroN = scanner.nextInt();
        int[] numeros = new int[numeroN];
        numeros[0] = 0;
        if (numeroN > 1) {
            numeros[1] = 1;
        }
        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] + numeros[i - 2];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + " prazos estimados da sequência de Fibonacci: " + numeros[i]);
        }
    }
    private static void Algoritmo16() {
        System.out.println("Algoritmo 16");
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[5];
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("Digite a respostado entrevistado " + (i + 1) + ": ");
            respostas[i] = scanner.nextInt();
        }
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println("Respostas na ordem inversa:" + (respostas[i]));
        }
    }
    private static void Algoritmo17() {
        System.out.println("Algoritmo 17");
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[10];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            soma = soma + notas[i];
        }
        double media = soma / notas.length;
        System.out.println("A média das notas dos 10 alunos é: " + media);
    }
    private static void Algoritmo18() {
        System.out.println("Algoritmo 18");
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[8];
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }
        int maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }
        System.out.println("A maior temperatura registrada foi: " + maior);
    }
    private static void Algoritmo19() {
        System.out.println("Algoritmo 19");
        Scanner scanner = new Scanner(System.in);
        //São exemplos de códigos para o estoque
        int[] estoque = {1, 2, 3, 4, 5};
        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        int i;
        for (i = 0; i < estoque.length; i++) {
            if (estoque[i] == codigo) {
                break;
            }
        }
        if (i < estoque.length) {
            System.out.println("O produto com código " + codigo + " está no estoque");
        } else {
            System.out.println("O produto com código " + codigo + " não está no estoque");
        }
    }
    private static void Algoritmo20() {
        System.out.println("Algoritmo 20");
        Scanner scanner = new Scanner(System.in);
        double[] preco = new double[10];
        for (int i = 0; i < preco.length; i++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            preco[i] = scanner.nextDouble();
        }
        for (int i = 0; i < preco.length; i++) {
            for (int j = i + 1; j < preco.length; j++) {
                if (preco[i] > preco[j]) {
                    double auxiliar = preco[i];
                    preco[i] = preco[j];
                    preco[j] = auxiliar;
                }
            }
        }
        System.out.println("Preços em ordem crescente");
        for (int i = 0; i < preco.length; i++) {
            System.out.println("  " + preco[i]);
        }
    }
}
