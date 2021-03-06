package com.ctrip.xpipe.redis.console.service;

import java.util.List;

import com.ctrip.xpipe.redis.console.model.DcClusterShardTbl;

public interface DcClusterShardService {
	DcClusterShardTbl find(long dcClusterId, long shardId);
	DcClusterShardTbl find(String dcName, String clusterName, String shardName);
	List<DcClusterShardTbl> findAllByDcCluster(long dcClusterId);
	List<DcClusterShardTbl> findAllByDcCluster(String dcName, String clsuterName);
}
