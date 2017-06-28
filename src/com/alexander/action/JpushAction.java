package com.alexander.action;

import com.alexanderwjz.serviceimpl.JpushAll;
import com.alexanderwjz.serviceimpl.JpushAllImplService;
import com.opensymphony.xwork2.ActionSupport;

import cn.jiguang.common.ServiceHelper;
import cn.jiguang.common.connection.NativeHttpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
	/**
	 * 
	 * @author alexanderwjz
	 * @email wjz@largedata.win
	 * @Function 极光消息之自定义消息推送
	 */
public class JpushAction extends ActionSupport {
	/*protected static final Logger LOG = LoggerFactory.getLogger(JpushAction.class);
	protected static final String APP_KEY = "c484cb39c93483e223e5942e";
	protected static final String MASTER_SECRET = "98fcdef43e044848a8f139a0";
	*/
	private static  String message;
	private static final long serialVersionUID = 1L;
	
	public static String getMessage() {
		return message;
	}
	@SuppressWarnings("static-access")
	public void setMessage(String message) {
		this.message = message;
	}
	// @Override
	public String PushMessage() throws Exception {
		JpushAllImplService ss=new JpushAllImplService();
		JpushAll proxy=ss.getJpushAllImplPort();
		proxy.push(getMessage());
		
		/*// TODO Auto-generated method stub
		System.out.println(getMessage());
		ClientConfig clientConfig = ClientConfig.getInstance();
		final JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY,
				null, clientConfig);
		String authCode = ServiceHelper.getBasicAuthorization(APP_KEY,
				MASTER_SECRET);
		NativeHttpClient httpClient = new NativeHttpClient(authCode, null,
				clientConfig);
		jpushClient.getPushClient().setHttpClient(httpClient);
		final PushPayload payload = buildPushObject_all_all_alert();
		try {
			PushResult result = jpushClient.sendPush(payload);
			LOG.info("Got result - " + result);
				return SUCCESS;
			} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
			LOG.error("Sendno: " + payload.getSendno());
				return ERROR;
			} catch (APIRequestException e) {
			LOG.error(
					"Error response from JPush server. Should review and fix it. ",
					e);
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			LOG.error("Sendno: " + payload.getSendno());
				return ERROR;
		}
				
	}*/

		/*public static PushPayload buildPushObject_all_all_alert() {		
					return PushPayload.newBuilder()
					.setPlatform(Platform.all())
					.setAudience(Audience.all())
					.setMessage(Message.content(getMessage())).build();
		}*/
		return SUCCESS;
	}

}
