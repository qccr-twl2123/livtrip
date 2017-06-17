package com.livtrip.web.mapper;

import com.livtrip.web.domain.Member;
import com.livtrip.web.domain.MemberCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Member, MemberCriteria, Integer> {
}