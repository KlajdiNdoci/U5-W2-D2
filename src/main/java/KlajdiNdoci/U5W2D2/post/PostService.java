package KlajdiNdoci.U5W2D2.post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return this.posts;
    }
}
