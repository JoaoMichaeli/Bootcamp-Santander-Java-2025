package dao;

import exception.EmptyStorageException;
import exception.UserNotFoundException;
import model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model){
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model){
        var toUpdate = findById(model.getId());

        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void delete(final long id){
        var toDelete = findById(id);

        models.remove(toDelete);
    }

    public UserModel findById(final long id){
        verifyStorage();
        var message = String.format("Usuário com o id %s inexistente", id);

        return models.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll(){
        List<UserModel> result;

        try {
            verifyStorage();
            result = models;
        }catch (EmptyStorageException e){
            e.printStackTrace();
            result = new ArrayList<>();
        }
        return result;
    }

    private void verifyStorage(){
        if (models.isEmpty()) throw new EmptyStorageException("O armazenamento está vazio");
    }
}
