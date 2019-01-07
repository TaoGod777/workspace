package cn.tedu.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ajax.entity.ResponseResult;
import cn.tedu.ajax.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@PostMapping("/reg.do")
	@ResponseBody
	public ResponseResult handleReg(User user){
		ResponseResult rr = new ResponseResult();
		rr.setState(1);
		rr.setMessage("ע��ɹ�!");
		return rr;
	}
	
	@PostMapping("/login.do")
	@ResponseBody
	public ResponseResult handleLogin(String username,String password) {
		ResponseResult rr = new ResponseResult();
		if ("fangtao".equals(username)) {
			if ("123".equals(password)) {
				rr.setState(1);
				rr.setMessage("��¼�ɹ���");
			} else {
				rr.setState(3);
				rr.setMessage("��¼ʧ�ܣ��������");
			}
		} else {
			rr.setState(2);
			rr.setMessage("��¼ʧ�ܣ������Ե�¼���û��������ڣ�");
		}
		return rr;
	}
}








