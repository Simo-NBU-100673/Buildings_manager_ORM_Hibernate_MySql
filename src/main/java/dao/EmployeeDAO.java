package dao;

import entity.Employees;

//TODO make singleton with DLC
public final class EmployeeDAO extends GenericDAO<Employees>{

    private static final EmployeeDAO EMPLOYEE_DAO = new EmployeeDAO();

    @Override
    public Class<Employees> getEntityClass() {
        return Employees.class;
    }

    public static void saveEmployee(Employees employee) {
        EMPLOYEE_DAO.create(employee);
    }


}
