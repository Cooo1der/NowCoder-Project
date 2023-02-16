package com.spring.nowcoder;

import com.spring.nowcoder.bean.DiscussPost;
import com.spring.nowcoder.bean.User;
import com.spring.nowcoder.dao.DiscussPostMapper;
import com.spring.nowcoder.dao.UserMapper;
import com.spring.nowcoder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // 测试类上需要加@SpringBootTest注解
@Slf4j
public class MapperTest {

    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPost() {
        List<DiscussPost> discussPostList = discussPostMapper.selectDiscussPosts(0, 0, 7);
        for(DiscussPost discussPost : discussPostList) {
            System.out.println(discussPost);
        }

        int rows = discussPostMapper.selectDissussPostRows(0);
        log.info("总记录行数：{}", rows);

    }

    @Autowired
    UserService userService;

    @Test
    public void testSelectUser() {
        User user = userService.getById(101);
        log.info("user: {}", user);
    }
}
