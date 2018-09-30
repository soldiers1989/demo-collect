package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.PaymentAccount;
import java.util.List;

public interface PaymentAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentAccount record);

    PaymentAccount selectByPrimaryKey(Integer id);

    List<PaymentAccount> selectAll();

    int updateByPrimaryKey(PaymentAccount record);
}