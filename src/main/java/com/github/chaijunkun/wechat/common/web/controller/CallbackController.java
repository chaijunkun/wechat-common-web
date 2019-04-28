package com.github.chaijunkun.wechat.common.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.chaijunkun.wechat.common.callback.WeChatCallbackDispatcher;
import com.github.chaijunkun.wechat.common.callback.WeChatCallbackException;
import com.github.chaijunkun.wechat.common.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 回调接口
 * @author chaijunkun
 * @since 2016年8月30日
 */
@Controller
public class CallbackController extends BaseController {

	@Autowired
	private WeChatCallbackDispatcher weChatCallbackDispatcher;

	@RequestMapping(value = "/callback")
	@ResponseBody
	@SuppressWarnings("unchecked")
	public String msg(HttpServletRequest request, HttpServletResponse response) throws WeChatCallbackException, IOException{
		return weChatCallbackDispatcher.dispatch(request.getParameterMap(), HttpUtil.readStream(request.getInputStream(), "UTF-8"));
	}

}
