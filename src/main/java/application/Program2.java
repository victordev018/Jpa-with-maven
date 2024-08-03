package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program2 {
    public static void main(String[] args) {

        // recuperar dados do banco de dados

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Person p1 = em.find(Person.class, 2);

        System.out.println("Person found: " + p1);

        emf.close();
        em.close();
    }
}
