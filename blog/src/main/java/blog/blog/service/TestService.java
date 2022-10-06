package blog.blog.service;

import blog.blog.dto.TestResponseDto;
import blog.blog.entity.Test;
import blog.blog.repository.TestRepository;
import blog.blog.dto.TestRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TestService {
    private final TestRepository testRepository;
    // 전체 게시글 목록 조회 (GET)
    @Transactional
    public List<TestResponseDto.TestInfoDto> getTests(){
        List<Test> tests = testRepository.findAllByOrderByModifiedAtDesc();
        List<TestResponseDto.TestInfoDto> lists = new ArrayList<>();

        for (Test test : tests) {
            lists.add(new TestResponseDto.TestInfoDto(test));
        }
        return lists;
    }

    // 게시글 작성 (POST)
    @Transactional
    public TestResponseDto.TestInfoDto postTest(TestRequestDto.TestResistDto testResistDto){
        // 완전한 데이터 저장후
        Test savedTest = testRepository.save(new Test(testResistDto));

        // response 반환
        return new TestResponseDto.TestInfoDto(savedTest);
    }

    // 게시글 조회 (GET)
    @Transactional
    public TestResponseDto.TestInfoDto getTestOne(Long id){
        Test test = testRepository.findById(id).get();
        return new TestResponseDto.TestInfoDto(test);
    }

    // 게시글 비밀번호 확인 (GET)
    @Transactional
    public boolean checkPassword(Long id, String password){
        Test test = testRepository.findById(id).get();
        if (!test.getPassword().equals(password)) {
            return false;
        }
        return true;
    }

    // 게시글 수정 (PUT)
    @Transactional
    public void updateTest(Long id, TestRequestDto.TestResistDto testResistDto){
        Test test = testRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        test.updateTest(testResistDto);
        testRepository.save(test);
    }

    // 게시글 삭제 (DELETE)
    @Transactional
    public Long deleteTest(Long id){
        testRepository.deleteById(id);
        return id;
    }
}