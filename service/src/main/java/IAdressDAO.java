public interface IAdressDAO {

    public Adress saveAdress(Adress adress);

    public Adress readAdress(long id);

    public Adress updateAdress(Adress adress);

    public void deleteAdress(Adress adress);

}
