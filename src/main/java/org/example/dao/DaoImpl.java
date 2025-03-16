package org.example.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base données");
        double temp = 12.4;
        return temp;
    }
}
