package com.springboot.learn.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.learn.dao.TransferDao;
import com.springboot.learn.entity.Account;
import com.springboot.learn.service.TransferService;

/**
 * 转账service接口
 * @author jinqshen
 *
 */
@Service("transferservice")
public class TransferServiceImpl implements TransferService {

	@Autowired
	private TransferDao transferDao;
	/**
	 * @Transactional  spring事务管理，处理事务的一致性
	 */
	@Transactional
	public void transfer(Integer from, Integer to, float num) {
		Account fromuser = transferDao.getOne(from);
		if(fromuser.getMoney() < num) {
			int i = 1/0;
		}
		else{
			fromuser.setMoney(fromuser.getMoney() - num);
			transferDao.save(fromuser);
		
			Account touser = transferDao.getOne(to);
			touser.setMoney(touser.getMoney() + num);
			transferDao.save(touser);
		}
	}

}
