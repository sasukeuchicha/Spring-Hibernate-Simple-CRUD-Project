package com.hibernate.hibernateCRUDproj1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.hibernateCRUDproj1.Entities.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration();
        config.configure("OrmConfig.cfg.xml");
        
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        Session session =  sessionFactory.openSession();
        
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Transaction tx = session.beginTransaction();
        
        c1.setCustomerId(1);
        c1.setCustomerName("Rajesh Krishna");
        c1.setCustomerEmail("rah=ju.fdsf@gmail.com");
        c1.setCustomerRating(2);
        
        c2.setCustomerId(2);
        c2.setCustomerName("Birjesh Pandu");
        c2.setCustomerEmail("example@email.com");
        c2.setCustomerRating(1);
        
        //create
        session.save(c1);
        
        //get
        System.out.println(session.get(Customer.class, 1));
        
        //delete
        Customer customerToBeDeleted = session.get(Customer.class, 1);
        session.delete(customerToBeDeleted);
        
        //update
        session.save(c2);
        tx.commit();
        //close session and session factory
        session.close();
        sessionFactory.close();
        
        
    }
}
