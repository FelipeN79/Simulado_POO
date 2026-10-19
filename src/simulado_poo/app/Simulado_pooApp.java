package simulado_poo.app;

/*
 * CLASSE PRINCIPAL (App)
 * É onde o programa COMEÇA: o Java sempre entra pelo main.
 * No UML ela "instancia" Funcionario, ou seja, cria objetos dele com "new".
 *
 * Não usamos Scanner aqui porque ninguém digita nada:
 * os valores já estão escritos no código.
 *
 * Receita do main: CRIAR -> MOSTRAR -> MUDAR -> MOSTRAR DE NOVO
 */
public class Simulado_pooApp {

    public static void main(String[] args) {

        // ========== 1. CRIAR ==========
        // "new" cria o objeto e chama o construtor que ENCAIXA nos valores enviados.

        // 3 valores -> usa o construtor Funcionario(String, String, double)
        Funcionario f1 = new Funcionario("Ana", "Gerente", 9000.0);

        // 2 valores -> usa o construtor Funcionario(String, String)
        // Bruno nasce com salário 1500.0, definido dentro desse construtor.
        Funcionario f2 = new Funcionario("Bruno", "Analista");

        // ========== 2. MOSTRAR ==========
        // exibe() DEVOLVE um texto, então ele vai DENTRO do println.
        // O ponto significa: "objeto f1, execute o seu exibe()".
        System.out.println(f1.exibe());
        System.out.println(f2.exibe());

        // ========== 3. MUDAR ==========
        // aumento() é void: não devolve nada, só altera o objeto.
        // Por isso vai SOZINHO na linha (não cabe dentro de um println).
        // Só o f2 muda; o f1 continua igual, porque cada objeto tem seus próprios dados.
        f2.aumento(10);

        // ========== 4. MOSTRAR DE NOVO ==========
        System.out.println(f2.exibe());   // agora mostra 1650.0

        // getTotalFuncionarios() é static: chamado pela CLASSE (Funcionario.),
        // e não por um objeto (f1. ou f2.).
        // Não dá para usar totalFuncionarios direto aqui, porque ele é private.
        System.out.println("Total de funcionários: " + Funcionario.getTotalFuncionarios());
    }
}
