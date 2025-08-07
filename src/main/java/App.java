import entity.Category;
import entity.Code;
import entity.Product;
import entity.Supplier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        // tx.begin();

//        entity.Customer c1 = new entity.Customer();
//        c1.setOnDate(LocalDate.now());
//        c1.setName("Patika");
//        c1.setMail("info@patika.dev");
//        c1.setGender(entity.Customer.GENDER.FEMALE);
//        em.persist(c1);
//
//        tx.commit();
//
//        tx.begin();
//
//        entity.Customer customer = new entity.Customer();
//        customer.setName("John Doe");
//        customer.setMail("test@gmail.com");
//        customer.setGender(entity.Customer.GENDER.MALE);
//        customer.setOnDate(LocalDate.now());
//        em.persist(customer);


//        //Supplier ekleme
//        Supplier supplier = new Supplier();
//        supplier.setAddress("Adres");
//        supplier.setCompany("Patika");
//        supplier.setContact("50012424");
//        supplier.setEmail("info@patika.dev");
//        supplier.setPerson("Utku Berki");
//        em.persist(supplier);
//
//        //Category ekleme
//        Category category = new Category();
//        category.setName("Telefon");
//        em.persist(category);
//
//        //Code ekleme
//
//        Code code = new Code();
//        code.setGroup("GRP-TEST");
//        code.setSerial("1123");
//        em.persist(code);
//
//        //Product ekleme
//
//        Product product = new Product();
//        product.setName("Iphone 15 Pro");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        product.setCategory(category);
//        em.persist(product);







      tx.begin();
//        Product product = em.find(Product.class, 1);
//        System.out.println(product.toString());

        /*
        Supplier supplier = em.find(Supplier.class, 1);

        Code code = new Code();
        code.setGroup("GRP-TEST");
        code.setSerial("1123");
        em.persist(code);

        Product product = new Product();
        product.setName("Samsung Galaxy");
        product.setPrice(1234);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        em.persist(product);*/


//        Code code = em.find(Code.class, 1);
//        System.out.println(code.getProduct().getName());

        Supplier supplier = em.find(Supplier.class, 1);
        for (Product product: supplier.getProductList()){
            System.out.println(product.toString());
        }


tx.commit();


    }
}
