package de.fantavier.j2ee;

import com.sun.xml.internal.ws.handler.HandlerException;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

    final static Logger LOGGER = Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;
    private static Configuration configuration = new Configuration();

    public static void buildSessionFactory() {
        try {
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }catch (Exception e){
            LOGGER.error("Error Creating Hibernate SessionFactory", e);
        }
    }

    public static Session getCurrentSession() throws HandlerException {
        return getSessionFactory().getCurrentSession();
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            buildSessionFactory();
        }
        return sessionFactory;
    }

}
