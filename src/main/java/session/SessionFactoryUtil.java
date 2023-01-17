package session;

import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Apartments.class);
            configuration.addAnnotatedClass(Buildings.class);
            configuration.addAnnotatedClass(Companies.class);
            configuration.addAnnotatedClass(Contracts.class);
            configuration.addAnnotatedClass(Employees.class);
            configuration.addAnnotatedClass(Owners.class);
            configuration.addAnnotatedClass(Paymentshistory.class);
            configuration.addAnnotatedClass(Pets.class);
            configuration.addAnnotatedClass(Residents.class);
            configuration.addAnnotatedClass(Taxes.class);

            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory;
    }
}