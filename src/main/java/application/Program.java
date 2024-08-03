package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        // inserindo dados na tabela

        Person p1 = new Person(null, "Bob Brown", "bob@gmail.com");
        Person p2 = new Person(null, "Maria Green", "maria@gmail.com");

        // instanciando um EntityManagerFactory a partir do persistence-unit no arquivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        // EntityManager instanciado traz uma conexão com o banco de dados e toda a persistência implementada
        EntityManager em = emf.createEntityManager();

        // inserindo objetos no banco de dados
        em.getTransaction().begin();    // inicia uma transação no banco de dados
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();   // confirma a transação no banco de dados
        System.out.println("Okay!");
    }
}
