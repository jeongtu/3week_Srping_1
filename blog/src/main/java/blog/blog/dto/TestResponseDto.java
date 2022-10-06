package blog.blog.dto;

import blog.blog.entity.Test;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class TestResponseDto {
    @Getter
    public static class TestInfoDto {
        private final Long id;
        private final String title;
        private final String username;
        private final String content;
        private final LocalDateTime createdAt;
        private final LocalDateTime modifiedAt;

        public TestInfoDto(Test test){
            this.id = test.getId();
            this.title = test.getTitle();
            this.username = test.getUsername();
            this.content = test.getContent();
            this.createdAt = test.getCreatedAt();
            this.modifiedAt = test.getModifiedAt();
        }
    }
}