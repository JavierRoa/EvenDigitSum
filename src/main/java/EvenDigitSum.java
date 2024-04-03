public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    private static int getEvenDigitSum(int number) {
        if(number<0) { // Validación número positivo.
            return -1;
        }
        int evenDigitSum = 0;  // Creo variable evenDigitSum para sumar los números pares.
        while(number > 0) {  // Uso bucle while, el cual en cada iteración:
            int digit = number % 10;  // Crea (o reasigna) variable digit, con el mod 10 de number.
            number /= 10;  // Divide number / 10, para remover el último dígito.
            if(digit%2==0) {  // Si digit es par, lo suma a la variable evenDigitSum.
                evenDigitSum+=digit;
            }
        }
        return evenDigitSum;  // Retorna la suma de números pares
    }
}
