package com.pairlearning.expensetrackingapi.services;


import com.pairlearning.expensetrackingapi.domain.User;
import com.pairlearning.expensetrackingapi.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
