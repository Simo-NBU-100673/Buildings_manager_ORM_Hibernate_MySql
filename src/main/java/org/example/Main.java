package org.example;

import dao.CompaniesDAO;
import dao.EmployeeDAO;
import entity.Companies;
import entity.Employees;

public class Main {
    public static void main(String[] args) {
//        Companies company = new Companies();
//        company.setName("Bor Chvor");
//        company.setIdCompanies(1);
//
//        CompaniesDAO.saveCompany(company);
//
//        CompaniesDAO.readCompanies().forEach(System.out::println);

//        int id = 5;
//        Companies company = CompaniesDAO.getCompanyById(id);
//        CompaniesDAO.deleteCompany(company);
//        System.out.println("CompaniesDAO.getCompanyById(1).getName() = " + CompaniesDAO.getCompanyById(id).getName());

        Employees employees = new Employees("Goshko", "Petrov");
        EmployeeDAO.saveEmployee(employees);
        //TODO revision every equals and hash code so that it is not based on the id
        //TODO it must be created without the id because it is auto generated
        //TODO create entityDAO for every entity
        //TODO create CRUD for every entity
        //TODO create core logic
        //TODO create UI
    }
}