/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import java.text.ParseException;
import java.util.*;
import metier.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/*
/**
 *
 * @author UT1
 */
public class testHibernate {
    
    public static void main (String[] args) throws ParseException
{
///*----- Ouverture de la session et de la transaction -----*/
//Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//Transaction t = session.beginTransaction();
getClient();


//t.commit();
//System.exit(0);
}
    
   public static List<Client> getClient() throws ParseException{
       /*----- Ouverture de la session et de la transaction -----*/
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction t = session.beginTransaction();

    String hql ="from Client;";
    Query q = session.createQuery(hql);
    List<Client> ld = (List<Client>) q.list();
    t.commit();
    return ld;
    
       
}

}
