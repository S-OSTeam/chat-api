package sos.chat_api.domain.board.dto;

import org.springframework.web.multipart.MultipartFile;
import sos.chat_api.domain.community.entity.Community;

public class BoardDTO {

    private Long community_id;
    private Long category_id;
    private Long user_id;

    private String board_title;

    private String board_detail;

    private MultipartFile board_image;

}
