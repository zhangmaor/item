package com.ezd.utils;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 短信接口的实现
 *
 */
public class Sendsms {
	private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";

	/**
	 * 实现短信的验证
	 * @param phone 传入的参数为接受短信的手机号
	 * @return   返回的结果只就是得出的验证码
	 */
	public int getnote(String phone){
		/*获取配置文件里的参数*/
		GetResources getResources = new GetResources();
		Map<String,String> resourcesMap = getResources.loads("propertiesResoutces/note","account","password");

		String account = resourcesMap.get("account");
		String password = resourcesMap.get("password");
		System.out.println("account="+account);
		System.out.println("password="+password);

		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

		int mobile_code = (int)((Math.random()*9+1)*100000);

		String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

		NameValuePair[] data = {//提交短信
				new NameValuePair("account", account), //查看用户名请登录用户中心->验证码、通知短信->帐户及签名设置->APIID
				new NameValuePair("password", password),  //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
				//new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
				new NameValuePair("mobile", phone),
				new NameValuePair("content", content),
		};
		method.setRequestBody(data);

		try {
			client.executeMethod(method);

			String SubmitResult =method.getResponseBodyAsString();

			//System.out.println(SubmitResult);

			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();

			String code = root.elementText("code");
			String msg = root.elementText("msg");
			String smsid = root.elementText("smsid");

			System.out.println(code);
			System.out.println(msg);
			System.out.println(smsid);

			if("2".equals(code)){
				System.out.println("短信提交成功");
			}

		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return mobile_code;
	}
//	public static void main(String [] args) {
//
//		HttpClient client = new HttpClient();
//		PostMethod method = new PostMethod(Url);
//
//		client.getParams().setContentCharset("GBK");
//		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");
//
//		int mobile_code = (int)((Math.random()*9+1)*100000);
//
//		String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");
//
//		NameValuePair[] data = {//提交短信
//				new NameValuePair("account", "C55197158"), //查看用户名请登录用户中心->验证码、通知短信->帐户及签名设置->APIID
//				new NameValuePair("password", "9d6e5795028e00b820f4125b3373f4c1"),  //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
//				//new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
//				new NameValuePair("mobile", "13620463438"),
//				new NameValuePair("content", content),
//		};
//		method.setRequestBody(data);
//
//		try {
//			client.executeMethod(method);
//
//			String SubmitResult =method.getResponseBodyAsString();
//
//			//System.out.println(SubmitResult);
//
//			Document doc = DocumentHelper.parseText(SubmitResult);
//			Element root = doc.getRootElement();
//
//			String code = root.elementText("code");
//			String msg = root.elementText("msg");
//			String smsid = root.elementText("smsid");
//
//			System.out.println(code);
//			System.out.println(msg);
//			System.out.println(smsid);
//
//			if("2".equals(code)){
//				System.out.println("短信提交成功");
//			}
//
//		} catch (HttpException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//	}

}