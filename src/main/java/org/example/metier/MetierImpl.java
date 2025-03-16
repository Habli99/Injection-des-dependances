package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("d")
    private IDao dao; /** Couplage Faible **/

    public MetierImpl() {
    }

    /** Pour une injection via le Constructeur **/
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double result = temp * 10;
        return result;
    }

    /** Pour une injection via le Setter ! **/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
