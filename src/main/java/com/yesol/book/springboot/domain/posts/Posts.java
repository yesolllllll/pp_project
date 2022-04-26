package com.yesol.book.springboot.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //6. lombok (클래스 내 모든 필드의 Getter 메소드 자동생성)
@NoArgsConstructor //5. lombok (기본 생성자 자동 추가)
@Entity //1. JPA (주요 어노테이션이라 클래스 가까이 위치 → 테이블과 링크될 클레스 네임 , 절대 Setter 메소드 만들지 x )
public class Posts  extends BaseTimeEntity{

    @Id //2. 해당 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //3. PK 생성 규칙 < GenerationType.IDENTITY : auto_increment >
    private Long id;

    @Column(length = 500, nullable = false) //4. 굳이 선언하지 않아도 괜찮, 기본값외에 추가로 설정할 부분이있을 경우 추가 <타입 변경 등>
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //7. 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
