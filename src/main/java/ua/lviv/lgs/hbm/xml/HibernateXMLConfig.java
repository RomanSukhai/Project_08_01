package ua.lviv.lgs.hbm.xml;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.*;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;






public class HibernateXMLConfig {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cnf.xml");
		
	ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
	registry.applySettings(configuration.getProperties());
	ServiceRegistry serviceRegistry = (ServiceRegistry) registry.buildServiceRegistry();
	SessionFactory sessionFactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Person person = new Person(2,"Roman","Sukhai",35);
		session.persist(person);
		transaction.commit();
		session.close();
}
}
