package ru.dmitrii.aston.DAO;

import jakarta.persistence.Column;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.dmitrii.aston.Model.BankAccount;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author : Dmitrii Frolov, a.k.a. A1Rinzler
 * @created : 21.10.2026
 **/

public class BankAccountDAO {
    SessionFactory sessionFactory;

    public BankAccountDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Optional<BankAccount> getById(int id){
        Session session = sessionFactory.openSession();
        BankAccount bankAccount = session.find(BankAccount.class, id);

        if (bankAccount == null){
            return Optional.empty();
        }

        return Optional.of(bankAccount);
    }


    public Optional<BigDecimal> getBalance(int id){

        Optional<BankAccount> bankAccount = getById(id);

        BigDecimal balance = bankAccount.get().getBalance();


        return Optional.of(balance);
    }

    public void newAccountholder( String accountHolder, BigDecimal balance, String currency ){

    }
}
