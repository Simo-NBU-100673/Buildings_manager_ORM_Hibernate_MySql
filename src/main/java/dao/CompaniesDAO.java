package dao;

import entity.Companies;
import org.hibernate.Session;
import org.hibernate.Transaction;
import session.SessionFactoryUtil;

import java.util.List;

public class CompaniesDAO {

    //Saves the company where it should be saved in its table if possible
    public static void saveCompany(Companies company) {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(company);
            transaction.commit();
        }
    }

    public static void saveCompanies(List<Companies> companyList) {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            companyList.stream().forEach(session::save);
            transaction.commit();
        }
    }

    public static List<Companies> readCompanies() {
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT a FROM Companies a", Companies.class).getResultList();
        }
    }

    /**
     * Gets the
     * @param id primary key of table
     * @return the persistent object as an instance of corresponding entity
     */
    public static Companies getCompanyById(int id){
        Companies company;
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            company = session.get(Companies.class, id);//gets by the PK of the table
            transaction.commit();
        }

        if (company == null){
            throw new IllegalArgumentException("No company with id:"+id);
        }

        return company;
    }

    //Deletes company by id
    public static void deleteCompanyById(int id){
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(getCompanyById(id));
            transaction.commit();
        }
    }

    //Deletes company by ref, but it must have this company to delete it
    public static void deleteCompany(Companies company){
        try (Session session = SessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(company);
            transaction.commit();
        }
    }

}
