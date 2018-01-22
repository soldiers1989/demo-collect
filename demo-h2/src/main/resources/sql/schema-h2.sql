
CREATE TABLE IF NOT EXISTS `account` (
  `id` varchar(40) NOT NULL,
  `address` varchar(40) NOT NULL,
  `pub_key` varbinary(1024) DEFAULT NULL,
  `create_time` bigint(14) NOT NULL,
  `alias` varchar(100) DEFAULT NULL,
  `version` int(11) NOT NULL,
  `pri_key` varchar(100) DEFAULT NULL,
  `pri_seed` varbinary(100) DEFAULT NULL,
  `EXTEND` varbinary(1024) DEFAULT NULL,
  `status` INT DEFAULT 0,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `block` (
  `hash` varchar(70) NOT NULL,
  `height` bigint(14) NOT NULL,
  `pre_hash` varchar(70) ,
  `merkle_hash` varchar(70) NOT NULL,
  `create_time` bigint(14) NOT NULL,
  `period_start_time` bigint(14) DEFAULT NULL,
  `time_period` int(5) DEFAULT NULL,
  `consensus_address` varchar(40) DEFAULT NULL,
  `varsion` int(5) NOT NULL,
  `txCount` int(5) NOT NULL,
  `sign` varbinary(1024) NOT NULL,
  PRIMARY KEY (`hash`)
);
CREATE TABLE IF NOT EXISTS `delegate_account` (
  `id` varchar(32) NOT NULL,
  `address` varchar(40) NOT NULL,
  `node_address` varchar(40) NOT NULL,
  `deposit` decimal(19,8) NOT NULL,
  `remark` varchar(255) NOT NULL,
  `start_time` bigint(14) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `delegate` (
  `id` varchar(32) NOT NULL,
  `address` varchar(40) NOT NULL,
  `agent_address` varchar(40) NOT NULL,
  `deposit` decimal(19,8) NOT NULL,
  `status` int(1) DEFAULT NULL,
  `time` bigint(14) DEFAULT NULL,
  `block_height` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `node` (
  `id` VARCHAR(30) NOT NULL,
  `ip` varchar(20) NOT NULL,
  `port` int(6) NOT NULL,
  `last_time` bigint(20) NOT NULL,
  `last_fail_time` bigint(20) NOT NULL,
  `fail_count` int(1) NOT NULL,
  `status` int(1) NOT NULL,
  `magic_num` int(11) NOT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `node_group` (
  `name` varchar(30) NOT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`name`)
);
CREATE TABLE IF NOT EXISTS `node_group_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `node_id` varchar(30) NOT NULL,
  `group_id` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `sub_chain` (
  `id` varchar(30) NOT NULL,
  `creator_address` varchar(40) NOT NULL,
  `tx_hash` varchar(70) NOT NULL,
  `g_block` varbinary(1024) NOT NULL,
  `g_block_hash` varchar(70) NOT NULL,
  `g_merkle_hash` varchar(70) NOT NULL,
  `g_block_header` varbinary(1024) NOT NULL,
  `title` varchar(255) NOT NULL,
  `sign` varbinary(1024) NOT NULL,
  `address_prefix` int(5) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `transaction` (
  `hash` varchar(70) NOT NULL,
  `type` int(5) NOT NULL,
  `create_time` bigint(14) NOT NULL,
  `block_height` bigint(15) NOT NULL,
  `block_hash` varchar(70) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,

  `fee` decimal(15,8) NOT NULL,
  `txData` varbinary(1024) NOT NULL,
  `sign` varbinary(1024) NOT NULL,
  `extend` varbinary(1024) DEFAULT NULL,

  `related_tx_hash` varchar(70) DEFAULT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`hash`)
);
CREATE TABLE IF NOT EXISTS `transaction_local` (
  `hash` varchar(70) NOT NULL,
  `type` int(5) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `create_time` bigint(14) NOT NULL,
  `fee` decimal(19,8) NOT NULL,
  `txData` varbinary(1024) NOT NULL,
  `sign` varbinary(1024) NOT NULL,
  `extend` varbinary(1024) DEFAULT NULL,
  `block_height` bigint(15) NOT NULL,
  `block_hash` varchar(70) NOT NULL,
  `related_tx_hash` varchar(70) DEFAULT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`hash`)
);
CREATE TABLE IF NOT EXISTS `tx_account_relation` (
  `id` varchar(40) NOT NULL,
  `tx_hash` varchar(70) NOT NULL,
  `address` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `utxo_input` (
  `hash` varchar(70) NOT NULL,
  `tx_hash` varchar(70) NOT NULL,
  `from_id` varchar(32) NOT NULL,
  `script` varbinary(1024) NOT NULL,
  PRIMARY KEY (`hash`)
);
CREATE TABLE IF NOT EXISTS `utxo_output` (
  `hash` varchar(70) NOT NULL,
  `tx_hash` varchar(70) NOT NULL,
  `value` decimal(19,8) NOT NULL,
  `lock_time` bigint(20) DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  `script` varbinary(1024) NOT NULL,
  `out_index` int(5) NOT NULL,
  `address` varchar(40) NOT NULL,
  PRIMARY KEY (`hash`)
);

-- `status` bigint(20) NOT NULL,
CREATE TABLE IF NOT EXISTS `alias` (
  `alias` VARCHAR(20) NOT NULL,
  `address` varchar(30) NOT NULL,
  `status` bigint(20) NOT NULL,
  PRIMARY KEY (`alias`)
);
 -- alias index
 create unique index IF NOT EXISTS alias_address_idx on alias(address);