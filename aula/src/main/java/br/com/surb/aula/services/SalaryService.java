package br.com.surb.aula.services;

import br.com.surb.aula.entities.Employee;

public class SalaryService {
    public double netSalary(Employee employee){
        return employee.getGrossSalary() - 0.2;
    }
}
