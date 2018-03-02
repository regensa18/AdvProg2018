package id.ac.ui.cs.advprog.tutorial3.composite;

import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Ceo;
import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Cto;
import id.ac.ui.cs.advprog.tutorial3.composite.techexpert.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Industry {
    public static void main(String[] args) {
        Company company = new Company();
        Ceo ceo = new Ceo("Imran", 200000);
        company.addEmployee(ceo);
        Cto cto = new Cto("Qori", 150000);
        company.addEmployee(cto);
        BackendProgrammer backend = new BackendProgrammer("Jihad", 130000);
        company.addEmployee(backend);
        FrontendProgrammer frontend = new FrontendProgrammer("Hafizh", 125000);
        company.addEmployee(frontend);
        NetworkExpert network = new NetworkExpert("Azka", 170000);
        company.addEmployee(network);
        SecurityExpert security = new SecurityExpert("Azmie", 110000);
        company.addEmployee(security);
        UiUxDesigner uiux = new UiUxDesigner("Rafi", 120000);
        company.addEmployee(uiux);

        for (int i = 0; i < company.employeesList.size(); i++) {
            System.out.println("==========================================================================");
            System.out.println("Nama: " + company.employeesList.get(i).getName() +
                    "   Role: " + company.employeesList.get(i).getRole() +
                    "   Salary $" + company.employeesList.get(i).getSalary());
        }
        System.out.println("==========================================================================");
        System.out.println("Industry Salary: " + company.getNetSalaries());
    }

}
