package np.com.mshrestha.dropzonetest.service;

import java.util.List;

import np.com.mshrestha.dropzonetest.model.UploadedFile;

public interface FileUploadService {

  List<UploadedFile> listFiles();

  UploadedFile getFile(Long id);

  UploadedFile saveFile(UploadedFile uploadedFile);

}
