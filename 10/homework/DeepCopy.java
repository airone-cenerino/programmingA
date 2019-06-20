import java.io.*;
public class DeepCopy {
	
	public static void main(String[] args) {
		copyFileOrDirectory(args[0], args[1]);
	}
	
	public static void copyFileOrDirectory(String srcName, String dstName) {
		File srcFile = new File(srcName);
		if(srcFile.isFile()) {					/* srcFileがファイルの場合*/
			copyFile(srcFile.getAbsolutePath(), dstName);
		} else if(srcFile.isDirectory()) {		/* srcFileがディレクトリの場合 */ 
			File dstDir = new File(dstName);
			dstDir.mkdirs();

			File files[] = srcFile.listFiles();
			for (File file : files) {
				copyFileOrDirectory(srcName + "/" + file.getName(), dstName + "/" + file.getName());				
			}
		}
	}
	
	public static void copyFile(String srcName, String dstName) {
		int data = 0;
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new BufferedInputStream(new FileInputStream(srcName));
				os = new BufferedOutputStream(new FileOutputStream(dstName));
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			try{
				is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				os.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

} 