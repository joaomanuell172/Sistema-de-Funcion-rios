public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    public double calcularSalario(double bonus) {
        return this.salario + bonus;
    }
}
