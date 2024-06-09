package org.example.springvue1.controller;



import org.example.springvue1.entity.Com;
import org.example.springvue1.repository.ComRepository;
import org.example.springvue1.entity.Com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Com")
public class ComHandler {
    @Autowired
    private ComRepository comRepository;

    @GetMapping("/findAll")
    public List<Com> findAll() {
        return comRepository.findAll();
    }

    @PostMapping("/addCom")
    public ResponseEntity<Com> addCom(@RequestBody Com com) {
        // 这里实现添加学生的逻辑，比如将学生信息保存到数据库中
        Com savedCom = comRepository.save(com);
        return ResponseEntity.ok(savedCom);
    }
}
