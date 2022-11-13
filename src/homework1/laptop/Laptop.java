package homework1.laptop;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Laptop {
    private String brand_series;
    private double screen_size;
    private String color;
    private int hard_disk_size;
    private String cpu_model;
    private int ram_memory;
}
