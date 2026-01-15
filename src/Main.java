import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas1 = new Pessoa("Rodrigo", 39);
        Pessoa pessoas2 = new Pessoa("Maria", 40);
        Pessoa pessoas3 = new Pessoa("Alessandra",35);
        Pessoa pessoas4 = new Pessoa("Rodrigo", 39);
        Pessoa pessoas5 = new Pessoa("Alessandra",35);

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoas1);
        pessoas.add(pessoas2);
        pessoas.add(pessoas3);
        pessoas.add(pessoas4);
        pessoas.add(pessoas5);

        int contador = 1;
        for (Pessoa pessoa : pessoas) {
            System.out.println("pessoas" + contador++ + ": " + pessoa);
        }
        System.out.println();

        System.out.println("Os dados pessoas4 e pessoas5 não foram imprimidos por serem duplicatas de instâncias anteriores.");
        System.out.println("Essa ação é feita ao redefinir métodos como equals e hashCode em uma classe para alterar seu comportamento padrão, isso é importante para comparação de objetos e funcionamento correto em coleções.");
    }
}
