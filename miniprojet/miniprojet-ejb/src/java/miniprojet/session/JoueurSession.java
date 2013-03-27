/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Phantom
 */
@Stateless
public class JoueurSession implements JoueurSessionLocal {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @javax.persistence.PersistenceContext(unitName="miniprojet_persistence")
    private EntityManager em ;

    public JoueurSession() {
    }

    @Override
    public String hello() {
        return "hello";
    }

}
