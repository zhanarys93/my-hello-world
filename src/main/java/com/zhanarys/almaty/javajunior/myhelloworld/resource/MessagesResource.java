package com.zhanarys.almaty.javajunior.myhelloworld.resource;



import com.zhanarys.almaty.javajunior.myhelloworld.mapper.MessagesMapper;
import com.zhanarys.almaty.javajunior.myhelloworld.model.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RestController
@Controller
//@RequestMapping("/")
public class MessagesResource {

    /*public MessagesResource(MessagesMapper messagesMapper) {
        this.messagesMapper = messagesMapper;
    }*/
    @Autowired
    private MessagesMapper messagesMapper;



    @RequestMapping("/")

    public String getAll(Model model) {



     List<Messages> messages = messagesMapper.findAll();

        model.addAttribute("appName",messages.get(0).getMessage());
   //return messagesMapper.findAll();

   return "home";




   }

    @ResponseBody
    @RequestMapping(value="/message",method = RequestMethod.GET)
    public String Greeting(){
        List<Messages> messages = messagesMapper.findAll();
        return messages.get(0).getMessage();
    }




}
