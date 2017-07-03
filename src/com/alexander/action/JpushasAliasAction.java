package com.alexander.action;
import com.alexanderwjz.serviceimpl.Jpush;
import com.alexanderwjz.serviceimpl.JpushImplService;
import com.alexanderwjz.utils.Encodingutf8;
import com.opensymphony.xwork2.ActionSupport;
	/**
	 * 
	 * @author alexanderwjz
	 * @email wjz@largedata.win
	 * @Function 极光消息之自定义消息推送
	 */
public class JpushasAliasAction extends ActionSupport {
	/*protected static final Logger LOG = LoggerFactory.getLogger(JpushAction.class);
	protected static final String APP_KEY = "c484cb39c93483e223e5942e";
	protected static final String MASTER_SECRET = "98fcdef43e044848a8f139a0";
	*/
	private static final long serialVersionUID = 1L;
	private  String usernameAsalias;
	private static String UserDefinedMessage;

	public String getUsernameAsalias() {
		return usernameAsalias;
	}

	public void setUsernameAsalias(String usernameAsalias) {
		this.usernameAsalias = usernameAsalias;
	}

	public static String getUserDefinedMessage() {
		return UserDefinedMessage;
	}

	@SuppressWarnings("static-access")
	public  void setUserDefinedMessage(String userDefinedMessage) {
		this.UserDefinedMessage = userDefinedMessage;
	}
	//Encodingutf8.getNewString(userDefinedMessage)
	// @Override
	public String PushMessagealias() throws Exception {
		try {
			System.out.println("usernameAsalias="+getUsernameAsalias()   +"UserDefinedMessage" +getUserDefinedMessage());
			JpushImplService ss=new JpushImplService();
			Jpush proxy=ss.getJpushImplPort();
			proxy.pushAsAliasUdM(getUsernameAsalias(), getUserDefinedMessage());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
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
	}

}
