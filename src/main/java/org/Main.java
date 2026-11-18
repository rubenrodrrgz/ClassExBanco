package org;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;
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

            int Cliente = em.createNamedQuery("Cliente.insertarCliente")
                    .setParameter("nombre", "Ruben")
                    .setParameter("apellido", "Rodriguez")
                    .setParameter("direccion", "Santander")
                    .setParameter("email", "rubenrodriguezvillegas@gmail.com")
                    .setParameter("telefono", "640375804")
                    .executeUpdate();
            em.getTransaction().commit();
            System.out.println("Añadido cliente con " + Cliente + " valores");


            TypedQuery<Cliente> queryCogerUsuarios = em.createNamedQuery(
                    "Cliente.cogerTodosLosUsuarios",
                    Cliente.class
            );

            List<Cliente> clientes = queryCogerUsuarios.getResultList();
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + " con id " + cliente.getId());
            }

            Cliente titular = em.createNamedQuery("Cliente.buscarPorId", Cliente.class)
                    .setParameter("id", 9)
                    .getSingleResult();
            em.getTransaction().begin();
            Cuenta cuenta = new Cuenta();
            cuenta.setClienteID(titular);
            cuenta.setTipoCuenta("Corriente");
            cuenta.setSaldo(new BigDecimal(10000));
            em.persist(cuenta);
            em.getTransaction().commit();

            System.out.println("ID cuenta: " + cuenta.getId() + " cuyo titular es " + titular.getNombre() + " tiene un saldo de " + cuenta.getSaldo());



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
