package org.example;

import javax.persistence.EntityManager;
import java.util.List;

public class GenreRepository {
    private EntityManager em;

    public GenreRepository(EntityManager em) {
        this.em = em;
    }

    public EntityManager getEm() {
        return em;
    }

    public void create(Genre genre) {
        getEm().getTransaction().begin();
        getEm().persist(genre);
        getEm().getTransaction().commit();
    }

    public Genre findById(Long id) {
        return getEm().find(Genre.class, id);
    }

    public List<Genre> findByName(String name) {
        return getEm().createNamedQuery("Genre.findByName")
                .setParameter("name", name)
                .getResultList();
    }
}
//
//package org.example;
//
//        import javax.persistence.EntityManager;
//        import java.util.List;
//
//public class GenreRepository extends AbstractRepository<Genre> {
//    public GenreRepository(EntityManager em) {
//        super(em);
//    }
//
//    public List<Genre> findByArtist(Artist artist) {
//        return getEm().createNamedQuery("Album.findByArtist")
//                .setParameter("artist", artist)
//                .getResultList();
//    }
//}

