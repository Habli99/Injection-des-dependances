package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.ext.DaoImplV2;
import org.example.metier.MetierImpl;

public class Pres_V1 {

    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        //DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao); // Injection via le constructeur
        //metier.setDao(dao); // Injection via le setter
        System.out.println("Result : "+metier.calcul());
    }
}
