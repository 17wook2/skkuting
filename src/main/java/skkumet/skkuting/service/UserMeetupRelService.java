package skkumet.skkuting.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skkumet.skkuting.domain.Meetup;
import skkumet.skkuting.domain.UserMeetupRel;
import skkumet.skkuting.dto.MeetupDto;
import skkumet.skkuting.dto.UserAccountDto;
import skkumet.skkuting.dto.UserMeetupRelDto;
import skkumet.skkuting.dto.constant.AuthorizingPolicy;
import skkumet.skkuting.repository.MeetupRepository;
import skkumet.skkuting.repository.UserMeetupRelRepository;
import skkumet.skkuting.util.SuccessResponse;

@RequiredArgsConstructor
@Transactional
@Service
public class UserMeetupRelService {

//    private final UserMeetupRelRepository userMeetupRelRepository;
//    private final MeetupRepository meetupRepository;
//
//    public SuccessResponse<Object> join(UserAccountDto userAccountDto, Long meetupId) {
//        Meetup meetup = meetupRepository.getReferenceById(meetupId);
//        boolean isallowed = true;
//        if (meetup.getAuthorizingPolicy().equals(AuthorizingPolicy.BY_HOST)) {
//            isallowed = false;
//        }
//        UserMeetupRelDto dto = UserMeetupRelDto.of(userAccountDto, MeetupDto.from(meetup), isallowed);
//        UserMeetupRel savedEntity = userMeetupRelRepository.save(dto.toEntity());
//        return SuccessResponse.builder()
//                .(201)
//                .content(UserMeetupRelDto.from(savedEntity))
//                .build();
//    }
}
