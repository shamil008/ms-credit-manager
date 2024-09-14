package org.example.mscreditmanager.model.client;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConveyorResponseDto {
    private Long conveyorId;
    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    private LocalDateTime checkDate;
    private List<Products> products;

}
