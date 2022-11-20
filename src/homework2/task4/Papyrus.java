package homework2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class Papyrus {

    private Write write;
    private Read read;
    private Page page;
    private Material material;
    private Pages pages;

}
