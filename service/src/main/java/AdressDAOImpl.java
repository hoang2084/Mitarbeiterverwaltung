import de.fantavier.j2ee.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdressDAOImpl implements IAdressDAO{
    Session session = HibernateUtil.getCurrentSession();
    @Override
    public Adress saveAdress(Adress adress) {
        session.beginTransaction();
        session.save(adress);
        session.getTransaction().commit();
        return adress;
    }

    @Override
    public Adress readAdress(long id) {
        return null;
    }

    @Override
    public Adress updateAdress(Adress adress) {
        return null;
    }

    @Override
    public void deleteAdress(Adress adress) {

    }
}
