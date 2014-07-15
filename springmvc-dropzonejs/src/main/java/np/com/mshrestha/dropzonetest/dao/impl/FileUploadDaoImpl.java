package np.com.mshrestha.dropzonetest.dao.impl;

import java.util.List;

import np.com.mshrestha.dropzonetest.dao.FileUploadDao;
import np.com.mshrestha.dropzonetest.model.UploadedFile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileUploadDaoImpl implements FileUploadDao {

  @Autowired
  private SessionFactory sessionFactory;

  @SuppressWarnings("unchecked")
  public List<UploadedFile> listFiles() {
    return getSession().createCriteria(UploadedFile.class).list();
  }

  public UploadedFile getFile(Long id) {
    return (UploadedFile) getSession().get(UploadedFile.class, id);
  }

  private Session getSession() {
    Session sess = getSessionFactory().getCurrentSession();
    if (sess == null) {
      sess = getSessionFactory().openSession();
    }
    return sess;
  }

  public UploadedFile saveFile(UploadedFile uploadedFile) {
    return (UploadedFile) getSession().merge(uploadedFile);

  }

  private SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
