//package com.masaischool.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import com.masaischool.entity.Member;
//
//public interface MemberRepository extends JpaRepository<Member, Integer> {
//
//	@Query("SELECT m FROM Member m JOIN m.user u WHERE u.aadharNo=:aadharN")
//	public Optional<Member> findByAadharNo(String aadharN);
//
//	@Query("SELECT m FROM Member m JOIN m.user u WHERE u.panNo=:panNo")
//	public Optional<Member> findByPanNo(String panNo);
//}
