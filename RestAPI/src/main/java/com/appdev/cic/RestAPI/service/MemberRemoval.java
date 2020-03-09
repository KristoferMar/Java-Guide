package com.appdev.cic.RestAPI.service;

import com.appdev.cic.RestAPI.model.Member;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

// The @Stateless annotation eliminates the need for manual transaction demarcation
@Stateless
public class MemberRemoval {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Member> memberEventSrc;

    public void remove(Member member) throws Exception {
        log.info("Removing " + member.getName());
        em.remove(member);
        memberEventSrc.fire(member);
    }
}
