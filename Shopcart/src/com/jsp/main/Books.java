package com.jsp.main;

public class Books implements Comparable {
	private String id = null; //图书编号
	private String name = null; //图书名称
	private float price = 0.00F; //图书价格
	private int number = 0; //图书数量
	public Books(String id , String name , float price , int number){
		this.id=id;
		this.name=name;
		this.price=price;
		this.number=number;
	}
	public String getId(){ //返回订购图书的编号id
		return this.id;
	}
	public String getName(){  //返回订购图书的名称
		return this.name;
	}
	public float getPrice(){  //返回订购图书的价格
		return this.price;
	}
	public int getNumber(){  //返回订购图书的数量
		return this.number;
	}
	public int compareTo(Object object){
		Books book = (Books) object;
		int compare = id.compareTo(book.id);
		return compare;
	}
}
