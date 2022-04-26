package com.yesol.book.springboot.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //1.
@EntityListeners(AuditingEntityListener.class) //2. Auditing 기능
public abstract class BaseTimeEntity {
    @CreatedDate //3. Entity가 생성되어 저장될 떄 시간이 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate //4.Entity가 변경되어 저장될 떄 시간이 자동 저장
    private LocalDateTime modifiedDate;
}
