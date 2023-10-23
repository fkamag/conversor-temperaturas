import java.util.Scanner;

public class ConversorDeTemperaturas {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a temperatura: ");
    double temperatura = scanner.nextDouble();
    double resultado;

    System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F]");
    String unidadeOrigem = scanner.next();
    if (!unidadeOrigem.equals("C") && !unidadeOrigem.equals("K") && !unidadeOrigem.equals("F")) {
      System.out.println("Entrada especificada é inválida");
    } else {
      System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F]");
      String unidadeDestino = scanner.next();
      if (!unidadeDestino.equals("C") && !unidadeDestino.equals("K") && !unidadeDestino.equals("F")) {
        System.out.println("Entrada especificada é inválida");
      } else {
        if (unidadeOrigem.equals("C")) {
          if (unidadeDestino.equals("K")) {
            resultado = 273.15 + temperatura;
          } else {
            resultado = (temperatura * 9 / 5) + 32;
          }
        } else if (unidadeOrigem.equals("K")) {
          if (unidadeDestino.equals("C")) {
            resultado = temperatura - 273.15;
          } else {
            resultado = (temperatura - 273.15) * 9/5 + 32;
          }
        } else {
          if (unidadeDestino.equals("C")) {
            resultado = (temperatura - 32) * 5 / 9;
          } else {
            resultado = (temperatura - 32) * 5/9 + 273.15;
          }
        }
        System.out.printf("%.2f %s = %.2f %s", temperatura, unidadeOrigem, resultado, unidadeDestino);
      }

    }

  }

}
