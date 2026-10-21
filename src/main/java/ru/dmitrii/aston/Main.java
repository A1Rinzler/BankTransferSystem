package ru.dmitrii.aston;

import ru.dmitrii.aston.Connection.HibernateSession;
import ru.dmitrii.aston.DAO.BankAccountDAO;
import ru.dmitrii.aston.Model.BankAccount;

/**
 * @author : Dmitrii Frolov, a.k.a. A1Rinzler
 * @created : 21.10.2026
 **/

public class Main {


    public static void main(String[] args) {
        BankAccountDAO bankAccountDAO = new BankAccountDAO(HibernateSession.getSessionFactory());

        BankAccount bankAccount = bankAccountDAO.getById(1).orElse(null);
        System.out.println(bankAccount.getAccountHolder() + " " + bankAccount.getCurrency() + " " + bankAccount.getBalance());

        System.out.println("Баланс чела номер 1 " + bankAccountDAO.getBalance(1).get());
    }
}
