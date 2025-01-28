package hellojpa;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.h2.engine.User;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

public class JpaMain {

    public static void main(String[] args) {

        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        //
        //EntityManager em = emf.createEntityManager();
        //
        //EntityTransaction tx = em.getTransaction();
        //tx.begin();

        try {
            System.out.println(1 / 10);
        } catch (Exception e) {
            //tx.rollback();
            e.getStackTrace();
            System.out.println(e.getMessage());
        } finally {
            //em.close();
        }

        //emf.close();
    }
}
