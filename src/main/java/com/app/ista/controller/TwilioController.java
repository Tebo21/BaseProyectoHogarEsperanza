package com.app.ista.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.ista.model.Smsrequest;
import com.app.ista.service.Smsservice;
import com.twilio.exception.ApiException;


@RestController
@RequestMapping("/sms")
@CrossOrigin(origins= "*")
public class TwilioController {

	@Autowired
   private Smsservice smsservice;
	
   @PostMapping("/sendmessage")
   public ResponseEntity<Object> sendmessage(@RequestBody Smsrequest smsrequest)
   {
	   String status=smsservice.sendsms(smsrequest);
	   if("sent".equals(status)||"queued".equals(status))
       {
       	return new ResponseEntity<Object>("sent successfully",HttpStatus.OK);
       }
	   return new ResponseEntity<Object>("failed to send message",HttpStatus.NOT_FOUND);
   }	
}
