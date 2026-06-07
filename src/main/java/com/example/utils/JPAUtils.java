package com.example.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtils {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("userdemoPU");

    private JPAUtils() {
        // Private constructor to prevent instantiation
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
