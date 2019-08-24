package com.youngman.service;

import com.youngman.domain.Member;
import com.youngman.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * Created by YoungMan on 2019-08-23.
 */

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signUp(Member member) {
        return memberRepository.save(member).getId();
    }
}
