package low_level_design.stackoverflow.Service;

import low_level_design.stackoverflow.Models.Vote;
import low_level_design.stackoverflow.Repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote castVote(Vote vote) {
        return voteRepository.save(vote);
    }
}
//it can be loosely coupled with VoteServiceinterface