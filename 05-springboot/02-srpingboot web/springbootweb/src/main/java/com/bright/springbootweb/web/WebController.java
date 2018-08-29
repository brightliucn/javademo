package com.bright.springbootweb.web;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bright.springbootweb.domain.User;

/**
 * 
 * @author lzh
 * {@link} | http://www.iteye.com/news/32657
 *
 */
@RestController
public class WebController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "test";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1(String name) {
		return "test:" + name;
	}
	
	@RequestMapping(value = "/test2/{name}", method = RequestMethod.GET)
	public String test2(@PathVariable(value = "name") String name) {
		return "test:" + name;
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public User test3() {
		User user = new User();
		user.setAge(100);
		user.setName("Tom");
		user.setId(1);
		return user;
	}	
	
	
    @RequestMapping(value = {  
            "/page",  
            "page*",  
            "view/*",
            "**/msg"  
        })  
    String indexMultipleMapping() {  
        return "Hello from index multiple mapping.";  
    } 
    
    @RequestMapping(value = "/name")  
    String getName(@RequestParam(value = "person", required = false) String personName) {  
        return "Required element of request param";  
    } 
    
    @RequestMapping(value = "/name2")  
    String getName2(@RequestParam(value = "person", defaultValue = "John") String personName) {  
        return "Required element of request param";  
    }  
    
    
    @RequestMapping(method = RequestMethod.GET)  
    String get() {  
        return "Hello from get";  
    }  
    @RequestMapping(method = RequestMethod.DELETE)  
    String delete() {  
        return "Hello from delete";  
    }  
    @RequestMapping(method = RequestMethod.POST)  
    String post() {  
        return "Hello from post";  
    }  
    @RequestMapping(method = RequestMethod.PUT)  
    String put() {  
        return "Hello from put";  
    }  
    @RequestMapping(method = RequestMethod.PATCH)  
    String patch() {  
        return "Hello from patch";  
    } 
}
