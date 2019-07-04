package com.bufferedstream;
/*
 * 从键盘循环输入文本行，保存到磁盘文件中，直到输入“end”为止；再将文件的内容读出来并显示
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); //System.in是InputStream流，字节流
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("./buffer.txt"); //打开文本文件写
		BufferedWriter bw = new BufferedWriter(fw); //字符流转换为缓冲流
		String str;
		while (true) {
			str = br.readLine(); //从键盘读一行字符
			if (str.equals("end"))
				break;
			bw.write(str); //将读入的字符写入文件中
			bw.newLine(); //写 行分隔 符到文件中
		}
		bw.close();
		FileReader fr = new FileReader("./buffer.txt"); //打开文本文件读
		BufferedReader brn = new BufferedReader(fr); //字符流转换为缓冲流
		while ((str = brn.readLine()) != null) //从文件中读一行字符
			System.out.println(str);
		brn.close(); //关闭文件
	}

}
