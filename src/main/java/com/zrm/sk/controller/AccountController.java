package com.zrm.sk.controller;


import com.zrm.sk.entity.Account;
import com.zrm.sk.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author amin
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/account/")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Account getById(String id){
        Account account = accountService.getById(id);
        return account;
    }

}
