package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.PaymentAccountDetail;
import java.util.List;

public interface PaymentAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentAccountDetail record);

    PaymentAccountDetail selectByPrimaryKey(Integer id);

    List<PaymentAccountDetail> selectAll();

    int updateByPrimaryKey(PaymentAccountDetail record);
}