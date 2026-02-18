// Jeito Clássico (ainda muito usado, mas não obrigatório para scripts simples)

/*
IMPORTANTE: Nome do arquivo e da classe pública em Java

** Regra:
Se uma classe for declarada como "public", o nome do arquivo DEVE ser
exatamente igual ao nome da classe.

** Compilar e executar:
javac Main.java
java Main

** Exceção (Java 11 ou superior):
Você pode executar diretamente sem compilar manualmente:

> java App.java

Isso funciona porque o Java compila e executa automaticamente (source-file mode),
mas não cria um .class permanente.

Resumo:
javac Nome.java  → nome do arquivo deve ser igual à classe pública
java Nome        → executa o .class compilado
java Nome.java   → executa direto (Java 11+)

*/

public class App {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
