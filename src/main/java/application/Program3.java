package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program3 {
    public static void main(String[] args) {

        // Deleção de daods:

        // para deletar algum dado ele tem que ser uma entidade monitorada, ou seja, uma entidade
        // que acabou de ser inserida ou que tenha sido buscada no banco de dados, claro antes de
        // fechar o EntityManager

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Person person = em.find(Person.class, 1);

        // iniciando transação, sempre que não for uma simples busca
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
        System.out.println("object removed successfully");

        emf.close();
        em.close();
    }
}
