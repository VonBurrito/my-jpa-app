package org.myjpaapp;

import org.myjpaapp.model.Device;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("devicePU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Device device = new Device(1L, "Tv-set");
        em.persist(device);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
