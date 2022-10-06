package blog.blog.dto;

import lombok.Getter;



public class TestRequestDto {

    @Getter
    public static class TestResistDto {
        private String title;
        private String username;
        private String password;
        private String content;

    }

}