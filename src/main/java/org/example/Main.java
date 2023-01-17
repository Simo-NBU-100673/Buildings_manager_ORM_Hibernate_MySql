package org.example;

import dao.CompaniesDAO;
import entity.Companies;

public class Main {
    public static void main(String[] args) {
        Companies company = new Companies();
        company.setName("DHL");
        company.setIdCompanies(1);

        CompaniesDAO.saveCompany(company);

        CompaniesDAO.readCompanies().forEach(System.out::println);
    }
}