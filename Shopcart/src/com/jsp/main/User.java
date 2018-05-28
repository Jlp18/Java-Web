package com.jsp.main;

public class User {
		private String username;  //用户名
        private String password;  //密码
        private String email;  //email
        private String truename;  //姓名
        private String address;  //地址
        private String postcode;  //邮编
        private String telephone;  //联系方式
        
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
