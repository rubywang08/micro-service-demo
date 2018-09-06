package com.my.repository;

import com.my.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerTest {

    @Autowired
    private CustomerMapper customerMapper;


    @Test
    public void insert_user_test(){
        Customer customer1 = createCustomer();
        Customer customer2 = createCustomer();
        Customer customer3 = createCustomer();
        Customer customer4 = createCustomer();
        customerMapper.insert(customer1);
        customerMapper.insert(customer2);
        customerMapper.insert(customer3);
        customerMapper.insert(customer4);
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        customer.setNickName("1");
        customer.setPassword("11111");
        customer.setUserName("22222");
        customer.setUserSex("男");
        return customer;
    }
}
