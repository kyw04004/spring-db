package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

/**
 * 인터페이스의 구현체에서 체크 예외를 던지려면
 * 인터페이스에서 예외를 던지는 부분을 선언해야 한다.
 * 인터페이스가 특정 기술에 종속적이므로 변경 요소가 생기므로 좋지 않다.
 */
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    void update(String memberId, int money) throws SQLException;
    void delete(String memberId) throws SQLException;
}
