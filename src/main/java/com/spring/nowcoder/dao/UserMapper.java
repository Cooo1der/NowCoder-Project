package com.spring.nowcoder.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.nowcoder.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
