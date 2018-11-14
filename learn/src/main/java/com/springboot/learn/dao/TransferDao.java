package com.springboot.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learn.entity.Account;

/**
 * 转账dao层
 * @author jinqshen
 *
 */
public interface TransferDao extends JpaRepository<Account, Integer> {

}
