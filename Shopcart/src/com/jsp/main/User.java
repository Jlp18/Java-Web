package com.jsp.main;

public class User {
		private String username;  //�û���
        private String password;  //����
        private String email;  //email
        private String truename;  //����
        private String address;  //��ַ
        private String postcode;  //�ʱ�
        private String telephone;  //��ϵ��ʽ
        
        public void setUsername(String name){
        	this.username = name;
        }
        public void setPassword(String pwd){
        	this.password = pwd;
        }
        public void setEmail(String em){
        	this.email = em;
        }
        public void setTruename(String Tname){
        	this.truename = Tname;
        }
        public void setAddress(String add){
        	this.address = add;
        }
        public void setPostcode(String post){
        	this.postcode = post;
        }
        public void setTelephone(String tel){
        	this.telephone = tel;
        }
        
        public String getUsername(){
        	return this.username;
        }
        public String getPassword(){
        	return this.password;
        }
        public String getEmail(){
        	return this.email;
        }
        public String getTruename(){
        	return this.truename;
        }
        public String getAddress(){
        	return this.address;
        }
        public String getPosecode(){
        	return this.postcode;
        }
        public String getTelephone(){
        	return this.telephone;
        }
}
