package com.spring.nowcoder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.nowcoder.bean.User;
import com.spring.nowcoder.dao.UserMapper;
import com.spring.nowcoder.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
