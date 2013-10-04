import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class perpustakaanmain {
	public static void main(String[] args) {
		File file = new File
	("D:/praktikum/perpustakaan.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		List<Perpustakaan> listperpustakaan = new
	ArrayList
		<Perpustakaan>();
		
		try {
				fis =  new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				dis = new DataInputStream(bis);
				
				while(dis.available() != 0){
						//memecah text perbaris menjadi beberapa kolom sesuai dengan pemisah koma
				String line = dis.readLine();
				String[] data = line.split(",");
				
				Perpustakaan p = new Perpustakaan();
				p.setId(data[0]);
				p.setPeminjam(data[1]);
				p.setJudul(data[2]);
				
				listperpustakaan.add(p);
			}
		}

	catch (IOException ex){
		System.out.println(" File " + file.getName() + "tidak ketemu !");
		System.out.println("Exception : " + ex.getMessage());
	}
		for (Perpustakaan perpus : listperpustakaan) {
			System.out.println("===============================");
			System.out.println("ID : " + perpus.getId());
			System.out.println("penyewa : " + perpus.getPeminjam());
			System.out.println("judul : " + perpus.getJudul());
			}
		}
	}