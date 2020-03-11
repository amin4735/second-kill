package com.zrm.sk.service.impl;

import com.zrm.sk.entity.Account;
import com.zrm.sk.mapper.AccountMapper;
import com.zrm.sk.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author amin
 * @since 2020-03-03
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
