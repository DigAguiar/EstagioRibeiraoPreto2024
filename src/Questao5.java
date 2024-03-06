public class Questao5 {
    public static void main(String[] args) {

        System.out.println(inverterPalavra("ola"));
        System.out.println(inverterPalavra("alo"));

        System.out.println("Teste");
    }

    public static String inverterPalavra (String palavra) {
        int numeroLetras = palavra.length();

        String msg = "";

        char[] letras = new char[numeroLetras];

        for (int i = 0; i < numeroLetras;i++){
            letras[i] = palavra.charAt(i);
        }
        for (int j = numeroLetras-1; j >= 0;j--){
            char t = letras[j];
            msg = msg + t;

        }
        return msg;



    }


}
