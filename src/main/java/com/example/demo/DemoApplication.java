package com.example.demo;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PartRepository partRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (partRepository.count() == 0 && productRepository.count() == 0) {
			// Adding sample parts
			InhousePart part1 = new InhousePart("Action Figure Arm", 5.0, 100, 1);
			OutsourcedPart part2 = new OutsourcedPart("Board Game Piece", 1.0, 500, "BoardGameInc");
			InhousePart part3 = new InhousePart("Building Block Set", 10.0, 50, 2);
			OutsourcedPart part4 = new OutsourcedPart("Stuffed Animal Eye", 0.5, 300, "StuffedToyCo");
			InhousePart part5 = new InhousePart("Puzzle Piece", 0.2, 1000, 3);

			partRepository.save(part1);
			partRepository.save(part2);
			partRepository.save(part3);
			partRepository.save(part4);
			partRepository.save(part5);

			// Adding sample products
			Product product1 = new Product("Action Figure", 20.0, 50);
			Product product2 = new Product("Board Game", 30.0, 30);
			Product product3 = new Product("Building Blocks", 50.0, 20);
			Product product4 = new Product("Stuffed Animal", 15.0, 80);
			Product product5 = new Product("Puzzle", 10.0, 100);

			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			productRepository.save(product4);
			productRepository.save(product5);
		}
	}
}
