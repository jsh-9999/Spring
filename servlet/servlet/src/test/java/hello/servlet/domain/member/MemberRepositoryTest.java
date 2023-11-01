package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();
    @AfterAll
    void afterEach(){
        memberRepository.clearStore();
    }
    @Test
    public void save(){
        //given
        Member member = new Member("hello", 20);
        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isEqualTo(savedMember);
    }
    @Test
    void findAll(){
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result = memberRepository.findAll();

        //then

        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);
    }
}
