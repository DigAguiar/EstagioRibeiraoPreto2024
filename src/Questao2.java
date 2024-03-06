public class Questao2 {
    public static void main(String[] args) {
        System.out.println(verificarFibo(89));
        System.out.println(verificarFibo(53));

    }
    public static boolean verificarFibo (int valor) {
        int a = 0;
        int b = 1;
        boolean resp = false;

        do {
            int sum = a+b;
            a = b;
            b = sum;

            if (sum == valor){resp = true;}
        }while (valor > a);

        return resp;

    }

}
