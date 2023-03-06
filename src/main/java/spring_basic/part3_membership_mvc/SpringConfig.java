package spring_basic.part3_membership_mvc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_basic.part3_membership_mvc.repository.MemberRepository;
import spring_basic.part3_membership_mvc.repository.MemoryMemberRepository;
import spring_basic.part3_membership_mvc.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
