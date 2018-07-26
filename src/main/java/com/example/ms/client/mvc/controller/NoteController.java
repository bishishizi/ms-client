package com.example.ms.client.mvc.controller;

import com.example.ms.client.mvc.service.NoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 短信接口
 * @author wangwenchang
 * @date 2018/7/26 9:22
 */
@Api(tags = "短信接口")
@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/send/{phone}/{code}")
    @ApiOperation("短信发送")
    public String send(@PathVariable("phone") String phone ,@PathVariable("code") String code){
        String send = noteService.send(phone, code);
        return send;
    }
}
