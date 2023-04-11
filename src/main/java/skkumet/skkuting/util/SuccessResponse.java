package skkumet.skkuting.util;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
//@Builder
public class SuccessResponse<T> {

    private Integer status;
    private T content;
    private String description;

    public SuccessResponse(SuccessCode code, T content) {
        this.status = code.getStatus();
        this.content = content;
        this.description = code.getDescription();
    }

    @Getter
    public static enum SuccessCode {
        SUCCESS_POST_USERMEETUP(201,"모임 참여 요청에 성공했습니다.");

        private Integer status;
        private String description;

        SuccessCode(Integer status, String description) {
            this.status = status;
            this.description = description;
        }
    }

}
