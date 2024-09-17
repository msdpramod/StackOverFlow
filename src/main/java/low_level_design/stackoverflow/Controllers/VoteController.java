package low_level_design.stackoverflow.Controllers;

import low_level_design.stackoverflow.Models.Vote;
import low_level_design.stackoverflow.Service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping
    public Vote castVote(@RequestBody Vote vote) {
        return voteService.castVote(vote);
    }
}