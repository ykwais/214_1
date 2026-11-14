package lab4.composite;

import java.util.ArrayList;
import java.util.List;

public class New {

  interface FileSystemItem{
    String getName();
    long getSize();
    void print(String skip);
  }

  static class File implements FileSystemItem{

    private String name;
    private long size;

    public File(String filename, long size){
      this.size = size;
      this.name = filename;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public long getSize() {
      return size;
    }

    @Override
    public void print(String skip) {
      System.out.println(skip + "\uD83D\uDCC4 " + getName() + " size: " + getSize() + " B");
    }
  }

  static class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> childrens = new ArrayList<>();

    public Folder(String name){
      this.name = name;
    }

    public void addChildren(FileSystemItem item){
      childrens.add(item);
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public long getSize() {
      long total = 0;
      for(FileSystemItem item : childrens){
        total += item.getSize();
      }
      return total;
    }

    @Override
    public void print(String skip) {
      System.out.println(skip + "\uD83D\uDCC1 " + getName() + " size: " + getSize() + " B");
      for(FileSystemItem item : childrens){
        item.print(skip + " ");
      }
    }
  }

  public static void main(String[] args){
    File file1 = new File("file1.txt", 100);
    File file2 = new File("file2.txt", 200);
    File main = new File("Main.java", 300);

    File testFile = new File("Test.java", 500);

    Folder src = new Folder("src");
    Folder test = new Folder("test");

    Folder root = new Folder("root");

    File readme = new File("README.md", 800);

    src.addChildren(file1);
    src.addChildren(file2);
    src.addChildren(main);
    test.addChildren(testFile);
    root.addChildren(readme);
    root.addChildren(src);
    root.addChildren(test);

    root.print("");
  }

}
