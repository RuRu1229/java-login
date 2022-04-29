package com.example.Web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Web.*;

//import io.javabrains.topic.Topic;

@Service
public class WebService {

	@Autowired
	private WebRepository webRepository;
	//@Autowired
//	private Web web;
	//@Autowired
//	private webDao webDao;
	
	/*private List<Web> topics= new ArrayList<>(Arrays.asList(
	new Web("Spring","SpringBoot"),
	new Web("java","javaScript"),
	new Web("C","C++"),
	));*/
	
	public List<Web> getAllUser(){
		List<Web> wb=new ArrayList<>();
		//List<Web> eb=(List<Web>) WR.findAll().forEach(wb::add);
		webRepository.findAll().forEach(wb::add);
		return wb;
	}
	public Optional<Web> getUser(String Username) {
		//String un=new String();
	//	Scanner user=new Scanner(System.in);
		//un=user.next();
		return webRepository.findById(Username);
	//	if(Username==un) {
		//	return "登入;
		//}
		//return WR.findById(Password);
	
	}

	/*public List<Web> login(String Username,String Password){
		if(getUser(Username).equals(getWord(Password))) {
		//登入成功
		//	return ;
		}
		else {
			//登入失敗
			//帳號或密碼輸入錯誤請重新嘗試
		}
	}*/
	public void addWeb(Web web) {
		webRepository.save(web);
	}
	
	public void putWeb(String username,Web web){
		webRepository.save(web);
	}
	
	
	public void deleteWeb(String username) {
		//	topics.removeIf(t->t.getId().equals(id));
			//return null;
		webRepository.deleteById(username);
		}
	
	public String showLogin() {
		return "login";
	}

	public String loging(Web web,String username,String password){
		Optional<Web> webOptional = webRepository.findById(username);
		//System.out.println(webOptional);
		//String web = webOptional.get().getUsername();
	//	System.out.println(web);
	//	System.out.print(pass);
//		Optional<Web> webOpti = webRepository.findById(password);
		System.out.print(username);
		System.out.println(password);
		if(webOptional.isPresent()/*return true;*/) {
			String pass= webOptional.get().getPassword();
			//String word=webRepository.hashCode(password);
	//		System.out.print(webOpti);
			if(pass.equals(password)) {
				
				return "HI";
			//
				}			
		}
		//if(web.getUsername()!=null ) {
	//	if(webOptional){
		//return "HI!";	
		//}	
	//	}
	//	if(webRepository.findById(username).equals(username)) {
			//return "HI";
	//	
		
		//return "HELLO";
	//	web=webRepository.findById(username);
		
		//if(web != null) {
		//return "clear";
	//	}
		return "HELLO";
	//	return null;
	}
}
	
	
	
	
	
	
	
	
/*	public Web FindName(String username,String password) {
return WD.findByUsernameAndpassword(username,password);
}
public void save(Web web) {
WD.save(web);
}*/

