package simulado_poo.app;

/*
 * CLASSE Funcionario
 * É o "molde" (a forma de bolo) de todos os funcionários.
 * Cada funcionário criado com "new" é um OBJETO feito a partir deste molde.
 *
 * Ordem do arquivo = ordem do UML:
 *   1º nome da classe -> 2º atributos -> 3º construtores e métodos
 */
public class Funcionario {

    // ===================== ATRIBUTOS =====================
    // No UML: "- nome : String"
    //   "-"  vira private (só a própria classe enxerga)
    //   o tipo vem DEPOIS do nome no UML e ANTES no Java
    private String nome;
    private String cargo;
    private double salario;

    // No UML este atributo está SUBLINHADO -> vira static.
    // static = existe UMA cópia só, compartilhada por todos os objetos
    // (é o "quadro da sala", e não o "caderno de cada aluno").
    // Começa em 0 e cada construtor soma 1 nele.
    private static int totalFuncionarios = 0;

    // ===================== CONSTRUTORES =====================
    // Construtor: MESMO nome da classe e SEM tipo de retorno (nem void).
    // É chamado automaticamente pelo "new".
    // Os parâmetros (n, c, s) são a "caixa" que chega;
    // os atributos (nome, cargo, salario) são a "gaveta" que fica guardada.

    // Construtor 1 -> UML: + Funcionario(String, String, double)
    // Usado quando o "new" manda 3 valores.
    public Funcionario(String n, String c, double s) {
        nome = n;               // guarda o valor que chegou em n no atributo nome
        cargo = c;
        salario = s;
        totalFuncionarios++;    // mais um funcionário criado: soma 1 no contador
    }

    // Construtor 2 -> UML: + Funcionario(String, String)
    // SOBRECARGA: mesmo nome, parâmetros diferentes (2 em vez de 3).
    // O Java escolhe qual construtor usar pela quantidade de valores no "new".
    public Funcionario(String n, String c) {
        nome = n;
        cargo = c;
        salario = 1500.0;       // o salário não vem de fora: começa em 1500.0 (regra do enunciado)
        totalFuncionarios++;    // cada construtor é independente, então este também precisa contar
    }

    // ===================== GETTERS =====================
    // Get: NÃO recebe nada (parênteses vazios) e DEVOLVE o atributo.
    // O tipo antes do nome é o tipo do atributo devolvido.

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // ===================== SETTER =====================
    // Set: é void (não devolve nada) e RECEBE o novo valor.
    // Serve para alterar o atributo de fora da classe (já que ele é private).
    public void setSalario(double s) {
        salario = s;
    }

    // ===================== OUTROS MÉTODOS =====================

    // UML: + aumento(double) : void
    // Recebe uma PORCENTAGEM e altera o próprio salário.
    // É void porque só MUDA o objeto; não entrega nada para quem chamou.
    // Exemplo: salario = 1500 e a = 10 -> 1500 + 1500 * 10 / 100 = 1650
    public void aumento(double a) {
        salario = salario + salario * a / 100;
    }

    // UML: + exibe() : String
    // DEVOLVE (return) um texto pronto. Ele NÃO imprime nada:
    // quem imprime é a App, colocando o exibe() dentro de um println.
    public String exibe() {
        return "Nome: " + nome + "| Cargo: " + cargo + "| Salário: " + salario;
    }

    // UML: + getTotalFuncionarios() : int  (SUBLINHADO -> static)
    // Método static pertence à CLASSE, não a um objeto.
    // Por isso é chamado assim: Funcionario.getTotalFuncionarios()
    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
