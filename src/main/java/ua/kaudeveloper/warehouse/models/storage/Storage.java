package ua.kaudeveloper.warehouse.models.storage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import java.util.Objects;

@Entity
public class Storage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

 private long id;
 private long parent;
 private String name;
 private String barcode;
 private double height;
 private double width;
 private double length;
public void setId(long id) {
  this.id = id;
}
public long getId() {
   return id;
} 
public void setParent(long parent) {
  this.parent = parent;
}
public long getParent() {
   return parent;
} 
public void setName(String name) {
  this.name = name;
}
public String getName() {
   return name;
} 
public void setBarcode(String barcode) {
  this.barcode = barcode;
}
public String getBarcode() {
   return barcode;
} 
public void setHeight(double height) {
  this.height = height;
}
public double getHeight() {
   return height;
} 
public void setWidth(double width) {
  this.width = width;
}
public double getWidth() {
   return width;
} 
public void setLength(double length) {
  this.length = length;
}
public double getLength() {
   return length;
} 
  @Override
public String toString() {
return "{"+
"\"id\":"+id+","+
"\"parent\":"+parent+","+
"\"name\":\""+name+"\","+
"\"barcode\":\""+barcode+"\","+
"\"height\":"+height+","+
"\"width\":"+width+","+
"\"length\":"+length+""
+"}";
}

	 @Override
    public int hashCode() {
        return Objects.hash(id,parent,name,barcode,height,width,length);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage obj__ = (Storage) o;
        return Objects.equals(id, obj__.id) &&
Objects.equals(parent, obj__.parent) &&
Objects.equals(name, obj__.name) &&
Objects.equals(barcode, obj__.barcode) &&
Objects.equals(height, obj__.height) &&
Objects.equals(width, obj__.width) &&
Objects.equals(length, obj__.length);

    }

}