package org.hibernate.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tutorial.domain.Event;

import java.util.Date;
import java.util.List;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();

        saveEvent(session);
        getAllEvents(session);
    }

    private static void saveEvent(Session session) {
        Event event = new Event();
        event.setTitle("Event");
        event.setDate(new Date());

        Transaction transaction = session.beginTransaction();
        session.persist(event);
        transaction.commit();
    }

    private static void getAllEvents(Session session) {
        List<Event> events = (List<Event>) session.createQuery("from Event").list();
        System.out.println(events);
    }
}
