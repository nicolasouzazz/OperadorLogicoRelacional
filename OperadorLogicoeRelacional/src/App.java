public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores Logicos e Relacionais");
        System.out.println("====================================");

        /*
         * Operador ternario (condicao ? valor_se_verdadeiro : valor_se_falso)
         * (comparação composta 2 valores)
         * int n1, n2, resultado;
         * n1 = 14;
         * n2 = 8;
         * resultado = (n1 > n2) ? 0 : 1; // Se n1 for maior que n2, resultado recebe 0,
         * senao 1
         * System.out.println("Resultado: " + resultado);
         */

        /*
         * Comparação String
         * String nome1 = "Maria";
         * String nome2 = "Maria";
         * String nome3 = new String("Maria");// cria um novo objeto na memoria;
         * String resultado, res;
         * resultado = (nome1 == nome2) ? "Igual" : "Diferente"; // compara o conteudo
         * System.out.println("Nome1 e Nome2 sao: " + resultado);
         * res = (nome1.equals(nome3)) ? "Igual" : "Diferente"; // compara o conteudo
         * System.out.println("Nome1 e Nome3 sao: " + res);
         */
        /*
         * Operadores logicos (AND, OR, NOT)
         * int x = 4, y = 7, z = 12;
         * boolean r1, r2, r3, r4;
         * r1 = (x < y && y < z) ? true : false; // AND (E)
         * System.out.println("Resultado de x<y E y<z: " + r1);
         * r2 = (x > y || y < z) ? true : false; // OR (OU)
         * System.out.println("Resultado de x>y OU y<z: " + r2);
         * r3 = (x > y ^ y < z) ? true : false; // XOR (OU exclusivo)
         * System.out.println("Resultado de x>y OU Exclusivo y<z: " + r3);
         * r4 = !(x > y); // NOT (NAO)
         * System.out.println("Resultado de NAO (x>y): " + r4);
         */

        /*EX1) 
        int x = 8, y = 3, w = x / y;
        String z = (w % 2 == 0) ? "frase1" : "frase2"; // Se w for par, z recebe "frase1", senao "frase2"
        System.out.println("Valor de z: " + z);
        */

        /*EX2) 
        String p1="Curso";
        String p2="Video";
        String p3=p1+p2;
        String p4="CursoVideo";
        System.out.println(p3==p4); // compara referencias (enderecos de memoria)
        System.out.println(p3.equals(p4)); // compara conteudos
        */

        /*EX3)*/
        boolean v1=(4>=5), v2=(4<4), v3=(v1==v2);//v1=false, v2=false, v3=true
        boolean v4=v1^v3;//v4=true
        boolean v5=!v2 && v4;//v5=true
        System.out.println(v4 + " " + v5);//saida: true true
    }
}
