package hibernate;

import java.util.List;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.h2.engine.Session;

public class AlumnoDao {
    
    public void createAlumno(Alumno alumno) throws IllegalStateException, SystemException {
        
        Transaction transaction = null;
        
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(alumno);
            transaction.commit();
        
        }catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List <Alumno> getAlumnos() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Alumno", Alumno.class).list();
        }
    }
    
    public List<Alumno> getAlumnos(String nombre, String apellido) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Alumno s where s.nombre=:nombre and s.apellido=:apellido"
            , Alumno.class).setParameter("nombre", nombre).setParameter("apellido", apellido).list();
        }
    }    
}
