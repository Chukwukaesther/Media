package Data.Repositories;

import Data.Models.Post;

public interface PostRepositery {

    void postSave(Post post);
    Post findById(int id);
    short deleteById(int id);
    void deleteAll();
    int count();

}

