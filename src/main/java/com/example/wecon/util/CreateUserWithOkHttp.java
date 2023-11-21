package com.example.wecon.util;

import com.example.wecon.dto.UserDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import com.google.gson.Gson;
import okhttp3.*;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class CreateUserWithOkHttp {

    public static void sendPostRequest() {
        String apiUrl = "http://localhost:8080/api/users";

        // Создание объекта пользователя
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("adziri");
        userDTO.setEmail("user@example.com");
        userDTO.setPhoneNumber("123456789");
        userDTO.setDateOfBirth(new Date(2002, Calendar.JUNE, 30));
        userDTO.setRegistrationDate(LocalDateTime.parse("2023-01-01T12:00:00"));
        userDTO.setLastLogin(LocalDateTime.parse("2023-01-01T12:30:00"));
        userDTO.setName("Nikita");
        userDTO.setSurname("Liubov");
        userDTO.setAge(21);


        // Преобразование пользователя в JSON-строку
        Gson gson = new Gson();
        String jsonRequestBody = gson.toJson(userDTO);

        // Отправка POST запроса с использованием OkHttp
        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), jsonRequestBody);

        Request request = new Request.Builder()
                .url(apiUrl)
                .post(requestBody)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println("User added successfully");
            } else {
                System.out.println("Error: " + response.code() + " - " + response.message());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
