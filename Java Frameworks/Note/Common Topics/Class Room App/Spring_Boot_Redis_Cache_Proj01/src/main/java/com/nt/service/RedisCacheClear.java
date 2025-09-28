package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheClear {
	@Autowired
	private RedisTemplate<String, Object> template;
	
	@Scheduled(cron = "0 0/1 * * * *")
	public void clearAllData() {
		template.getConnectionFactory().getConnection().flushAll();
	}

}
