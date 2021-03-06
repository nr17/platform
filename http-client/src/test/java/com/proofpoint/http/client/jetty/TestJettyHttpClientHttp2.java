package com.proofpoint.http.client.jetty;

import com.proofpoint.http.client.HttpClientConfig;

public class TestJettyHttpClientHttp2
        extends TestJettyHttpClient
{
    @Override
    protected HttpClientConfig createClientConfig()
    {
        return super.createClientConfig()
                .setHttp2Enabled(true);
    }
}
