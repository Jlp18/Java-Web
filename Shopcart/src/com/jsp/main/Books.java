package com.jsp.main;

public class Books implements Comparable {
	private String id = null; //ͼ����
	private String name = null; //ͼ������
	private float price = 0.00F; //ͼ��۸�
	private int number = 0; //ͼ������
	public Books(String id , String name , float price , int number){
		this.id=id;
		this.name=name;
		this.price=price;
		this.number=number;
	}
	public String getId(){ //���ض���ͼ��ı��id
		return this.id;
	}
	public String getName(){  //���ض���ͼ�������
		return this.name;
	}
	public float getPrice(){  //���ض���ͼ��ļ۸�
		return this.price;
	}
	public int getNumber(){  //���ض���ͼ�������
		return this.number;
	}
	public int compareTo(Object object){
		Books book = (Books) object;
		int compare = id.compareTo(book.id);
		return compare;
	}
}
