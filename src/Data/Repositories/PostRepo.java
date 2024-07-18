package Data.Repositories;

import Data.Models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepo implements PostRepositery {
    List<Post> findAll = new ArrayList<Post>();
    private int count;

    @Override
    public void postSave(Post post) {
        findAll.add(post);
        count++;
    }

    @Override
    public Post findById(int id) {
        for (Post post : findAll) {
            if (id == post.getId()){

            return post;
            }
        }

        return null;

    }

    @Override
    public void deleteById(int id) {
        for (Post post : findAll) {
            if (id == post.getId()) {
                findAll.remove(id);


            }
        }


    }

    @Override
    public void deleteAll() {



    }

    @Override
    public int count() {
        return count;

    }
}