package org.csu.my_pet_store_spring.service.impl;

import org.csu.my_pet_store_spring.domain.Account;
import org.csu.my_pet_store_spring.persistence.AccountMapper;
import org.csu.my_pet_store_spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getAccount(String username) {
        return accountMapper.getAccountByUsername(username);
    }

    @Override
    public Account getAccount(String username, String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        return accountMapper.getAccountByUsernameAndPassword(account);
    }

    @Override
    public void insertAccount(Account account) {
         accountMapper.insertAccount(account);
         accountMapper.insertProfile(account);
         accountMapper.insertSignon(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
        accountMapper.insertProfile(account);
        if (account.getPassword() != null && account.getPassword().length() > 0) {
            accountMapper.updateSignon(account);
        }
    }
}
