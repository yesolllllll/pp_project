package com.yesol.book.springboot.service.posts;


import com.yesol.book.springboot.domain.posts.Posts;
import com.yesol.book.springboot.domain.posts.PostsRepository;
import com.yesol.book.springboot.web.dto.PostsResponseDto;
import com.yesol.book.springboot.web.dto.PostsSaveRequestDto;
import com.yesol.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional //insert
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional //update
    public Long update(Long id, PostsUpdateRequestDto requestDto){

        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return  id;
    }

    public PostsResponseDto findById (Long id){

        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return  new PostsResponseDto(entity);
    }

}
