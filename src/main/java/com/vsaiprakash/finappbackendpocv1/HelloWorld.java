package com.vsaiprakash.finappbackendpocv1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorld {
  
  @GetMapping("/hello")
  String getHelloWorldMessage() {
    
    return "Hello World !!";
  }

}
