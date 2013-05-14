package com.unimedsci.edc.web.backend.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Sting
 * @created: 13-5-10 下午4:48
 */
@Controller
@RequestMapping("/member/*")
public class MemberController {

    @RequestMapping("list")
    public String list() {
        return "member/list";
    }
}
