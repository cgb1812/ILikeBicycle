package com.bilibili.manage.controller;

import com.jt.common.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("userAdmin")
@Controller
public class UserAdminController {
   /* @Autowired
    UserAdminService userAdminService;*/

    @RequestMapping("doUserAdminListUI")
    public String doUserAdminListUI(){
        return "userAdmin/userCentre_list";
    }

    @RequestMapping("doUserEditUI")
    public String doUserEditUI(){
        return "userAdmin/user_edit";
    }
    @RequestMapping("doPwdEditUI")
    public String doPwdEditUI(){
        return "userAdmin/pwd_edit";
    }

    /*@RequestMapping("doUpdatePassword")
    @ResponseBody
    public JsonResult doUpdatePassword(
            String pwd,String newPwd,String cfgPwd){
        userAdminService.updatePassword(pwd,
                newPwd, cfgPwd);
        return new JsonResult("update ok");
    }

    @RequestMapping("doFindObjectById")
    @ResponseBody
    public JsonResult doFindObjectById(
            Integer id){
        Map<String,Object> map=
                userAdminService.findObjectById(id);
        return new JsonResult(map);
    }*/

}