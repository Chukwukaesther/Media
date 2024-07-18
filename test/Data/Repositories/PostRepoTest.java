package Data.Repositories;

import Data.Models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepoTest {
    @Test
    public void testThatPostCanSave() {
        PostRepo postRepo = new PostRepo();
        Post post = new Post();
        post.setId(4);
        post.setTitle("Test Title");
        postRepo.postSave(post);
        assertEquals(1, postRepo.count());

    }
        @Test
    public void testThatThePostSaveMethodCanSaveTwoPost() {
        PostRepo postRepo = new PostRepo();
        Post post = new Post();
        post.setId(4);
        post.setTitle("Test Title");
        postRepo.postSave(post);
        post.setId(5);
        post.setTitle("Talkshow");
        postRepo.postSave(post);
        assertEquals(2, postRepo.count());


        }

        @Test
    public void testToFindPostById() {
        PostRepo postRepo = new PostRepo();
        Post post = new Post();
        post.setId(4);
        post.setTitle("Test Title");
        postRepo.postSave(post);
        postRepo.findById(4);
        assertEquals(post, postRepo.findById(4));

        }

        @Test
    public void testThatPostCanDeleteById() {
        PostRepo postRepo = new PostRepo();
        Post post = new Post();
        post.setId(4);
        post.setTitle("Test Title");
        postRepo.postSave(post);
        postRepo.deleteById(4);
        assertEquals(2, post.deleteById(4));

        }




}