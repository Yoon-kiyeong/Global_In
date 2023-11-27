package com.globalin.biz.common;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

public interface PlatformTransactionManager {
	TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException;
	void commit() throws TransactionException;
	void rollback() throws TransactionException;
}
