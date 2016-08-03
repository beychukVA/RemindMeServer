package beichuk.ua.remindme.server.repository;

import beichuk.ua.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long>
{

}
