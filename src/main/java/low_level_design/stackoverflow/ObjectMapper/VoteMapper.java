package low_level_design.stackoverflow.ObjectMapper;

import low_level_design.stackoverflow.DTOs.VoteDTO;
import low_level_design.stackoverflow.Models.Vote;

public class VoteMapper {
    public static VoteDTO toDTO(Vote vote) {
        VoteDTO dto = new VoteDTO();
        dto.setId(vote.getId());
        dto.setUpvote(vote.isUpvote());
        dto.setUserId(vote.getUser().getId());
        if (vote.getQuestion() != null) {
            dto.setQuestionId(vote.getQuestion().getId());
        }
        if (vote.getAnswer() != null) {
            dto.setAnswerId(vote.getAnswer().getId());
        }
        return dto;
    }

    public static Vote toEntity(VoteDTO dto) {
        Vote vote = new Vote();
        vote.setId(dto.getId());
        vote.setUpvote(dto.isUpvote());
        return vote;
    }
}