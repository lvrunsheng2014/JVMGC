package com.lv.jvm;

import java.util.ArrayList;
import java.util.List;

public class jvmTest {
	byte[] b=new byte[1*1024*1024];//mbwww
	public static void main(String[] args) {
		List<jvmTest> list=new ArrayList<jvmTest>();
		int count=0;
		try {
			while(true) {
				list.add(new jvmTest());
				count=count+1;
			}
		} catch (Throwable e) {
		
			System.out.println("****************count:"+count);
			e.printStackTrace();
			
		}

		
	}
}
