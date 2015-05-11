package com.dream.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
//        try {
//            Scanner in = new Scanner(new File("h:/2.txt"));
//  
//            while (in.hasNextLine()) {
//                String str = in.nextLine();
//               // splitt(str);
//                System.out.println(str);
//              // System.out.println("private String "+str+";");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    	
    	try {
            String encoding="gbk";
            File file=new File("h:/colum.txt");
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                	 String[] abc = lineTxt.split("[\\p{Space}]+");
                	 String zhushi = "/*"+abc[0]+"*/";
                	 String name = "private String "+abc[1]+";";
                      System.out.println(zhushi);
                      System.out.println(name);
                      System.out.println("\r\n");
                    
                }
                read.close();
    }else{
        System.out.println("找不到指定的文件");
    }
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
    }
    }
     
    public static String[] splitt(String str){
        String strr = str.trim();
        String[] abc = strr.split("[\\p{Space}]+");
        String str1 = abc[0];
        String str2 = abc[1];
        System.out.println(str1);
        System.out.println(str2);
        return abc;
    }
     
}