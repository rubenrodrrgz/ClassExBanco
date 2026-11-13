package org;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "default";

    static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try{
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Cliente> queryCogerUsuarios = em.createNamedQuery(
                    "Cliente.cogerTodosLosUsuarios",
                    Cliente.class
            );

            List<Cliente> clientes = queryCogerUsuarios.getResultList();
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
