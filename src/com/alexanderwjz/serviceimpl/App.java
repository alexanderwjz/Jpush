package com.alexanderwjz.serviceimpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JpushImplService jim=new JpushImplService();
		Jpush proxy=jim.getJpushImplPort();
		proxy.pushAllNotice("ÄãºÃ");
		proxy.pushAsAliasUdM("test", "123");;
		
	}

}
