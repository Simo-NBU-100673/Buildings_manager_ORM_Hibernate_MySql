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
        //TODO revision every equals and hash code so that it is not based on the id
        //TODO it must be created without the id because it is auto generated
        //TODO create entityDAO for every entity
        //TODO create CRUD for every entity
        //TODO create core logic
        //TODO create UI
    }
}