package com.binar.batch7.CH3_Pertemuan2_Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DetailProduct {
    private String description;
    private Optional<Category> category;

}
