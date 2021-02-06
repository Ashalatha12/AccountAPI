package com.tavant.AccountRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.AccountRestAPI.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
