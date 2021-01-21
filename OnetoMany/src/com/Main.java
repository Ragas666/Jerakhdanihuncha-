package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/*// ERROR: HHH000389: Unsuccessful:
create table Product (PRODUCT_ID bigint not null auto_increment, description varchar(255), name varchar(255),
		price float not null, CATEGORY_ID) bigint, primary key (PRODUCT_ID))*/
public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		
		  Category category1 = new Category("Computer"); Product p1 = new Product("HP",
		  "windows", 30000); Product p2 = new Product("Dell", "windows", 40000);
		  
		  List prodlist1 = new ArrayList(); prodlist1.add(p1); prodlist1.add(p2);
		  
		  category1.setProducts(prodlist1); session.save(category1);
		 

		session.getTransaction().commit();
		session.close();

	}

}
