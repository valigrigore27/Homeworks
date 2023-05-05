package org.example;

import javax.persistence.EntityManager;
import java.util.List;

public class ArtistRepository {
    private EntityManager em;

    public ArtistRepository(EntityManager em) {
        this.em = em;
    }

    public EntityManager getEm() {
        return em;
    }

    public void create(Artist artist) {
        getEm().getTransaction().begin();
        getEm().persist(artist);
        getEm().getTransaction().commit();
    }

    public Artist findById(Long id) {
        return getEm().find(Artist.class, id);
    }

    public List<Album> findByName(String name) {
        return getEm().createNamedQuery("Artist.findByName")
                .setParameter("name", name)
                .getResultList();
    }
}
