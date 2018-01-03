package com.lk.condition;

/**
 * @author Kevin
 * @description
 * @date 2016/7/1
 */
class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}