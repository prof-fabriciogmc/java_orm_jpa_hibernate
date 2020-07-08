/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Usuario;

/**
 *
 * @author fabricio
 */
public class ExemploBasicoCRUD {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
        EntityManager em = emf.createEntityManager();
        
        /* Criação de uma entidade - CREATE */        
        Usuario u0 = new Usuario();
        u0.setNome("Fabrício");
        em.getTransaction().begin();
        em.persist(u0);
        em.getTransaction().commit();
        
        
        /* Recuperação de uma Entidade - RETRIEVE */
        /* por Id:*/
       
//        Usuario u = em.find(Usuario.class, 1L);
//        System.out.println("O nome do usuário escolhido eh: " + u.getNome());
 
        
        
        /* Utilizando JPQL*/
//        Query query = em.createQuery("SELECT u FROM usuario u "); // WHERE u.nome='João' ");
//        List<Usuario> usuarios = query.getResultList();
//        System.out.println("Resultados: ");
//        for(Usuario ui: usuarios){
//            System.out.println("Nome: " + ui.getNome() + " Id: " + ui.getId() );
//        } 
//        
//            
//        
//        /* Atualização de Uma Entidade - UPDATE */
//        /* Versão 1*/
// 

//        Usuario u2 = em.find(Usuario.class, 1L);  
//        em.getTransaction().begin();       
//        u2.setNome("Fabricio Galende"); 
//        em.getTransaction().commit();

//        
        /* Versão 02. */
/*  
        Usuario u2 = em.find(Usuario.class, 1L);
        em.detach(u2);
        u2.setNome("Fabricio Galende Marques de Carvalho");
        em.getTransaction().begin();
        em.merge(u2);
        em.getTransaction().commit();
*/  
        
        /* REMOÇÃO DE UMA ENTIDADE - DELETE */

//        Usuario u3;
//        u3 = em.find(Usuario.class, 2L);
//        em.getTransaction().begin();
//        em.remove(u3);
//        em.getTransaction().commit();

        
        em.close();
        emf.close();        
    }
}
