package com.github.chaijunkun.wechat.common.web.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.chaijunkun.wechat.common.WeChatAPIConfig;
import com.github.chaijunkun.wechat.common.api.access.TokenAPI;
import com.github.chaijunkun.wechat.common.web.define.ConstDefine;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 微信接入获取accessToken
 * @author chaijunkun
 * @since 2016年9月1日
 */
public class WeChatAccessTokenInterceptor implements HandlerInterceptor {
	
	/** 获取access_token的API */
	private TokenAPI tokenAPI;
	
	/** 微信api接入配置对象 */
	private WeChatAPIConfig config;
	
	/**
	 * 获取获取access_token的API
	 * @return 获取access_token的API
	 */
	public TokenAPI getTokenAPI() {
		return tokenAPI;
	}

	/**
	 * 设置获取access_token的API
	 * @param tokenAPI 获取access_token的API
	 */
	public void setTokenAPI(TokenAPI tokenAPI) {
		this.tokenAPI = tokenAPI;
	}

	/**
	 * 获取微信api接入配置对象
	 * @return 微信api接入配置对象
	 */
	public WeChatAPIConfig getConfig() {
		return config;
	}

	/**
	 * 设置微信api接入配置对象
	 * @param config 微信api接入配置对象
	 */
	public void setConfig(WeChatAPIConfig config) {
		this.config = config;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setAttribute(ConstDefine.G_WeChat_API_Token, tokenAPI.token());
		request.setAttribute(ConstDefine.G_WeChat_API_AppId, config.getAppId());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
	}
	
}
