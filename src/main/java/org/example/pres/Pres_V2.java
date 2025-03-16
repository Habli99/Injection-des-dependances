package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.ext.DaoImplV2;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres_V2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine().trim();
        Class daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.getConstructor().newInstance();

        String metierClassName = sc.nextLine().trim();
        Class metierClass = Class.forName(metierClassName);
        IMetier metier = (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);  /** Injection via le constructeur **/

        /*IMetier metier = (IMetier) metierClass.getConstructor().newInstance();
        Method setDao = metierClass.getDeclaredMethod("setDao", IDao.class); // Injection via le setter
        setDao.invoke(metier,dao);*/

        System.out.println(metier.calcul());
    }


}
