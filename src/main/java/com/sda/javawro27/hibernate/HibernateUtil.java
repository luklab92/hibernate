package com.sda.javawro27.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            System.out.println("Konfirguruje hibernate.");

            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml");
            ourSessionFactory = configuration.buildSessionFactory();
        }catch (HibernateException e) {
            System.err.println(e.getMessage());
            System.exit(376);
            throw e;
        }
    }
        //wygenerowany getter
        public static SessionFactory getOurSessionFactory() {
            return ourSessionFactory;
        }
    }

