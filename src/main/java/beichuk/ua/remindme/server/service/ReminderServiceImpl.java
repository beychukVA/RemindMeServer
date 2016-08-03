package beichuk.ua.remindme.server.service;

import beichuk.ua.remindme.server.entity.Remind;
import beichuk.ua.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService
{
    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll()
    {
        return repository.findAll();
    }

    public Remind getByID(long id)
    {
        return repository.findOne(id);
    }

    public Remind save(Remind remind)
    {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id)
    {
        repository.delete(id);
    }
}
