package com.binar.batch7.CH3_Pertemuan2_Optional;

import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private Optional<DetailProduct> detailProduct;

}
