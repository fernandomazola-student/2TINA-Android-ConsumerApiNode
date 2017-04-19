package br.com.fiap.a2tina_android_consumerapinode;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 19/04/2017.
 */

public interface RetrofitDadosInterface {
    @GET("dados")
    Call<Contato> getDados();
}
