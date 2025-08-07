import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        // tx.begin();

//        Customer c1 = new Customer();
//        c1.setOnDate(LocalDate.now());
//        c1.setName("Patika");
//        c1.setMail("info@patika.dev");
//        c1.setGender(Customer.GENDER.FEMALE);
//        em.persist(c1);
//
//        tx.commit();
//
//        tx.begin();
//
//        Customer customer = new Customer();
//        customer.setName("John Doe");
//        customer.setMail("test@gmail.com");
//        customer.setGender(Customer.GENDER.MALE);
//        customer.setOnDate(LocalDate.now());
//        em.persist(customer);




    }
}
