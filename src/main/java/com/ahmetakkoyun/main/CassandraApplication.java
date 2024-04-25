package com.ahmetakkoyun.main;

import com.ahmetakkoyun.main.repository.ICyclistCategoryRepository;
import com.ahmetakkoyun.main.repository.entity.CyclistCategory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class CassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(ICyclistCategoryRepository cyclistCategoryRepository) {
		return args -> {

			System.out.println("veriler ilk durum:");
			cyclistCategoryRepository.findAll().forEach(System.out::println);

			CyclistCategory category1 = new CyclistCategory("A", 8, UUID.randomUUID(), "Akkoyun");
			CyclistCategory category2 = new CyclistCategory("B", 5, UUID.randomUUID(), "Ak");
			CyclistCategory category3 = new CyclistCategory("A", 6, UUID.randomUUID(), "Koyun");

			System.out.println("veriler kaydediliyor...");
			cyclistCategoryRepository.saveAll(List.of(category1, category2, category3));
			System.out.println("veriler kaydedildi.");

			System.out.println("veriler son durum:");
			cyclistCategoryRepository.findAll().forEach(System.out::println);

		};
	}
}
