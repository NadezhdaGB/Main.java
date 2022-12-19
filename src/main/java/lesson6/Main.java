package lesson6;

import okhttp3.*;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();
                //При отправке запросов к API добавляйте значение полученного ключа в заголовок X-Yandex-API-Key: <значение ключа>
//координаты центра СПб – 59° 57' северной широты и 30° 19'

        /*HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("informers")
                .addQueryParameter("lat", 50.57)
                .addQueryParameter("lon", 30.19)
                .addQueryParameter("lang", "ru_RU")

            .build();*/

        Request requestHttpYandex = new Request.Builder()
                //.addHeader("accept", "application/json")
                .addHeader("X-Yandex-API-Key", "c9b90526-b472-4798-968f-18580a76365d")
                //.url("https://api.weather.yandex.ru/v2/informers?lat=55.75396&lon=37.620393")
                .url("https://api.weather.yandex.ru/v2/informers?lat=50.57&lon=30.19&lang=ru_RU")
                .build();

        /*Response response = client.newCall(requestHttpYandex).execute();
        String body = response.body().string();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body());*/

        String jsonResponse = client.newCall(requestHttpYandex).execute().body().string();
        System.out.println(jsonResponse);


    }
}
