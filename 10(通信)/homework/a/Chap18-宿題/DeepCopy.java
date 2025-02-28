import java.io.*;
public class DeepCopy {
	
	public static void main(String[] args) {
		copyFileOrDirectory(args[0], args[1]);
	}
	
	public static void copyFileOrDirectory(String srcName, String dstName) {
		File srcFile = new File(srcName);
		if( ・・・ /* srcFileがファイルの場合*/ ) {
			copyFile(srcFile.getAbsolutePath(), dstName);
		} else if( ・・・ /* srcFileがディレクトリの場合 */ ) {
			File dstDir = new File(dstName);
			dstDir.mkdirs();
			/*
			 * srcFile から配下のファイルやディレクトリの一覧を得て、
			 * それぞれについて copyFileOrDirectoryの再帰呼び出し。
			 */
			・・・
		}
	}
	
	public static void copyFile(String srcName, String dstName) {
		/*
		 * FileCopy を参考にして、srcNameで指定されるファイルの内容を
		 * dstName で示されるファイルに書き出す。
		 */
	}

} 