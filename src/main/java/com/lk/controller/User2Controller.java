//package com.lk.controller;
//
//import com.lk.UserEntity;
//import com.lk.mapper.UserMapper;
//import com.lk.mapper_ds2.UserMapper2;
//import com.lk.mapper_ds3.UserMapper3;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//@RestController
//@RequestMapping("/aspect")
////@PreAuthorize("hasRole('USER')")
//public class User2Controller {
//
//    @Autowired
//	private UserMapper userMapper;
//
//    @Autowired
//	private UserMapper2 userMapper2;
//
//    @Autowired
//	private UserMapper3 userMapper3;
//
//	@RequestMapping("/login")
//	public String  login(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("request = [" + request + "], response = [" + response + "]");
//
//        return "index.jsp";
//	}
//
//	@RequestMapping("/getUsers")
//	public List<UserEntity> getUsers() {
//		List<UserEntity> users=userMapper.getAll();
//		return users;
//	}
//
//
//
//    // http://localhost:8080/getUser?id=1
//    @RequestMapping("/getUser")
//    public UserEntity getUser(Long id) {
//    	UserEntity user=userMapper.getOne(id);
//        return user;
//    }
//
//    @RequestMapping("/add")
//    public void save(UserEntity user) {
//    	userMapper.insert(user);
//    }
//
//
//    @RequestMapping("/health")
//    public void health(UserEntity user) {
//        System.out.println("user = " + user);
//        System.out.println("UserController.health");
//    }
//
//    @RequestMapping(value="update")
//    public void update(UserEntity user) {
//    	userMapper.update(user);
//    }
//
//    @RequestMapping(value="/delete/{id}")
//    public void delete(@PathVariable("id") Long id) {
//    	userMapper.delete(id);
//    }
//
//
//    // http://localhost:8080/getLimitQuatoBaseInfo1?id=19000
//    @RequestMapping(value="/getLimitQuatoBaseInfo1")
//    public HashMap getLimitQuatoBaseInfo1(Long id) {
//        HashMap map = new HashMap();
//        map.put("userId", id);
////        String table = "P2P" + id/1000000 + ".tbLendIntent" + id/10000;
////        map.put("table", table);
//        map.put("schemeNum", id/1000000);
//        map.put("tableNum", id/10000);
//        HashMap limitQuatoBaseInfo1 = userMapper.getLimitQuatoBaseInfo1(map);
//        System.out.println("limitQuatoBaseInfo1 = " + limitQuatoBaseInfo1);
//
//        // #{schema, ,jdbcType=INTEGER}
//
//        return limitQuatoBaseInfo1;
//    }
//
//
//    // http://localhost:8080/getLimitQuatoBaseInfo2?id=1475102
//    @RequestMapping(value="/getLimitQuatoBaseInfo2")
//    public String  getLimitQuatoBaseInfo2(Long id) {
//
//        String  limitQuatoBaseInfo2 = userMapper2.getLimitQuatoBaseInfo2(id);
//        System.out.println("limitQuatoBaseInfo2 = " + limitQuatoBaseInfo2);
//        return limitQuatoBaseInfo2;
//    }
//
//
//    // http://localhost:8080/getLimitQuatoBaseInfo3?id=1265681
//    @RequestMapping(value="/getLimitQuatoBaseInfo3")
//    public Map getLimitQuatoBaseInfo3(Long id) {
//        HashMap map = new HashMap();
//        map.put("customer_id", id);
//        Map limitQuatoBaseInfo3 = userMapper3.getLimitQuatoBaseInfo3(id);
//        System.out.println("limitQuatoBaseInfo3 = " + limitQuatoBaseInfo3);
//
//        // #{schema, ,jdbcType=INTEGER}
//
//        return limitQuatoBaseInfo3;
//    }
//
//
//}