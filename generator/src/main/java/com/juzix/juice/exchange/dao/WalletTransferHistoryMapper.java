package com.juzix.juice.exchange.dao;

import com.juzix.juice.exchange.entity.WalletTransferHistory;
import java.util.List;

public interface WalletTransferHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WalletTransferHistory record);

    WalletTransferHistory selectByPrimaryKey(Integer id);

    List<WalletTransferHistory> selectAll();

    int updateByPrimaryKey(WalletTransferHistory record);
}