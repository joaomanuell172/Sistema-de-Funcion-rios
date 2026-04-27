public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 5000.0);
        Estagiario estagiario = new Estagiario("Bob", 1500.0);

        System.out.println("--- Teste de Sobrescrita (Salário padrão) ---");
        System.out.println("Salário Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário Estagiário: R$ " + estagiario.calcularSalario());

        System.out.println("\n--- Teste de Sobrecarga (Salário com Bônus) ---");
        System.out.println("Gerente com bônus de 500: R$ " + gerente.calcularSalario(500.0));
        System.out.println("Estagiário com bônus de 200: R$ " + estagiario.calcularSalario(200.0));
    }
}
