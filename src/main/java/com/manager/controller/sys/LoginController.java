package com.manager.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manager.dto.sys.MenuDTO;
import com.manager.dto.sys.UserDTO;
import com.manager.entity.sys.Menu;
import com.manager.service.sys.MenuService;
import com.manager.service.sys.UserService;

import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: manager
 * @description: 用户登录相关
 * @author: zhangwanxin
 * @create: 2019-03-01 17:20
 **/
@Controller
public class LoginController {

    @Autowired
    private SessionRegistry sessionRegistry;
    @Autowired
    UserService userService;
    @Autowired
    MenuService menuService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        response.setContentType("application/json");

        String username = request.getUserPrincipal().getName();
        System.out.println("登录用户:" + username);

        String id = userService.getUserDTOByName(username).getId();
        List<MenuDTO> userMenuList = menuService.getUserMenuList(id);
        model.addAttribute("menuList",userMenuList);
        model.addAttribute("username", username);
        return "index";
    }


    /**
     * 注销时直接从sessionRegistry中移除请求中储存的sessionid
     *
     * @param request
     * @return
     */
    @RequestMapping("/mylogout")
    public String logout2(HttpServletRequest request) {
        String sessionid = request.getRequestedSessionId();
        sessionRegistry.removeSessionInformation(sessionid);
        return "redirect:/login";
    }

}
