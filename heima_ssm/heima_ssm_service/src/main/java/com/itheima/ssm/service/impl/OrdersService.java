package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IMemberDao;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Member;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersService implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Autowired
    private IMemberDao memberDao;
    public Member findAll(String id){
        Member member = memberDao.findById(id);
        System.out.println(member);
        return  memberDao.findById(id);
    }

    @Override
    public List<Orders> findAll(int page,int size) {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) {
        System.out.println(ordersDao.findById(ordersId));
        return ordersDao.findById(ordersId);
    }
}
