/**
 * Directory
 */
public class Directory extends File {

    File files[] = new File[10];
    int fileNum = 0;

    Directory(String name) {
        super(name, 1);
    }

    void add(File file) {
        if (fileNum >= 10)
            return;

        files[fileNum] = file;
        fileNum++;
    }

    public int getSize() {
        int directorySize = 0;
        for (int i = 0; i < fileNum; i++) {
            directorySize += files[i].getSize();
        }
        return directorySize + size;
    }
}