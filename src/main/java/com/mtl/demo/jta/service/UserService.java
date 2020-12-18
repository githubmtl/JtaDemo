package com.mtl.demo.jta.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: MoTianLong
 * @date: 2020年12月18日 15:20
 * @Copyright:
 */
@Service
public class UserService implements UserServiceIf{
    @Resource
    private JdbcTemplate jdbcTemplate1;
    @Resource
    private JdbcTemplate jdbcTemplate2;
    private final String sql="insert into test(test_name,test_age) values (?,?)";
    @Override
    @Transactional
    public void test() {
        int update1 = jdbcTemplate1.update(sql, "mike", 23);
        int update2 = jdbcTemplate2.update(sql, "mike", 23);
        if ("1".equals("1")){
            System.out.println(1/0);
        }
        System.out.println(update1);
        System.out.println(update2);
    }
}
