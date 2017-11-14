package com.java.programs;

import java.net.MalformedURLException;
import java.net.URL;

public class getURLAndHostName {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.moneycontrol.com/");
		System.out.println("Current URL : "+url);
		System.out.println("Host Name : "+url.getHost());
		System.out.println("getUserInfo : "+url.getUserInfo());
		System.out.println(url.getRef());
	}
}
