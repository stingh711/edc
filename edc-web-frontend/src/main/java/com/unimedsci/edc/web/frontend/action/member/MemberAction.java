package com.unimedsci.edc.web.frontend.action.member;

import com.unimedsci.edc.core.member.Member;
import com.unimedsci.edc.core.member.MemberService;
import com.unimedsci.edc.web.frontend.action.BaseAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Sting
 * @created: 13-5-3 上午9:26
 */
public class MemberAction extends BaseAction {
    private static final Logger logger = LoggerFactory.getLogger(MemberAction.class);

    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    private MemberService memberService;

    public void setMemberService(MemberService service) {
        this.memberService = service;
    }

    public String toLogin() {
        logger.info("toLogin");
        System.out.println("toLogin");
        this.memberService.hello();
        this.member = new Member();
        this.member.setName("sting");
        return SUCCESS;
    }
}
