package com.pairlearning.expensetrackingapi.services;

import com.pairlearning.expensetrackingapi.domain.Transaction;
import com.pairlearning.expensetrackingapi.exceptions.EtBadRequestException;
import com.pairlearning.expensetrackingapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {
    List<Transaction> fetchAllTransaction(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws
            EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws
            EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws
            EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    }

