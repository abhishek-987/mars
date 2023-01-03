package com.solar.mars.service;

import com.solar.mars.Model.Account;
import com.solar.mars.Model.PersonModel;
import com.solar.mars.entity.Person;
import com.solar.mars.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountService {

    public Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public void accountMethod(PersonModel personModel) {
        account.saveTheEntry(personModel);
    }


}
