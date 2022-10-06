package blog.blog.entity;

import blog.blog.dto.TestRequestDto;
import blog.blog.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
public class Test extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String content;

    public Test(TestRequestDto.TestResistDto testResistDto) {
        this.title = testResistDto.getTitle();
        this.username = testResistDto.getUsername();
        this.password = testResistDto.getPassword();
        this.content = testResistDto.getContent();
    }

    public void updateTest(TestRequestDto.TestResistDto testResistDto) {
        this.title = testResistDto.getTitle();
        this.username = testResistDto.getUsername();
        this.password = testResistDto.getPassword();
        this.content = testResistDto.getContent();
    }
}