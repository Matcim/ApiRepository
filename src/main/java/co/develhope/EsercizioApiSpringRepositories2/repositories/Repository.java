package co.develhope.EsercizioApiSpringRepositories2.repositories;


import co.develhope.EsercizioApiSpringRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path ="repo-program-languages",collectionResourceDescription =
@Description("this is description Programming-Language"),
        collectionResourceRel = "Programming-Language",itemResourceDescription = @Description("single item description"))
public interface Repository extends JpaRepository<ProgrammingLanguage,Long> {
}
