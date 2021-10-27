package com.vision.transaction_after.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.vision.transaction_after.dto.TicketDto;


public class TicketDao {

	JdbcTemplate template;
	PlatformTransactionManager transactionManager;
	public void setTemplate(JdbcTemplate template) {
	this.template = template;
	}
	public void setTransactionManager( PlatformTransactionManager transactionManager) {
	this.transactionManager = transactionManager;
	}

	public TicketDao() {
	System.out.println(template);
	}

	public String buyTicket(final TicketDto dto) {
	System.out.println("buyTicket()");
	System.out.println("dto.getconsumerid() : " + dto.getConsumerid());
	System.out.println("dto.getamount() : " + dto.getAmount());
	String res=""; 
	// 트랜잭션 적용점
	TransactionDefinition definition = new DefaultTransactionDefinition();
	TransactionStatus status = transactionManager.getTransaction(definition);

	try {

	template.update(new PreparedStatementCreator() {

	@Override
	public PreparedStatement createPreparedStatement(Connection con)
	throws SQLException {
	String query = "insert into card (consumerid, amount) values (?, ?)";
	PreparedStatement pstmt = con.prepareStatement(query);
	pstmt.setString(1, dto.getConsumerid());
	pstmt.setString(2, dto.getAmount());

	return pstmt;
	}
	});

	template.update(new PreparedStatementCreator() {

	@Override
	public PreparedStatement createPreparedStatement(Connection con)
	throws SQLException {
	String query = "insert into ticket (consumerid, countnum) values (?, ?)";
	PreparedStatement pstmt = con.prepareStatement(query);
	pstmt.setString(1, dto.getConsumerid());
	pstmt.setString(2, dto.getAmount());

	return pstmt;
	}
	});
	// 이상이 없을 시 커밋 
	res =  "정상발권";
	transactionManager.commit(status);

	} catch (Exception e) {
	e.printStackTrace();
	res = "롤백됨,원천무효!";
	transactionManager.rollback(status);
	}
	return res;
	}


	}