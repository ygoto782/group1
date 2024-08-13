package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class SearchController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/search01")
    public String search(Model model) {
        String sql = "SELECT * FROM taskdb";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        model.addAttribute("taskList", list);
        return "search01";
    }
    
 
}