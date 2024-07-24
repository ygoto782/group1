package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController05 {
    @Autowired
    private MemberRepository memberRepository;
    @RequestMapping("/db01")
    public String db01(Model m) {
        List<Member> member = memberRepository.findAll();
        m.addAttribute("member",member);
        return "db01";
    }
    @RequestMapping("/db02")
    public String db02(Model m) {
        Member member = null;
        Optional<Member> record =
        memberRepository.findById(10004);
        if(!record.isEmpty()) {
            member = record.get();
        }
        m.addAttribute("member",member);
        return "db02";
    }

    @RequestMapping("/db03")
    public String db03(Model m) {
        Member member = new Member();
        member.setId(10006);
        member.setName("中本四郎");
        member.setPassword("abc");
        memberRepository.saveAndFlush(member);
        m.addAttribute("msg","正常に登録が完了しました");
        return "db03";
    }

    @RequestMapping("/db04")
    public String db04(Model m) {
        Member member = new Member();
        member.setId(10006);
        member.setName("中本四郎");
        member.setPassword("def");
        memberRepository.saveAndFlush(member);
        m.addAttribute("msg","正常に変更が完了しました");
        return "db03";
    }

    @RequestMapping("/db05")
    public String db05(Model m) {
        Member member = new Member();
        member.setId(10006);
        member.setName("中本四郎");
        member.setPassword("def");
        memberRepository.delete(member);
        m.addAttribute("msg","正常に削除が完了しました");
        return "db03";
    }

}