import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setCommission(1200);

                System.out.println("Código: " + (manager).getCode());
                System.out.println("Salário: R$" + (manager).getSalary());
                System.out.println("Nome: " + (manager).getName());
                System.out.println("Login: " + manager.getLogin());
                System.out.println("Senha: " + manager.getPassword());
                System.out.println("Comissão: R$" + manager.getCommission());
                System.out.println("Salário com extra: R$" + manager.getFullSalary(500));
            }
            case Salesman salesman -> {
                salesman.setCode("123");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println("Código: " + (salesman).getCode());
                System.out.println("Salário: R$" + (salesman).getSalary());
                System.out.println("Nome: " + (salesman).getName());
                System.out.println("Percentual das vendas: " + (salesman).getPercentPerSold() + "%");
                System.out.println("Valor vendido: R$" + salesman.getSoldAmount());
            }
        }
        System.out.println("Salário total: R$" + employee.getFullSalary());
        System.out.println("======================\n");
    }
}