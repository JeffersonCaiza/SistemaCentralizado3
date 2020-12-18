/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemacentralizado3.principal;

import com.mycompany.sistemacentralizado3.entidades.Producto;
import com.mycompany.sistemacentralizado3.session.ProductoJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author xtratech
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductoJpaController pjc = new ProductoJpaController(emf);
        Producto p = new Producto(2);
        p.setCodigo(1);
        p.setNombre("Software ERP");
        Double d1 = 5000.99;
        BigDecimal db1 = BigDecimal.valueOf(d1);
        p.setPrecio(db1);
        p.setDetalle("Para la EPN");
        try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
