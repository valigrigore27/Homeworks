package org.example;

import javax.persistence.EntityManager;
import java.util.List;

public class AlbumRepository {
    private EntityManager em;

    public AlbumRepository(EntityManager em) {
        this.em = em;
    }

    public EntityManager getEm() {
        return em;
    }

    public List<Album> findByArtist(Artist artist) {
        return getEm().createNamedQuery("Album.findByArtist")
                .setParameter("artist", artist)
                .getResultList();

    }
    public void create(Album album) {
        getEm().getTransaction().begin();
        getEm().persist(album);
        getEm().getTransaction().commit();
    }

    public Album findById(Long id) {
        return getEm().find(Album.class, id);
    }

    public List<Album> findByName(String name) {
        return getEm().createNamedQuery("Album.findByName")
                .setParameter("name", name)
                .getResultList();
    }
}