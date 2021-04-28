package com.zfirm.csrftest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfirm.csrftest.entity.UserEntity;
import com.zfirm.csrftest.utils.PageUtils;
import com.zfirm.csrftest.vo.ExchangeVo;


import java.util.Map;

/**
 * 
 *
 * @author zy
 * @email zy@gmail.com
 * @date 2021-04-22 23:22:54
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    UserEntity login(UserEntity userEntity);

    void exchange(ExchangeVo exchangeVo);
}

