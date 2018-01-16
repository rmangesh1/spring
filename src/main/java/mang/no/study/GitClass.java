package mang.no.study;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by mrana on 16.01.2018.
 */
public class GitClass {

    public static void main(String[] args) throws GitAPIException, IOException {

        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        Credentials credentials = new UsernamePasswordCredentials("mrana", "14May!982");
        credentialsProvider.setCredentials(AuthScope.ANY, credentials);
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(credentialsProvider).build();
        HttpGet reqHttpGet = new HttpGet("https://bitbucket.nets.no:8443/rest/api/1.0/projects/NO/repos");
        HttpResponse httpResponse = httpClient.execute(reqHttpGet);

        StringWriter writer = new StringWriter();
        IOUtils.copy(httpResponse.getEntity().getContent(), writer, "UTF-8");
        System.out.println(writer.toString());

        /*File file = new File("C:\\Users\\mrana\\test");
        System.out.println("Start");
        Git.cloneRepository().setURI("ssh://git@bitbucket.nets.no:29481/no/transhist-nordea-batch.git").setDirectory(file)
                .setCredentialsProvider(new UsernamePasswordCredentialsProvider("mrana@nets.eu","14May!982"))
                .call();
        System.out.println("Done");*/
    }
}
