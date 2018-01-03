//package com.lk;
//
//import org.eclipse.jetty.security.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.PermissionEvaluator;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//
//import java.io.Serializable;
//
//@Component
//    public class MyPermissionEvaluator implements PermissionEvaluator {
//
//        @Autowired
//        private LoginService loginService;
//
//        @Autowired
//        private RoleService roleService;
//
//        @Override
//        public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
//            String username = authentication.getName();
//            Login login = loginService.findByUsername(username).get();
//            return roleService.authorized(login.getId(), targetDomainObject.toString(), permission.toString());
//        }
//
//        @Override
//        public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
//            // not supported
//            return false;
//        }
//    }