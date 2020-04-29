package com.atguigu.jedis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		//建立连接：参数一 IP地址 参数二 端口号
		Jedis jedis = new Jedis("192.168.37.100",6379);
		
		//测试是否连接上
		System.out.println(jedis.ping());
		Set<String> keys = jedis.keys("*");
		for (String string : keys) {
			System.out.println(string);
		}
		//测试String：
		jedis.set("k4", "3");
		System.out.println(jedis.get("k4"));
		
		//关闭连接
		jedis.close();
	}

}
