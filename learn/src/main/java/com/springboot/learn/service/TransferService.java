package com.springboot.learn.service;

import com.springboot.learn.entity.Account;

public interface TransferService {

	public void transfer(Integer from, Integer to, float num);
}
