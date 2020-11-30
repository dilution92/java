package com.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22 {
	public static void main(String[] args) throws IOException {
		
        System.out.print("숫자를 입력하세요 : ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int num = Integer.parseInt(str);
        
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        
        System.out.println("1부터 " + num + " 까지의 합은 " + sum + " 입니다.");
	}
}

