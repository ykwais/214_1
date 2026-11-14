package lab4.composite;

import java.util.List;
import java.util.Objects;

public class Old {

  static class File{
    private String name;
    private long size;

    public File(String filename, long size){
      this.name = filename;
      this.size = size;
    }
  }

  static class Folder{
    private String name;
    private List<Object> childrens;

    public Folder(String name, List<Object> listChilds){
      this.name = name;
      this.childrens = List.copyOf(listChilds);
    }

    public long getSize(){
      long total = 0;
      for(Object el : childrens){
        if(el instanceof File){
          total += ((File) el).size;
        } else if (el instanceof Folder){
          total += ((Folder) el).getSize();
        }
      }
      return total;
    }
  }

  public static void main(String[] args){
    File f1 = new File("file1.txt", 100);
    File f2 = new File("file2.txt", 200);
    Folder folder = new Folder("root", List.of(f1, f2));
    System.out.println(folder.getSize());
  }



}
