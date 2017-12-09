package controle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.security.cert.X509Certificate;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Named
@ViewScoped
public class testeMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String session;

	public void recur() {

		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/casadocodigo/ws/myresource/getStudent");

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void recurID() {

		try {
			String ss = null;
			this.session = Conecta_iDClass(ss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String Conecta_iDClass(String session) throws Exception {
		// método utilizado para ignorar certificado SSL
		Ignore_SSL();
		try {
			URL url = new URL("https://192.168.0.100:443/login.fcgi");
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-type", "application/json");
			conn.setDoInput(true);
			conn.setDoOutput(true);

			OutputStream os = conn.getOutputStream();
			os.write("{\"login\":\"admin\",\"password\":\"admin\"}".getBytes());

			if (conn.getResponseCode() != 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String output, result = "";
				System.out.println("Não conectado");

				while ((output = br.readLine()) != null) {
					System.out.println(result += output);
				}
				throw new RuntimeException("Falha na conexão: " + result);
			} else {

				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String output;
				System.out.println("Conectado, código da sessão: \n");
				while ((output = br.readLine()) != null) {
					session = output;
					System.out.println(output);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}

	// ignorar certificado SSL
	public static void Ignore_SSL() throws Exception {
		// fazendo uma requisição SSL sem registrar o certificado na JVM.
		final X509TrustManager ignore = new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			// "valida" o certificado
			public void checkServerTrusted(X509Certificate[] certs, String authType)
					throws java.security.cert.CertificateException {
				return;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType)
					throws java.security.cert.CertificateException {
				return;
			}
		};

		// cria socket ssl
		SSLContext _ssl = SSLContext.getInstance("SSL");
		_ssl.init(null, new TrustManager[] { ignore }, null);

		// ativa o socket para a requisicao
		HttpsURLConnection.setDefaultSSLSocketFactory(_ssl.getSocketFactory());

		final HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				return true;
			}
		};

		HttpsURLConnection.setDefaultHostnameVerifier(hv);
	}

	public void recurEmpregador() throws Exception {

		System.out.println("Sessao capturada  " + session.substring(12, 36));

		try {
			String str = "https://192.168.0.100:443/load_users.fcgi?session=" +session.substring(12,36);
			URL url = new URL(str);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-type", "application/json");
			conn.setDoInput(true);
			conn.setDoOutput(true);

			OutputStream os = conn.getOutputStream();
			os.write("{\"limit\":100,\"offset\":0}".getBytes());

			if (conn.getResponseCode() != 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String output, result = "";
				System.out.println("Não conectado");

				while ((output = br.readLine()) != null) {
					System.out.println(result += output);
				}
				throw new RuntimeException("Falha na conexão: " + result);
			} else {

				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String output;
				System.out.println("Retorno lista\n");
				while ((output = br.readLine()) != null) {
					
					System.out.println(output);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
