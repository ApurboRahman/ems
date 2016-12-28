package com.ems.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Properties;

import org.hibernate.transform.Transformers;


/**
 * Created by Apurbo on 8/21/2016.
 */
public abstract class BaseDao {


    protected EntityManager em;
    protected Properties properties;
    protected SessionFactory sessionFactory;
    protected SessionFactory reporttingSessionFactory;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession() {
        return em.unwrap(Session.class);
    }

    protected Session getSessionFactory() {
        return sessionFactory.getCurrentSession();

    }
    protected Query hibernateReportingQuery(String query, Class dtoClazz){
        return getSessionFactory().createSQLQuery(query).setResultTransformer(Transformers.aliasToBean(dtoClazz));
    }

    protected org.hibernate.Query hibernateQuery(String query, Class dtoClazz){
        return getSessionFactory().createSQLQuery(query).setResultTransformer(Transformers.aliasToBean(dtoClazz));
    }
    protected org.hibernate.Query hibernateQuery(String query){
        return getCurrentSession().createSQLQuery(query);
    }


    protected javax.persistence.Query persistenceQuery(String query){
        return em.createNativeQuery(query);
    }
    protected javax.persistence.Query persistenceQuery(String query, Class entityClazz){
        return em.createNativeQuery(query,entityClazz);
    }
}
