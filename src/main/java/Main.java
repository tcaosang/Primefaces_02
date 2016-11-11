import com.sang.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.getCurrentSession();
            session.getTransaction().begin();
        Employee     employee = new Employee();
        employee.setEmpName("everything");
        employee.setEmpSalary(4000);
        employee.setEmpHireDate(new Date());
        session.save(employee);

        session.getTransaction().commit();
    }
}
