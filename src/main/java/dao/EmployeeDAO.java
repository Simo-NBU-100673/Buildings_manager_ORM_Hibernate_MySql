package dao;

import entity.Employees;

import java.util.Collection;

//TODO make singleton with DLC
public final class EmployeeDAO extends GenericDAO<Employees> {

    private static final EmployeeDAO EMPLOYEE_DAO = new EmployeeDAO();

    @Override
    protected Class<Employees> getEntityClass() {
        return Employees.class;
    }

    //Working
    public static void saveEmployee(Employees employee) {
        EMPLOYEE_DAO.create(employee);
    }

    //Working
    public static void saveEmployees(Collection<Employees> employees) {
        EMPLOYEE_DAO.create(employees);
    }

    //Working
    public static Employees getEmployeeById(int id) {
        return EMPLOYEE_DAO.getById(id);
    }

    //Working
    public static Collection<Employees> getAllEmployees() {
        return EMPLOYEE_DAO.getAllEntities();
    }

    //Working but PK must be the same
    public static void updateEmployee(Employees employee) {
        EMPLOYEE_DAO.update(employee);
    }

    //Working but PK must be the same
    public static void deleteEmployee(Employees employee) {
        EMPLOYEE_DAO.delete(employee);
    }

    //Working
    public static void deleteEmployeeById(int id) {
        EMPLOYEE_DAO.deleteById(id);
    }
}
