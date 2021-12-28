package com.pairlearning.expensetrackingapi.repositories;

import com.pairlearning.expensetrackingapi.domain.User;
import com.pairlearning.expensetrackingapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create (String firstName,String lastName,String email, String password) throws EtAuthException;

    User findByEmailAndPassword (String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer UserId);
}


