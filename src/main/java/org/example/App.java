package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.model.Etudiant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        //Ajout
        Etudiant etudiant = new Etudiant("FALL","Mamadou",1);
        entityManager.persist(etudiant);

        //
        /*Etudiant etudiant1 = entityManager.find(Etudiant.class,1);
        entityManager.remove(etudiant1);*/

        //
        Etudiant etudiant1 = entityManager.find(Etudiant.class,2);
        etudiant1.setNom("LO");
        etudiant1.setPrenom("iBOU");

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
