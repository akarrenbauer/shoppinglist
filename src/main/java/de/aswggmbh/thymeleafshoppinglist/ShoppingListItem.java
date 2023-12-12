package de.aswggmbh.thymeleafshoppinglist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
public class ShoppingListItem {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		private @NotBlank @Size(max = 100) String name;
		private @PositiveOrZero int demand;
		private @PositiveOrZero int supply;
		
		public ShoppingListItem() {
			this.name = "";
			this.demand = 1;
			this.supply = 0;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDemand() {
			return demand;
		}
		public void setDemand(int demand) {
			this.demand = demand;
		}
		public int getSupply() {
			return supply;
		}
		public void setSupply(int supply) {
			this.supply = supply;
		}
		
		
}
