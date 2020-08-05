package space.devport.wertik.blockgenerators.system.preset.struct;

import lombok.Data;
import space.devport.utils.item.Amount;

@Data
public class GeneratorUpgrade {

    private GeneratorPreset into;

    private Amount exp;

    private Amount money;

    private Amount tokens;
}