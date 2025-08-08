import entity.*;
import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

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
//        Product product = em.find(Product.class, 1);
//        System.out.println(product.toString());


//        Supplier supplier = em.find(Supplier.class, 1);
//
//        Code code = new Code();
//        code.setGroup("GRP-TEST");
//        code.setSerial("1123");
//        em.persist(code);
//
//        Product product = new Product();
//        product.setName("Samsung Galaxy");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        em.persist(product);


//        Code code = em.find(Code.class, 1);
//        System.out.println(code.getProduct().getName());
//          Color blue = new Color("Blue");
//          Color red = new Color("Red");
//          Color yellow = new Color("Yellow");
//
//          em.persist(blue);
//          em.persist(red);
//          em.persist(yellow);
//
//          Product product = em.find(Product.class, 1);
//          List<Color> colorList = new ArrayList();
//          colorList.add(blue);
//          colorList.add(red);
//          product.setColorList(colorList);
//          em.persist(product);

//        Product product = em.find(Product.class, 1);
//        System.out.println(product.getColorList().toString());
//
//        Color color = em.find(Color.class, 1);
//        System.out.println(color.getProductList().toString());
//        Product product = em.find(Product.class, 1);
//        System.out.println(product.getCategory().getName());
//        System.out.println(product.getSupplier().getCompany());
//          Code code = new Code();
//          code.setSerial("2234");
//          code.setGroup("UMC-2");
//
//          Product product = new Product();
//          product.setName("TEST");
//          product.setStock(10);
//          product.setPrice(100);
//          product.setCategory(em.find(Category.class,1));
//          product.setSupplier(em.find(Supplier.class,1));
//          product.setCode(code);
//          Product product = em.find(Product.class, 1);
//          em.remove(product);

        //JPQL (Java Persistence Query Language)

        //Query getAllCategories = em.createQuery("select c from Category c");
        /*
        TypedQuery<Category> getAllCategories = em.createQuery("select c from Category c where c.id=:id", Category.class);
        getAllCategories.setParameter("id", 1);
        Category category = getAllCategories.getSingleResult();
        System.out.println(category.getName());
        */

        TypedQuery<CheapProduct> prodQuery = em.createQuery("SELECT NEW CheapProduct(p.id,p.name,p.price) from Product p where p.price > 10 ", CheapProduct.class);
        List<CheapProduct> productcustomList = prodQuery.getResultList();
        for (CheapProduct cheapProduct : productcustomList) {
            System.out.println(cheapProduct.toString());
        }
        // SELECT Count(product_id),c.category_name FROM products as p LEFT JOIN categories as c ON p.product_category_id = c.category_id group by p.product_category_id
        TypedQuery<Object[]> customQuery = em.createQuery("SELECT COUNT(p.id),c.name from Product p LEFT JOIN p.category c group by p.category.id", Object[].class);
        List<Object[]> list = customQuery.getResultList();
        for (Object[] obj : list) {
            System.out.println(obj[1]+":"+obj[0]+" adet ürün bulunuyor");
        }
        TypedQuery<Product> allQuery = em.createNamedQuery("Product.findAll", Product.class);
        List<Product> productList = allQuery.getResultList();
        for (Product product : productList) {
            System.out.println(product.toString());
        }




        /*
        List<Category> categories = getAllCategories.getResultList();
        for (Category category : categories) {
            System.out.println(category.getName());
        }
        */





        tx.commit();


    }
}
