package com.example.testprj.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
	@GetMapping("/api/test")
	public String TestMethod(@RequestParam(defaultValue = "1") Integer param) {
		if (param == 1) {
			log.info("호출 1 info##########################");
		} else if (param == 2) {
			log.error("호출 2 error#######################");
		} else {
			log.debug("호출 3 debug########################");
		}

		return "<h1>aws v1</h1>";
	}
}
