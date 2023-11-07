package KlajdiNdoci.U5W2D2.post;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return this.posts;
    }

    public Post save(Post body, @RequestParam()) {
        Random rndm = new Random();
        body.setId(rndm.nextLong());
        this.posts.add(body);
        return body;
    }
}
