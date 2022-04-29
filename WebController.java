package com.example.Web;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

//import com.example.Web.Web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	private WebService webService;
	
	@GetMapping("/Web")
	public List<Web> getAllUser() {
		return webService.getAllUser();
	}
	@GetMapping("/Web/{username}")
	public Optional<Web> getUser(@PathVariable String username) {
		return webService.getUser(username);
	}
	//public String login(String username) {
		
//		return "HI";
//	}
//	public 
	@PostMapping("/Web")
	public void addWeb(@RequestBody Web web) {
		webService.addWeb(web);
	}
	@PutMapping("/Web/{username}")
	public void putWeb(@RequestBody Web web,@PathVariable String username) {
		webService.putWeb(username,web);
		}
	@DeleteMapping("/Web/{username}")
	public void deleteWeb(@PathVariable String username) {
		webService.deleteWeb(username);
	}
//	@GetMapping("/Web/login")
//	public String showLogin() {
	//	return webService.showLogin();
		//webService.showLogin();
//	}
	@GetMapping("/Web/login/{username}")
	//@ResponseBody
	public String loging(@RequestBody Web web,@PathVariable String username,@RequestParam("password") String password){
		return webService.loging(web,username,password);//(username,password);
	}
	
}

	



	
	
	



/*public String login(String username,String password) {
String username=request.getParameter("username");
String password=request.getParameter("password");
String check=request.getParameter("check");
if(password.equals(check)) {
	if(getUsername(username)==true) {
		Web wb=new Web();
		wb.getUsername(username);
		wb.getPassword(password);
		WS.save(web);
		return "login";
	}
	else {
		return "register";
	}
}
public Boolean getUsername(String username) {
	Boolean a=true;
	if(WS.getUser(username).isEmpty()) {
		return a;
	}
	else {
		return false;
	}
}
//return
}*/
	
	
	

