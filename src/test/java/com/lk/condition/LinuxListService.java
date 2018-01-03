package com.lk.condition;

/**
 * @author Kevin
 * @description
 * @date 2016/7/1
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}