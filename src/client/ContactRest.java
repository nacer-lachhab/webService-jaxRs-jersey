package client;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Contact;

public class ContactRest {

	public static void main(String[] args) {
		URL urlService;
		try {
			urlService = new URL("http://localhost:8080/WSContactRest/lesContacts/getContacts");
			HttpURLConnection urlCnx = (HttpURLConnection) urlService.openConnection();
			urlCnx.setRequestMethod("GET");
			InputStream in = new BufferedInputStream(urlCnx.getInputStream());
			Scanner sc = new Scanner(in);
			Gson gson = new GsonBuilder().create();
			final Contact[] lesContacts = gson.fromJson(sc.nextLine(),Contact[].class);
			System.out.println("-------- Liste des Contacts ------");
			for(Contact c : lesContacts)
				System.out.println("\t"+c.getIdContact()+"\t"+c.getNom()+"\t"+c.getPrenom());
			System.out.println("----------------------------");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
