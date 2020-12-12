package xhmy.cloud.service.Impl;

import xhmy.cloud.dao.UserMapper;
import xhmy.cloud.service.UserService;

/**
 * @author aliketh.xhmy
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
