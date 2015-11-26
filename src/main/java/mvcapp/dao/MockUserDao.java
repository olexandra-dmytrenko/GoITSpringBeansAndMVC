package mvcapp.dao;

import mvcapp.model.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Oleksandra_Dmytrenko on 11/25/2015.
 */
public class MockUserDao {
    private Map<Long, User> users = new HashMap<Long, User>();
    // An AtomicLong is used in applications such as atomically incremented sequence numbers,
    // and cannot be used as a replacement for a Long.
    private AtomicLong sequence = new AtomicLong(0);

    public MockUserDao() {
        saveUser(new User("john", "John Smith", "jsmith@mail.com", new Date(), true));
        saveUser(new User("steve", "Steve Brown", "sbrown@mail.com", new Date(), true));
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());
    }

    public User findUserById(Long id) {
        return users.get(id);
    }

    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(sequence.getAndIncrement());
        }
        users.put(user.getId(), user);
        return user;
    }
}
