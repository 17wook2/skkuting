package skkumet.skkuting.dto;

import skkumet.skkuting.domain.UserAccount;
import skkumet.skkuting.domain.UserMeetupRel;

import java.time.LocalDateTime;

public record UserMeetupRelDto(Long id, UserAccountDto userAccountDto, MeetupDto meetupdto,
        boolean isAllowed, LocalDateTime createdAt, LocalDateTime modifiedAt, String createdBy,
        String modifiedBy) {

    public static UserMeetupRelDto of(UserAccountDto userAccountDto, MeetupDto meetupdto, boolean isAllowed) {
        return new UserMeetupRelDto(null, userAccountDto, meetupdto, isAllowed, null, null, null, null);
    }

//    public static UserMeetupRelDto from(UserMeetupRel entity) {
//        return UserMeetupRelDto.of(
//                UserAccountDto.from(entity.getUserAccount()),
//
//        )
//
//    }


    public UserMeetupRel toEntity() {
        return UserMeetupRel.builder()
                .userAccount(UserAccountDto.toEntity(userAccountDto()))
                .meetup(meetupdto.toEntity())
                .isAllowed(isAllowed)
                .build();
    }
}
