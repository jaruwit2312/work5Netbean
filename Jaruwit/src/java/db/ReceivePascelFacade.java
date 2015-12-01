/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Boy
 */
@Stateless
public class ReceivePascelFacade extends AbstractFacade<ReceivePascel> {

    @PersistenceContext(unitName = "JaruwitPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReceivePascelFacade() {
        super(ReceivePascel.class);
    }
    
}
