package com.lj.sm.service;

import com.lj.sm.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id,String password);
}
