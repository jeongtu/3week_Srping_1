package blog.blog.controller;

import blog.blog.dto.TestRequestDto;
import blog.blog.dto.TestResponseDto;
import blog.blog.service.TestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Test;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestService testService;


    // 전체 게시글 목록 조회 (GET)
    @GetMapping("/api/test")
    public List<TestResponseDto.TestInfoDto> getTest(){
        return testService.getTests();
    }

    // 게시글 작성 (POST)
    @PostMapping("/api/test")
    public TestResponseDto.TestInfoDto postTest (@RequestBody TestRequestDto.TestResistDto testResistDto){
        return testService.postTest(testResistDto);
    }

    // 게시글 조회 (GET)
    @GetMapping("/api/test/{id}")
    public TestResponseDto.TestInfoDto getTestOne(@PathVariable Long id){
        return testService.getTestOne(id);
    }

    // 게시글 비밀번호 확인 (GET)
    @GetMapping("/api/test/{id}/{password}")
    public boolean getTestPassword(@PathVariable Long id, @PathVariable String password){
        return testService.checkPassword(id, password);
    }

    // 게시글 수정 (PUT)
    @PutMapping("/api/test/{id}")
    public Long updateTest(@PathVariable Long id, @RequestBody TestRequestDto.TestResistDto testResistDto){
        testService.updateTest(id, testResistDto);
        return id;
    }

    // 게시글 삭제 (DELETE)
    @DeleteMapping("/api/test/{id}")
    public Long deleteTest(@PathVariable Long id){
        return testService.deleteTest(id);
    }
}