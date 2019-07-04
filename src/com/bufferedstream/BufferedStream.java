package com.bufferedstream;
/*
 * �Ӽ���ѭ�������ı��У����浽�����ļ��У�ֱ�����롰end��Ϊֹ���ٽ��ļ������ݶ���������ʾ
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); //System.in��InputStream�����ֽ���
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("./buffer.txt"); //���ı��ļ�д
		BufferedWriter bw = new BufferedWriter(fw); //�ַ���ת��Ϊ������
		String str;
		while (true) {
			str = br.readLine(); //�Ӽ��̶�һ���ַ�
			if (str.equals("end"))
				break;
			bw.write(str); //��������ַ�д���ļ���
			bw.newLine(); //д �зָ� �����ļ���
		}
		bw.close();
		FileReader fr = new FileReader("./buffer.txt"); //���ı��ļ���
		BufferedReader brn = new BufferedReader(fr); //�ַ���ת��Ϊ������
		while ((str = brn.readLine()) != null) //���ļ��ж�һ���ַ�
			System.out.println(str);
		brn.close(); //�ر��ļ�
	}

}
