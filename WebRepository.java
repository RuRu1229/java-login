package com.example.Web;

import org.springframework.data.repository.CrudRepository;

public interface WebRepository extends CrudRepository<Web,String> {
//裡面有GET　delete set count find save功能
	
}
