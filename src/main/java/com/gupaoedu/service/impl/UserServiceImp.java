package com.gupaoedu.service.impl;

import com.gupaoedu.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
//@Transactional
public class UserServiceImp implements UserService {
    //@Autowired
//    private UserMapper mapper;



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
//        return mapper.findByUsername(s);
    }
}
