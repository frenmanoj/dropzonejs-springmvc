package np.com.mshrestha.dropzonetest.dao;

import java.util.List;

import np.com.mshrestha.dropzonetest.model.UploadedFile;

public interface FileUploadDao {

  List<UploadedFile> listFiles();

  UploadedFile getFile(Long id);

  UploadedFile saveFile(UploadedFile uploadedFile);

}
