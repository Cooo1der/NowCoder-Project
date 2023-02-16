package com.spring.nowcoder.controller;

import com.spring.nowcoder.bean.DiscussPost;
import com.spring.nowcoder.bean.Page;
import com.spring.nowcoder.bean.User;
import com.spring.nowcoder.dao.UserMapper;
import com.spring.nowcoder.service.DiscussPostService;
import com.spring.nowcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    DiscussPostService discussPostService;

    @Autowired
    UserService userService;

//    @Autowired
//    UserMapper userMapper;

    @GetMapping(value = {"/", "/index"})
    public String getIndexPage(Model model, Page page) {
//        /**
//         * 方法调用前,SpringMVC会自动实例化 Model 和 Page,并将Page注入Model.
//         * 所以，在 thymeleaf 中可以直接访问 Page对象中的数据．
//         */
        int rows = discussPostService.selectDissussPostRows(0);
        page.setRows(rows);
        page.setPath("/index");


        List<DiscussPost> discussPostList = discussPostService.selectDiscussPosts(0, page.getOffset(), page.getLimit());
//        // 将dicussPostList中的信息分为 "discussPost"信息 和 ”user“信息
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (discussPostList != null) {
            for (DiscussPost discussPost : discussPostList) {
                HashMap<String, Object> map = new HashMap<>();
                User user = userService.getById(discussPost.getUserId()); // 这里很容易写错
                map.put("discussPost", discussPost);
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "index";
    }
}
