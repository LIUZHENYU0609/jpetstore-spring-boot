package org.csu.my_pet_store_spring.persistence;


import org.csu.my_pet_store_spring.domain.Account;

public interface AccountMapper {
    Account getAccountByUsername(String username);

    Account getAccountByUsernameAndPassword(Account account);

    void insertAccount(Account account);

    void insertProfile(Account account);

    void insertSignon(Account account);

    void updateAccount(Account account);

    void updateProfile(Account account);

    void updateSignon(Account account);
}
