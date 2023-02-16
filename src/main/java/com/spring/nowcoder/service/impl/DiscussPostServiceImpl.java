package com.spring.nowcoder.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.nowcoder.bean.DiscussPost;
import com.spring.nowcoder.dao.DiscussPostMapper;
import com.spring.nowcoder.service.DiscussPostService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostServiceImpl extends ServiceImpl<DiscussPostMapper, DiscussPost> implements DiscussPostService {

    @Autowired
    DiscussPostMapper discussPostMapper;

        public List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }
//    public List<DiscussPost> selectDiscussPosts(@Param("userId") int userId) {
//        return discussPostMapper.selectDiscussPosts(userId);
//    }


    public int selectDissussPostRows(@Param("userId") int userId) {
        return discussPostMapper.selectDissussPostRows(userId);
    }
}
