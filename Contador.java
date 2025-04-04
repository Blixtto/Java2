package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = scanner.nextInt(); // Lê o primeiro número inteiro
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = scanner.nextInt(); // Lê o segundo número inteiro

            scanner.close(); // Fecha o scanner após a leitura
    
            try {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                // Imprime a mensagem caso a exceção seja lançada
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            // Validar se o primeiro parâmetro é maior que o segundo
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
    
            // Calcula a quantidade de interações
            int contagem = parametroDois - parametroUm;
    
            // Realiza o loop for para imprimir os números
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

        public static class ParametrosInvalidosException extends Exception {
            public ParametrosInvalidosException(String mensagem) {
                super(mensagem);
            }
        }
        
    }
    