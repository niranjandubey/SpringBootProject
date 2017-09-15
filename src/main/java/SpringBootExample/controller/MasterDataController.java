package SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import SpringBootExample.modal.City;
import SpringBootExample.services.CityService;

@Controller
public class MasterDataController {
	@Autowired
	private CityService cityService;

	@GetMapping("/")
	@ResponseBody
	@Transactional(readOnly = true)
	public String helloWorld() {
		City city=cityService.getCity("Bath", "UK");
		if(city!=null){
			return city.getName();
		}
		return null;
	}
}
