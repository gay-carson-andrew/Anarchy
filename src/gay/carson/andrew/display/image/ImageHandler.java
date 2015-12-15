package gay.carson.andrew.display.image;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageHandler {

	static final String imgPath = "./res/img/";
	Image I[][];
	
	public ImageHandler() {
		setup();
		sortImages();
	}
	private void setup() {
		try {
			I = new Image[getFolderCount()][];
			for(int length = 0; length < getFolderCount(); length++) {
				String label = getImageLabel(length);
				I[length] = new Image[getImageFrameCount(length)];
				for(int framelength = 0; framelength < getImagesAsArray(label).length; framelength++) {
					I[length][framelength] = new Image(getImagesAsArray(label)[framelength]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private String getImageLabel(int length) throws IOException {
		return getImagesAsArray()[length].toString().replaceFirst(imgPath,"");
	}
	private Object[] getImagesAsArray() throws IOException {
		return Files.list(Paths.get(imgPath)).toArray();
	}
	private Object[] getImagesAsArray(String label) throws IOException {
		return Files.list(Paths.get(imgPath+label)).toArray();
	}
	private int getImageFrameCount(int length) throws IOException {
		return getImagesAsArray(getImagesAsArray()[length].toString().replaceFirst(imgPath,"")).length;
	}
	private int getFolderCount() throws IOException{
		return (int) Files.list(Paths.get(imgPath)).count();
	}
	private void sortImages() {
		Image I_temp[][] = new Image[I.length][];
		for(int i = 0; i < I.length; i++) {
			I_temp[i] = new Image[I[i].length];
			for(int ii = 0; ii < I[i].length; ii++) {
				I_temp[i][I[i][ii].getFrameID()] = I[i][ii];
			}
		}
		I = I_temp;
		for(int i = 0; i < I.length; i++) {
			for(int ii = 0; ii < I[i].length; ii++) {
				System.out.println(I_temp[i][ii].getName() + I_temp[i][ii].getFrameID());
			}
		}
	}
	public Image getImage(int row, int frame) {
		return I[row][frame];
	}
	public int getFrameCount(int row) {
		return I[row].length;
	}
	
	/*Depreciated*/
	public Image getImage(String name, int frame) {
		for(int i = 0; i < I.length; i++) {
			if(I[i][0].getName().equals(name)) {
				for(int ii = 0; ii < I[i].length; ii++) {
					if(I[i][ii].getFrameID() == frame) {
						return I[i][ii];
					}
				}
			}
		}
		return null;
	}
}
