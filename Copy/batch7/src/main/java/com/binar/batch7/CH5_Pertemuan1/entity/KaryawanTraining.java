package com.binar.batch7.CH5_Pertemuan1.entity;


import com.binar.batch7.CH5_Pertemuan1.entity.AbstractDate;
import com.binar.batch7.CH5_Pertemuan1.entity.Employee;
import com.binar.batch7.CH5_Pertemuan1.entity.Training;
import lombok.Data;
import org.hibernate.annotations.Where;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "karyawan_training")
@Where(clause = "deleted_date is null")
public class KaryawanTraining extends AbstractDate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private Date tanggal;

    //relasi antar tabel ditandai adanya many to one
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_training")
    private Training training;

    @ManyToOne(cascade = CascadeType.ALL) // FK dari tabel
    @JoinColumn(name = "id_karyawan")
    private Employee karyawan;
}
