package br.com.alan.screenmatch.services;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
