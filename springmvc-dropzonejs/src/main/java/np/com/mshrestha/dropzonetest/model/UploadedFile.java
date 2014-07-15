package np.com.mshrestha.dropzonetest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uploaded_file")
public class UploadedFile {

  private Long id;
  private String name;
  private String location;
  private Long size;
  private String type;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  @Column(nullable = false)
  public String getName() {
    return name;
  }

  @Column(nullable = false)
  public String getLocation() {
    return location;
  }

  @Column()
  public Long getSize() {
    return size;
  }

  @Column(nullable = false)
  public String getType() {
    return type;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public void setType(String type) {
    this.type = type;
  }
}
