package com.example.notificationapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentDTO {
    private String userId;
    private String text;
    private String brandName;
    private String email;
}
