package com.github.noticeboard.service.mapper;

import com.github.noticeboard.repository.commentLikes.CommentLikesEntity;
import com.github.noticeboard.web.dto.Like;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-31T00:26:15+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17 (Oracle Corporation)"
)
public class CommentLikesMapperImpl implements CommentLikesMapper {

    @Override
    public CommentLikesEntity LikeToCommentLikesEntity(Like like) {
        if ( like == null ) {
            return null;
        }

        CommentLikesEntity.CommentLikesEntityBuilder commentLikesEntity = CommentLikesEntity.builder();

        commentLikesEntity.commentId( like.getCommentId() );
        commentLikesEntity.userId( like.getUserId() );

        return commentLikesEntity.build();
    }
}
